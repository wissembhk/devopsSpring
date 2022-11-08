FROM nginx:1.15.8
EXPOSE 4200
COPY nginx.conf /etc/nginx/conf.d/
COPY ./dist /usr/share/nginx/html
CMD ["nginx", "-g", "daemon off;"]