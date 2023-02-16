## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## travail à faire

Truck à faire: 

-Class:
        -class de donjon
        -class Hero, monstres, ennemies
        -class pour armes, potion, artefacts et coffre
        -class input, output (c'est pour les commentaire et que le hero dit son nom, avoir une sorte d'intéraction entre la console et le hero)
        -class Main 
        -class Combats

Pour la map (Donjon):

-création de la map avec des cordonées (avec bordure autour de la map). 

-dans la map il doit avoir un ou plusieurs coffre, un hero, des monstres. (il auront une place définie) CEST FAIT

-Déplacement sur la map Gauche, droite, haut, bas. (Pour les Heros) (peut etre des énumération)

Pour le Hero:

-Combat entre le Hero et les monstres, Boss... (tour par tour)

-Capacité du Héro augmente après des combat
comme capacité:
    -Expérience de combat
    -Attaque
    -Defence
    -Point de vie
    -Vélocité

-Hero à un inventaire
    -il pourra avoir des arme, artefacts 
    -il pourra les changer son arme ou le artefacts par d'autres
    -inventaire 2 armes max, 3 aetefacts, 5 potion

Pour les Combats:

-il faut déterminer qui attaque selon c'est capacité

-Combats terminer quand l'un des deux combattant est mort

-les actions possible lors du combats tour par tour sont (attaquer, prendre une potion, comme Pokemon)

