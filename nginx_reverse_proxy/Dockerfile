FROM nginx:1.21.6

RUN apt-get update && apt-get upgrade -y

COPY index.html /usr/share/nginx/html
RUN rm /etc/nginx/conf.d/default.conf
COPY default.conf /etc/nginx/conf.d/default.conf

