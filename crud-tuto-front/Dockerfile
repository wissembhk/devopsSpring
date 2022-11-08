
# Stage 1

FROM node:14.15.4 as node
WORKDIR /app
COPY . .

# Stage 2
FROM nginx:alpine

COPY --from=node /app/dist/crudtuto-Front /usr/share/nginx/html
CMD ["npm","run"."ng build"] 
CMD ["npm","run"."ng serve"]