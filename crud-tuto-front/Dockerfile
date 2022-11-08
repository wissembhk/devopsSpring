
# Generate the build of the application
RUN npm run build


# Stage 2: Serve app with nginx server

# Use official nginx image as the base image
# Copy the build output to replace the default nginx contents.
FROM nginx:1.17.1-alpine
COPY nginx.conf /etc/nginx/nginx.conf
COPY /dist/crudtuto-Front /usr/share/nginx/html

# Expose port 80
EXPOSE 4200