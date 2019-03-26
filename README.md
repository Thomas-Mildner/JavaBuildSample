# Java Build Sample

![Build Status](https://gitlab.com/jonny990421/javabuildsample/badges/master/pipeline.svg)
![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)
![coverage report](https://gitlab.com/jonny990421/javabuildsample/badges/master/coverage.svg)


A small demo program to show the functionality of the CI Pipeline in Gitlab

The detailed coverage report can be accessed under https://jonny990421.gitlab.io/javabuildsample/


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

