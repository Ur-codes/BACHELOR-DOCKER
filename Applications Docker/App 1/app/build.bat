set version=%1%
docker build -f .\todo.docker -t todo:%version% .