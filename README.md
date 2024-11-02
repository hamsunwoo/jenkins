### jenkins
- http://localhost:8080

### Run
```bash
$ ./gradlew bootRun
```

```bash
$ ./gradlew build
$ java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```

### Docker
```bash
$ docker build -t hamsunwoo/demo:temurin .
$ docker run -d --name temurin -p 8080:8080 hamsunwoo/demo:temurin
```

### Docker compose
```bash
$ docker compose up -d --force-recreate --build
$ docker compose stop
$ docker compose start
$ docker compose ls
$ docker compose  down
```

### CRUD
