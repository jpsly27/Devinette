# Jeu de Devinettes

Ce projet est un simple jeu de devinettes développé en Java. L'objectif est de deviner un nombre secret choisi aléatoirement par l'ordinateur.

## Fonctionnalités

- Génération d'un nombre aléatoire entre 1 et 100.
- L'utilisateur a 10 essais pour deviner le nombre.
- Des indices sont fournis après chaque essai (plus haut / plus bas).
- Le jeu indique si l'utilisateur a gagné ou perdu.

## Comment jouer

1.  Exécutez le programme `GuessingGame.java`.
2.  Le jeu vous demandera de saisir un nombre.
3.  Entrez votre supposition et appuyez sur Entrée.
4.  Suivez les indices ("Trop haut !", "Trop bas !") pour ajuster votre prochaine supposition.
5.  Essayez de deviner le nombre en 10 essais ou moins !

## Installation et Exécution

Ce projet peut être facilement importé et exécuté dans n'importe quel environnement de développement Java (IDE) comme IntelliJ IDEA, Eclipse ou VS Code.

### Prérequis

-   Java Development Kit (JDK) 8 ou plus récent installé sur votre machine.

### Étapes pour importer et exécuter le projet (via IntelliJ IDEA)

1.  **Cloner le dépôt :**
    Ouvrez IntelliJ IDEA. Sur l'écran de bienvenue, cliquez sur **"Get from VCS"** (ou `File > New > Project from Version Control...` si un projet est déjà ouvert).
    Collez l'URL HTTPS de ce dépôt :
    `https://github.com/VotreNomUtilisateur/GuessingGame.git` (remplacez `VotreNomUtilisateur` par votre nom d'utilisateur GitHub).
    Choisissez un répertoire local pour le projet et cliquez sur **"Clone"**.

2.  **Ouvrir le projet :**
    Une fois cloné, IntelliJ IDEA devrait automatiquement détecter qu'il s'agit d'un projet Java. S'il demande, sélectionnez "Open as Project".

3.  **Exécuter le jeu :**
    - Naviguez jusqu'au fichier `src/GuessingGame.java` dans l'explorateur de projet.
    - Cliquez avec le bouton droit de la souris sur le fichier `GuessingGame.java`.
    - Sélectionnez **"Run 'GuessingGame.main()'"**.

Le jeu s'exécutera dans la fenêtre de la console d'IntelliJ IDEA.

## Structure du Projet
