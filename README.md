# Bilyoner Test Automation Challenge

## About
Tests Login, Add Coupon, Play Coupon, Delete Coupon

## Running

```bash
git clone https://github.com/ahmetbabacan8842/bilyonerChallenge.git
cd bilyoner-challenge
mvn clean test
```

## Failed Tests Screenshots
```bash
cd target/bilyoner.jpg
```

## Multi Platform

Also it can be run on Chrome or Firefox or ANDROID if requested, you just need to change the platform from the `src/test/resources/config.json` file or give a JVM parameter to mvn command, for example:
```bash
mvn clean test -Dplatform=firefox
mvn clean test -Dplatform=chrome
mvn clean test -Dplatform=android
```
