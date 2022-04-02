Run
```
docker build -t calevin/nginx_server:1.0 .

docker network create internal-network

docker run -d --network internal-network --name nginx-server-a --hostname server_a calevin/nginx_server:1.0
```
