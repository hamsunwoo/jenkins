#!/bin/bash

#Start the application
nohup java \
    -jar build/libs/demo-0.0.1-SNAPSHOT.jar &

echo "> Application started with PID $!"
