pipeline 
{
    agent any
    environment {
        EMAIL_TO = 'wissem22111@gmail.com'
        registry='wissembhk/spring'
        registryCredential=''
        dockerImage=''
    }
    post{
         failure {
            emailext body: 'Check console output at $BUILD_URL to view the results. \n\n ${CHANGES} \n\n -------------------------------------------------- \n${BUILD_LOG, maxLines=100, escapeHtml=false}', 
                    to: "${EMAIL_TO}", 
                    subject: 'Build failed in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER'
        }
        
    }
   
    stages
    {
        stage('git clone back')
        {
            steps
            {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/wissembhk/devopsSpring']]])
            }
            
        }
        stage('compile')
        {
            steps
            {    
                sh ' mvn compile'
            }
        }
        
        stage('clean install')
        {
            steps
            {
                sh ' mvn clean install -Dmaven.test.skip=true'
            }
        }
        
         stage('Junit')
        {
            steps
            {
                sh ' mvn test'
            }
        }
        stage('sonar')
        {
            steps
            { 
               sh """ mvn sonar:sonar \
                -Dsonar.projectKey=devopsspring \
                -Dsonar.host.url=http://44.212.25.105:9000/ \
                -Dsonar.login=64d37d5e4a8c1ec249ae2effb1beb863a753e148"""
            }
        } 
        stage('clean package')
        {
            steps
            { 
               sh ' mvn clean package'
            }
        }
        stage('Nexus')
        {
            steps
            { 
               sh ' mvn deploy -DskipTests'
            }
        } 
       /* stage('npm install')
            {
                steps
                {
                    sh 'cd ./crud-tuto-front && npm i --force'
                }
            }*/
      
         stage('building docker image')
        {
            steps
            {
                script
                {
                    dockerImage=docker.build registry+":$BUILD_NUMBER"
                  // sh 'docker build -t wissembhk/project .'
                }
            }
        }
        stage("Login to DockerHub") {
                steps{

                    sh 'docker login -u wissembhk -p Wi123052993021@'
                }
        }
        stage('docker hub')
         {
             steps{
                 script{
                                      dockerImage.push()

                 }
             }
         }
       
        
        stage('image up')
        {
            steps{
                sh 'docker-compose up -d'
            }
        }
       
       
        
        
    }
}

