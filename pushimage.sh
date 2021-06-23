#!/bin/sh 
docker tag servicemesh-leaf2:latest docker.io/sholly/servicemesh-leaf2:jaeger
docker push docker.io/sholly/servicemesh-leaf2:jaeger
