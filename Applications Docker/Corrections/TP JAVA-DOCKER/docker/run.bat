@echo OFF
set version=%1%
set number=%2%

set image=multiplier

@echo Run Image version : %image%:%version%

docker stop %image% & docker rm %image%

if %number%.==. (
	docker run -it --name %image% %image%:%version% --i
) else (
	docker run -it --name %image% %image%:%version% --n %number%
)

