
# Stage 1

FROM node:16.3.0-alpine as node
WORKDIR /app
COPY . .

# Stage 2
FROM nginx:alpine
RUN npm install
RUN npm run ng build
RUN npm run ng serve
