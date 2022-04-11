set version=%1%
docker build -f .\appjava.docker -t java:%version% .
