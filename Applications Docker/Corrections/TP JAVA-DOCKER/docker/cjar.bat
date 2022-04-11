
del /F /Q multiplier.jar
pushd ..\bin
jar -cvf ..\docker\multiplier.jar .
popd