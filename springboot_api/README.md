Run
```
docker build -t calevin/springboot_api:1.0 .

docker network create internal-network

docker run -d --network internal-network --name springboot-api-a --hostname springboot_api_a calevin/springboot_api:1.0
```
