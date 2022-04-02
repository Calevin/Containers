Run
```
docker build -t calevin/nginx_reverse_proxy:1.0 .

docker network create internal-network

docker run -d --network internal-network --name nginx-reverse-proxy -p 8080:80 calevin/nginx_reverse_proxy:1.0
```
