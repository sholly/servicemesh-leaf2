build docker image:
`docker build -t servicemesh-leaf2 . `

running:

first create network:
`docker network create meshtest`

Run with 'docker' profile and meshtest network
```
docker run -it -p 8082:8082 --network meshtest -e  SPRING_PROFILES_ACTIVE=docker\
 --rm --name servicemesh-leaf2 servicemesh-leaf2
```