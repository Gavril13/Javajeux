import java.util.Scanner;

public class Main { //essayer de faire juste déplacer le point H de 1 de cordonée (ou je le fais ??)
    public static void main(String[] args) throws Exception {
        System.out.println("-------------" + " Gavril Jeux-Java " + "-------------");
        //afficher la map apres qui a saisie son nom ... (debut de game)
        int[][] mur = 
        {
            {0,0},{0,1},{0,2},{0,3},{0,4},{0,5},{0,6},{0,7},{0,8},{0,9},//haut
            {1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},// gauche
            {9,0},{9,1},{9,2},{9,3},{9,4},{9,5},{9,6},{9,7},{9,8},{9,9}, //bas
            {1,9},{2,9},{3,9},{4,9},{5,9},{6,9},{7,9},{8,9}, //droite
            {4,1},{2,3},{2,4},{3,3},{3,4},{6,2},{6,3},{6,4},{1,7},{2,7},{3,7},{7,7},{8,7},{8,8},{8,3}//mur dans la map (latitude, longitude)
        };

        int[][] arene = {
            
            {1,0},{1,1},{1,2},{1,3},{1,4},{1,5},{1,6},{1,7},{1,8},{1,9},
            {2,0},{2,1},{2,2},{2,3},{2,4},{2,5},{2,6},{2,7},{2,8},{2,9},
            {3,0},{3,1},{3,2},{3,3},{3,4},{3,5},{3,6},{3,7},{3,8},{3,9},
            {4,0},{4,1},{4,2},{4,3},{4,4},{4,5},{4,6},{4,7},{4,8},{4,9},
            {5,0},{5,1},{5,2},{5,3},{5,4},{5,5},{5,6},{5,7},{5,8},{5,9},
            {6,0},{6,1},{6,2},{6,3},{6,4},{6,5},{6,6},{6,7},{6,8},{6,9},
            {7,0},{7,1},{7,2},{7,3},{7,4},{7,5},{7,6},{7,7},{7,8},{7,9},
            {8,0},{8,1},{8,2},{8,3},{8,4},{8,5},{8,6},{8,7},{8,8},{8,9},
            {9,0},{9,1},{9,2},{9,3},{9,4},{9,5},{9,6},{9,7},{9,8},{9,9}
        };

        Hero hero1 = new Hero(1, 1, 15,15, 100, 8, 20);

        Scanner in = new Scanner(System.in);
        Interaction interaction = new Interaction();
        interaction.start(in, hero1);

        Monstre monstre1 = new Monstre(10, 10, 100, 5, 20, 5, 1);

        Monstre monstre2 = new Monstre(10, 10, 100, 5, 20, 1, 6);

        Monstre monstre3 = new Monstre(10, 10, 100, 5, 20, 5, 6);

        Monstre monstre4 = new Monstre(10, 10, 100, 5, 20, 8, 5);

        Coffre coffre1 = new Coffre(0, 0, 0, 1, 3);

        Coffre coffre2 = new Coffre(0, 0, 0, 8, 1);

        Coffre coffre3 = new Coffre(0, 0, 0, 8, 7);

        Boss boss1 = new Boss(40, 50, 400, 20, 200, 2, 8);
            
        while (true){

            int[][] monstre = {{monstre1.getlatitude(), monstre1.getlongitude()}, {monstre2.getlatitude(), monstre2.getlongitude()}, {monstre3.getlatitude(), monstre3.getlongitude()}, {monstre4.getlatitude(), monstre4.getlongitude()}};

            int [][] coffre = {{coffre1.getlatitude(), coffre1.getlongitude()}, {coffre2.getlatitude(), coffre2.getlongitude()}, {coffre3.getlatitude(), coffre3.getlongitude()}};

            int[][] hero = {{hero1.getLatitude(), hero1.getLongitude()}};

            int[][] boss = {{boss1.getlatitude(), boss1.getlongitude()}};

            Map map = new Map(10, 10, mur, hero, monstre, coffre, boss, arene);

            map.showmap();

            System.out.println("Vous voulez aller ou?\n(haut, bas, gauche, droite)");
            String choixdeplacement = in.nextLine();
            System.out.println("vous avez choisie : " + choixdeplacement); 

            hero1.deplacer(choixdeplacement);

            Combat combat = new Combat();
            combat.combat(hero1, monstre1, monstre2, monstre3, monstre4, boss1, in);

        }
    }
}
