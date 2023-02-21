import java.util.Scanner;

public class Main { //essayer de faire juste déplacer le point H de 1 de cordonée (ou je le fais ??)
    public static void main(String[] args) throws Exception {
        System.out.println("Jeux Java");
        //afficher la map apres qui a saisie son nom ... (debut de game)
        int[][] mur = 
        {
            {0,0},{0,1},{0,2},{0,3},{0,4},{0,5},{0,6},{0,7},{0,8},{0,9},//haut
            {1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},// droite
            {9,1},{9,2},{9,3},{9,4},{9,5},{9,6},{9,7},{9,8},{9,9}, //bas
            {1,9},{2,9},{3,9},{4,9},{5,9},{6,9},{7,9},{8,9}, //gauche
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

        int[][] hero = {{1,1}}; //emplacement hero

        int[][] monstre = {{5,1},{1,6},{5,6},{8,5}}; //emplacement monstre

        int[][] coffre = {{3,1},{1,8},{7,8}};//emplacement coffre

        int[][] boss = {{2,8}};//emplacement boss

        Map map = new Map(10, 10, mur, hero, monstre, coffre, boss, arene, null);
        map.showmap();

        while (true){
            System.out.println("Vous voulez aller ou?\n(haut, bas, gauche, droite)");
            Scanner hero1 = new Scanner(System.in);
            String deplacement = hero1.nextLine();
            System.out.println("vous avez mis : " + deplacement); 

            //map.deplacer();

            map.showmap();
        }
    }
}
