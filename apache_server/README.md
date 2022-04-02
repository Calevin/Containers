Run
```
docker build -t calevin/apache_server:1.0 .

docker network create internal-network

docker run -d --network internal-network --name apache-server-a --hostname server_a calevin/apache_server:1.0
```

