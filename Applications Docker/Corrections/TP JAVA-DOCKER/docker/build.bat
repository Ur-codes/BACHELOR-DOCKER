@echo OFF
set version=%1%
set image=multiplier

@echo Build version : %image%:%version%
docker build -f %image%.docker -t %image%:%version% .

docker images | findstr %image%