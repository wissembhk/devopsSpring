FROM nginx:1.15.8
EXPOSE 4200
COPY nginx.conf /etc/nginx/conf.d/
RUN rm -rf /usr/share/nginx/html/
COPY --from=builder /dist/ /var/www/html/
CMD ["nginx", "-g", "daemon off;"]