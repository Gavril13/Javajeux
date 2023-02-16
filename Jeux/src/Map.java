public class Map { //class perso pour les déplacement

private int latitude;
private int longitude;
private int collision;
private int[][] mur;  //matrice (définie) si > 20 mur et < 1 mur pour x et y
private int[][] Hero; 
private int[][] monstre; 
private int[][] coffre; 
private int[][] boss; 
   
   public Map(int latitude, int longitude, int[][] mur, int[][] Hero, int[][] monstre, int [][] coffre, int [][] boss, int collision) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.mur = mur;
        this.Hero = Hero;
        this.monstre = monstre;
        this.coffre = coffre;
        this.boss = boss;
        this.collision = collision;
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

    public int getcollision(){
        return collision;
    }

    public void setcollision(int collision){
        this.collision = collision;
    }
    
    public void showmap(){ //il faut parcourir la carte(pas besoin de l'afficher) (savoir ou est le personnage sur la map)
        for (int i = 0; i < latitude; i++) {
            for (int j = 0; j < longitude; j++) { //faire en sorte de mettre voir les cordonée et faire  (detecter les cordonées) si la longitude et latitude sont au possition du mur
                
                if(this.estMur(i, j)) {
                    System.out.print("X\t");//mur
                }
                else if(this.estHero(i, j)){
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
                else {
                    System.out.print("0\t");//deplacement
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

    private boolean estHero(int indexLat, int indexLong) { //Position du Hero
        for(int i = 0; i < Hero.length; i++) {
            if(indexLat == Hero[i][0] && indexLong == Hero[i][1]) {
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

    public void collision(){
        if(mur[x - 1][y] == "X"){ //gauche
            
        }
        if(mur[x - 1][y] == "X"){ //droite
            
        }
        if(mur[x - 1][y] == "X"){ //haut 
            
        }
        if(mur[x - 1][y] == "X"){ //bas
            
        }
    }

}

    