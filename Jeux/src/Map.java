public class Map { //class perso pour les déplacement

private int latitude;
private int longitude;
private int[][] mur;  //matrice (définie) si > 20 mur et < 1 mur pour x et y
private int[][] hero; 
private int[][] monstre; 
private int[][] coffre; 
private int[][] boss; 
private int[][] arene;
   
   public Map(int latitude, int longitude, int[][] mur, int[][] hero, int[][] monstre, int [][] coffre, int [][] boss, int [][] arene) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.mur = mur;
        this.hero = hero;
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
                else if(this.estHero(i, j)){ // ancien emplacement du hero ( a modif)
                    System.out.print("H\t");//hero
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

    private boolean estMur(int indexLat, int indexLong) { //Position des murs
        for(int i = 0; i < mur.length; i++) {
            if(indexLat == mur[i][0] && indexLong == mur[i][1]) {
                return true;
            }
        }
        return false;
    }

    private boolean estHero(int indexLat, int indexLong) { //Position du Hero (a modif)
        for(int i = 0; i < hero.length; i++) {
            if(indexLat == hero[i][0] && indexLong == hero[i][1]) {
                return true;
            }
        }

        return false;
    }

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
    
}   

    