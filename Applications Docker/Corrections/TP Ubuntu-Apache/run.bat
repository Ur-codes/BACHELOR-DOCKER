
@echo OFF
set version=%1%
@echo Run version : %version%

docker run -d --name apache -p 82:80 ubuntu-apache:%version%