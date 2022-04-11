# Multiplier Java  
# Example de conteneurisation d'une application Java   
    
## Modification de l'application  
 - Modifier le programme Java
 - Génerer le fichier **multiplier.jar** (artefact de livraison)
 	. executer **cjar.bat**   
 	
## Génération/Modification de l'image Docker
 - build.bat [flag version] 
 	. build.bat 1.2 -> Génére l'image **multiplier:1.2**
 	
## Executionde l'image Docker
- run.bat [flag version] \[parametre\]  
	. run.bat 1.2 -> execute l'image **multiplier:1.2**  
	. parametres :  
--i  lance la version interactive de l'application  
--n 7 lance la version batch avec 7 en paramètre, la table des 7 est générée   

Exemples : 
**run 1.0  (lance l'application en mode interactif) **   
**run 1.0 11 (lance l'application qui génére automatiquement la table des 11) **  


