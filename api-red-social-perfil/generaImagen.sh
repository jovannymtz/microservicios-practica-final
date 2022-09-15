#!/usr/bin/env sh

mvn -f pom.xml clean install -DskipTests=true docker:build
