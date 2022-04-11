
@echo OFF
set version=%1%
@echo Build version : %version%

docker build -f apache.docker -t ubuntu-apache:%version%% . 
docker images