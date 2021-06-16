#!/bin/sh 
docker run -d -p 8082:8082 --network meshtest -e  SPRING_PROFILES_ACTIVE=docker \
 --rm --name servicemesh-leaf2 servicemesh-leaf2
