
# Stage 1

FROM node:16.3.0-alpine as node
WORKDIR /app
COPY . .

# Stage 2
FROM nginx:alpine
RUN ng build
RUN ng serve

COPY --from=node /app/dist/crudtuto-Front /usr/share/nginx/html
CMD ["npm","run","ng","serve"]