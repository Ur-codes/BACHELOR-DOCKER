set version=%1%
docker run -dp 3000:3000 --mount type=bind,source=C:\tmp\todo,target=/etc/todos todo:%version%