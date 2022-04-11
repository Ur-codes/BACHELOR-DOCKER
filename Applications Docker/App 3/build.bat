set version=%1%
docker build -f .\tpmysql.docker -t mysql:%version% .
docker images