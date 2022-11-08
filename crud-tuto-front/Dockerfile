FROM nginx:1.15.8
EXPOSE 80
COPY nginx.conf /etc/nginx/conf.d/
RUN rm -rf /usr/share/nginx/html/*
RUN yum install --no-install-recommends apt-utils --yes \
    && yum install --no-install-recommends npm --yes
RUN npm run ng build
COPY ./dist /usr/share/nginx/html
CMD ["nginx", "-g", "daemon off;"]