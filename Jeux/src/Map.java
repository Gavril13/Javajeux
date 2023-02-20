public class Map { //class perso pour les déplacement

private int latitude;
private int longitude;
private int[][] mur;  //matrice (définie) si > 20 mur et < 1 mur pour x et y
//private int[][] Hero; 
private int[][] monstre; 
private int[][] coffre; 
private int[][] boss; 
private int[][] arene;
   
   public Map(int latitude, int longitude, int[][] mur, int[][] monstre, int [][] coffre, int [][] boss, int [][] arene) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.mur = mur;
        //this.Hero = Hero;
        this.monstre = monstre;
        this.coffre = coffre;
        this.boss = boss;
        this.arene = arene;
    }
   
    public int getLatitude() {
        return latitude;
    }
   
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    
    public int getLongitude() {
        return longitude;
    }
    
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    
    public void showmap(){ //il faut parcourir la carte(pas besoin de l'afficher) (savoir ou est le personnage sur la map)
        for (int i = 0; i < latitude; i++) {
            for (int j = 0; j < longitude; j++) { //faire en sorte de mettre voir les cordonée et faire  (detecter les cordonées) si la longitude et latitude sont au possition du mur
                
                if(this.estMur(i, j)) {
                    System.out.print("X\t");//mur
                }
                else if(this.estmonstre(i, j)){
                    System.out.print("M\t");//monstre
                }
               else if(this.estcoffre(i, j)){
                    System.out.print("C\t");//coffre
                }
                else if (this.estboss(i, j)) {
                    System.out.print("B\t");//boss
                }
                else if(this.estarene(i, j)) {
                    System.out.print("0\t");//deplacement
                }
                else{
                    return;
                }
            }          
            System.out.println();
        }
    }

    /*else if(this.estHero(i, j)){ // ancien emplacement du hero ( a modif)
        System.out.print("H\t");//hero
    }*/

    private boolean estMur(int indexLat, int indexLong) { //Position des murs
        for(int i = 0; i < mur.length; i++) {
            if(indexLat == mur[i][0] && indexLong == mur[i][1]) {
                return true;
            }
        }
        return false;
    }

    /*private boolean estHero(int indexLat, int indexLong) { //Position du Hero (a modif)
        for(int i = 0; i < Hero.length; i++) {
            if(indexLat == Hero[i][0] && indexLong == Hero[i][1]) {
                return true;
            }
        }

        return false;
    }*/

    private boolean estmonstre(int indexLat, int indexLong) { //Position des Monstres
        for(int i = 0; i < monstre.length; i++) {
            if(indexLat == monstre[i][0] && indexLong == monstre[i][1]) {
                return true;
            }
        }

        return false;
    }
 
    private boolean estcoffre(int indexLat, int indexLong) { //position des Coffre
        for(int i = 0; i < coffre.length; i++) {
            if(indexLat == coffre[i][0] && indexLong == coffre[i][1]) {
                return true;
            }
        }

        return false;
    }

    private boolean estboss(int indexLat, int indexLong) { //Possition des Boss
        for(int i = 0; i < boss.length; i++) {
            if(indexLat == boss[i][0] && indexLong == boss[i][1]) {
                return true;
            }
        }

        return false;
    }

    private boolean estarene(int indexLat, int indexLong) { //zone de déplacement
        for(int i = 0; i < arene.length; i++) {
            if(indexLat == arene[i][0] && indexLong == arene[i][1]) {
                return true;
            }
        }
        return false;
    }

    public void placer(int l, int c, char H){ //possition fixe du hero (H)
        l = l-1;
        c = c-1;  
        if(l < 0 || c < 0 || l > longitude || c > latitude){
            System.out.print("Erreur de position\n");
            return;
        }

        if(arene[l][c] == 0){
            arene[l][c] = H;
            System.out.print("ok\n");
        }

        else{
            System.out.print("Erreur, zone occupée\n");
        }
    }




    /*public static void deplacerPersonnage(char[][] carte, int[][] hero, char direction) {
        int[] newPosition = position.clone(); // Créer une copie de la position actuelle pour modifier les coordonnées
    
        // Modifier les coordonnées de la nouvelle position en fonction de la direction
        switch (direction) {
            case 'N':
                newPosition[0]--;
                break;
            case 'S':
                newPosition[0]++;
                break;
            case 'O':
                newPosition[1]--;
                break;
            case 'E':
                newPosition[1]++;
                break;
            default:
                System.out.println("Direction invalide !");
                return; // Sortir de la fonction si la direction est invalide
        }
    
        // Vérifier si la nouvelle position est dans les limites de la carte
        if (newPosition[0] < 0 || newPosition[0] >= carte.length || newPosition[1] < 0 || newPosition[1] >= carte[0].length) {
            System.out.println("Vous êtes sorti de la carte !");
            return; // Sortir de la fonction si la nouvelle position est en dehors de la carte
        }
    
        // Vérifier si la nouvelle position est un obstacle ('#')
        if (carte[newPosition[0]][newPosition[1]] == '#') {
            System.out.println("Vous avez rencontré un obstacle !");
            return; // Sortir de la fonction si la nouvelle position est un obstacle
        }
    
        // Déplacer le personnage sur la carte en modifiant les coordonnées
        carte[position[0]][position[1]] = '.'; // Effacer l'ancienne position du personnage
        carte[newPosition[0]][newPosition[1]] = 'P'; // Dessiner le personnage à la nouvelle position
    
        // Mettre à jour la position actuelle
        position[0] = newPosition[0];
        position[1] = newPosition[1];
    
        // Afficher la carte mise à jour
        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[0].length; j++) {
                System.out.print(carte[i][j] + " ");
            }
            System.out.println();
        }
    }*/
    

}

    