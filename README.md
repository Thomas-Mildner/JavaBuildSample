# Java Build Sample

![Build Status](https://gitlab.com/jonny990421/javabuildsample/badges/master/pipeline.svg)
![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)
![coverage report](https://gitlab.com/jonny990421/javabuildsample/badges/master/coverage.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Java_BuildSample&metric=alert_status)](https://sonarcloud.io/dashboard?id=Java_BuildSample)

A small demo program to show the functionality sonarqube analysis

## Deployment

### Build Project
Execute the gradle Tasks
```
gradle build
```

### Unit Tests
Excecute the unit Tests
```
gradle test
```

### Generate Jacoco Test Coverage Report
Excecute this script to generate the coverage report
```
gradle test jacocoTestReport
```

The coverage report can be found at /build/reports/jacoco/test/html/index.html

### Run Code Analysis

Run Code Analysis with local docker Sonarqube server

#### Pull Docker image from Docker Hub
```
docker pull jonny9904/docker-sonarqube-custom_profile
```

#### Start Docker Container from image
```
docker run -d --name docker-sonarqube-custom_profile -p 9000:9000 jonny9904/docker-sonarqube-custom_profile
```
#### Generate Access Token
Visit http://localhost:9000/account/security/

User: admin
Password: admin




```
gradle sonarqube
```

Report can be accessed on SonarCloud.io Page
https://sonarcloud.io/dashboard?id=Java_BuildSample
