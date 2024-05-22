# Projet Java Spring : Jeux MIAGiques

# Contexte de l’application à réaliser :
Le but de ce projet est de concevoir et développer une application pour les Jeux MIAGiques 2024, version « marathon » des Jeux Olympiques puisqu’il peut y avoir des épreuves tout au long de l’année. Cette application doit permettre à des spectateurs de réserver des billets pour assister aux différentes épreuves, aux participants de s'inscrire aux épreuves pour défendre leur délégation et aux organisateurs de vérifier les billets, de superviser les événements et de maintenir à jour les classements

# Configuration
Ce TP utilise une base de données MySQL qu'on peut créer sous Docker avec la commande : docker run --name=BDMIAGiques -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=MIAGiques -p 3306:3306 mysql
