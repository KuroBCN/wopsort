#!/usr/bin/env bash
mkdir -p out/main && javac src/*.java -d out/main && java -cp out/main Main "$@"