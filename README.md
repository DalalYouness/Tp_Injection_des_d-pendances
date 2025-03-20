# Projet : Injection de Dépendances et Couplage Faible

## Objectif du Projet

Ce projet a pour objectif de démontrer les concepts de **couplage faible** et d'**injection de dépendances** en Java. Il illustre comment créer des interfaces, les implémenter, et injecter des dépendances de différentes manières :

1. **Couplage faible** : En utilisant des interfaces pour découpler les composants.
2. **Injection de dépendances** :
   
   - Par **instanciation statique**.
   - Par **instanciation dynamique**.
   - En utilisant le **framework Spring** :
     
     - Configuration par **XML**.
     - Configuration par **annotations**.

Ce projet sert de base pour comprendre comment structurer une application modulaire, facile à maintenir et à tester, en évitant les dépendances directes entre les composants.

## Technologies Utilisées
- Java
- Spring Framework (spring-context/spring-beans/spring-core)

## Structure du Projet
Le projet est organisé en plusieurs packages pour séparer les responsabilités :
- `dao` : Contient l'interface `IDao` et son implémentation.
- `metier` : Contient l'interface `IMetier` et son implémentation.
- `extention` : Contient une deuxieme implémentation de l'interface "IDao" pour appliquer le principe du(application fermer à la modification , ouverte à l'extention) .
- `présentation` : Contient les classes principales pour démontrer les différentes méthodes d'injection de dépendances.
