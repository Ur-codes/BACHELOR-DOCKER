## Corrigé du T.P Ubuntu - Server Apache  
<div align="center">Scripts</div>  

Dans le repertoire vous trouverez 2 scripts permettant de :  
1/ Build une nouvelle image : build.bat [tag de l'image]  
    - Exemple : build.bat 1.1 -> génére l'image ubuntu-apache:1.1  
2/ Run de l'image : run.bat [tag de l'image]  
    - Exemple : run.bat 1.1 -> run l'image ubuntu-apache:1.1 (avec port 80 du conteneur mappé sur le port 82 du host)  
