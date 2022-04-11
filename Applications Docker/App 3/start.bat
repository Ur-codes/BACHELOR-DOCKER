set version=%1%
docker run -d --name mysql -p3306:3306 -v C:\tmp\tpmysql:/var/lib/mysql mysql:%version%