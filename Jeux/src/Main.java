public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //afficher la map apres qui a saisie son nom ... (debut de game)
        int[][] mur = 
        {
            {0,0},{0,1},{0,2},{0,3},{0,4},{0,5},{0,6},{0,7},{0,8},{0,9},//haut
            {1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},// droite
            {9,1},{9,2},{9,3},{9,4},{9,5},{9,6},{9,7},{9,8},{9,9}, //bas
            {1,9},{2,9},{3,9},{4,9},{5,9},{6,9},{7,9},{8,9}, //gauche
            {4,1},{2,3},{2,4},{3,3},{3,4},{6,2},{6,3},{6,4},{1,7},{2,7},{3,7},{7,7},{8,7},{8,8},{8,3}//mur dans la map (latitude, longitude)
        };

        int[][] Hero ={{1,1}};

        int[][] Monstre = {{5,1},{1,6},{5,6},{8,5}};

        int[][] COffre = {{3,1},{1,8},{7,8}};

        int[][] Boss = {{2,8}};

        //Hero hero = new Hero(1, 1, 0, 20, 20, 100, 10, null, 0, 0, 0, 0)
        Map map = new Map(10, 10, mur, Hero, Monstre, COffre, Boss);
        map.showmap();
    }
}