FROM nginx:1.15.8
EXPOSE 4200
COPY nginx.conf /etc/nginx/conf.d/
RUN rm -rf /usr/share/nginx/html/
COPY dist/crudtuto-Front /usr/share/nginx/html
CMD ["nginx", "-g", "daemon off;"]