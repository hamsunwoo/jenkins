#!/bin/bash

echo "DOCKER BUILD"
docker build -t hamsunwoo/demo:0.2.0 .

echo "DOCKER STOP"
docker stop demo002

echo "DOCKER RM"
docker rm demo002

echo "DOCKER RUN"
docker run --name demo002 -p 8080:8080 -d hamsunwoo/demo:0.2.0

echo "DONE"
