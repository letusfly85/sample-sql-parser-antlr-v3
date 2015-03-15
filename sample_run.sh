#!/bin/bash

export CLASSPATH=antlr-runtime-3.4.jar:antlr-3.4-complete.jar:./

java org.antlr.Tool MyLexer.g
java org.antlr.Tool MySelect.g

javac *java
java Test < test.sql

