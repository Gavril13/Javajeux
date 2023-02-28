import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------" + " Gavril Jeux-Java " + "-------------");
        int[][] mur = {
            {0,0},{0,1},{0,2},{0,3},{0,4},{0,5},{0,6},{0,7},{0,8},{0,9},//haut
            {1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},// gauche
            {9,0},{9,1},{9,2},{9,3},{9,4},{9,5},{9,6},{9,7},{9,8},{9,9}, //bas
            {1,9},{2,9},{3,9},{4,9},{5,9},{6,9},{7,9},{8,9}, //droite
            {4,1},{2,3},{2,4},{3,3},{3,4},{6,2},{6,3},{6,4},{1,7},{2,7},{3,7},{7,7},{8,7},{8,8},{8,3}//mur dans la map (latitude, longitude)
        };

        int[][] arene = {
            
            {1,0},{1,1},{1,2},{1,3},{1,4},{1,5},{1,6},{1,7},{1,8},{1,9}, //Déplacement du joueur
            {2,0},{2,1},{2,2},{2,3},{2,4},{2,5},{2,6},{2,7},{2,8},{2,9},
            {3,0},{3,1},{3,2},{3,3},{3,4},{3,5},{3,6},{3,7},{3,8},{3,9},
            {4,0},{4,1},{4,2},{4,3},{4,4},{4,5},{4,6},{4,7},{4,8},{4,9},
            {5,0},{5,1},{5,2},{5,3},{5,4},{5,5},{5,6},{5,7},{5,8},{5,9},
            {6,0},{6,1},{6,2},{6,3},{6,4},{6,5},{6,6},{6,7},{6,8},{6,9},
            {7,0},{7,1},{7,2},{7,3},{7,4},{7,5},{7,6},{7,7},{7,8},{7,9},
            {8,0},{8,1},{8,2},{8,3},{8,4},{8,5},{8,6},{8,7},{8,8},{8,9},
            {9,0},{9,1},{9,2},{9,3},{9,4},{9,5},{9,6},{9,7},{9,8},{9,9}
        };

        Hero hero1 = new Hero(1, 1, 15,15, 100, 8, 20,0); //Caractéristiques

        Scanner in = new Scanner(System.in);
        Interaction interaction = new Interaction();
        interaction.start(in, hero1);

        Monstre monstre1 = new Monstre(10, 10, 100, 5, 20, 5, 1); //Caractéristiques

        Monstre monstre2 = new Monstre(10, 10, 100, 5, 20, 1, 6); //Caractéristiques

        Monstre monstre3 = new Monstre(10, 10, 100, 5, 20, 5, 6); //Caractéristiques

        Monstre monstre4 = new Monstre(10, 10, 100, 5, 20, 8, 5); //Caractéristiques

        Coffre coffre1 = new Coffre(1, 1, 0, 1, 3); //Caractéristiques

        Coffre coffre2 = new Coffre(1, 0, 1, 8, 1); //Caractéristiques

        Coffre coffre3 = new Coffre(0, 1, 1, 8, 7); //Caractéristiques

        Boss boss1 = new Boss(50, 50, 800, 80, 200, 2, 8); //Caractéristiques
            
        while (true){
            //Positionnement
            int[][] monstre = {{monstre1.getlatitude(), monstre1.getlongitude()}, {monstre2.getlatitude(), monstre2.getlongitude()}, {monstre3.getlatitude(), monstre3.getlongitude()}, {monstre4.getlatitude(), monstre4.getlongitude()}};

            int[][] coffre = {{coffre1.getlatitude(), coffre1.getlongitude()}, {coffre2.getlatitude(), coffre2.getlongitude()}, {coffre3.getlatitude(), coffre3.getlongitude()}};

            int[][] hero = {{hero1.getLatitude(), hero1.getLongitude()}};

            int[][] boss = {{boss1.getlatitude(), boss1.getlongitude()}};
            //Caractéristique de la map
            Map map = new Map(10, 10, mur, hero, monstre, coffre, boss, arene);
            //affichage de la map
            map.showmap();
            //Caractéristique déplacement
            System.out.println("Vous voulez aller ou?\n(haut, bas, gauche, droite) ou regarder (inventaire)");
            String choixdeplacement = in.nextLine();
            System.out.println("vous avez choisie : " + choixdeplacement); 

            hero1.deplacer(choixdeplacement);
            //Caractéristique de combat
            Combat combat = new Combat();
            combat.combat(hero1, monstre1, monstre2, monstre3, monstre4, boss1, in);
            //Caractéristique des coffres
            hero1.Coffresview(in,coffre1, coffre2, coffre3);
            //fin de partie
            interaction.fin(in, hero1, monstre1, monstre2, monstre3, monstre4, boss1);

        }
    }
}
