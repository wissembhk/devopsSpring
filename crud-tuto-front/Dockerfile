FROM node:12.14-alpine AS build
WORKDIR /app
COPY / ./
COPY package*.json ./

RUN npm install -g @angular/cli@12.0.5 && \
    npm install 
    
COPY . .
FROM nginx:1.17.1-alpine
WORKDIR /app
COPY  ./dist/crudtuto-Front /usr/share/nginx/html