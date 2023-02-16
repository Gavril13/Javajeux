public class Map { //class perso pour les déplacement

private int latitude;
private int longitude;
private int[][] mur;  //matrice (définie) si > 20 mur et < 1 mur pour x et y
private int[][] Hero; 
   
   public Map(int latitude, int longitude, int[][] mur, int[][] Hero) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.mur = mur;
        this.Hero = Hero;
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
                    System.out.print("X\t");
                } else {
                    System.out.print("0\t");
                }
                
            }          
            System.out.println();
        }

    }

    private boolean estMur(int indexLat, int indexLong) {
        for(int i = 0; i < mur.length; i++) {
            if(indexLat == mur[i][0] && indexLong == mur[i][1]) {
                return true;
            }
        }

        return false;
    }

    private boolean estHero(int indexLat, int indexLong) {
        for(int i = 0; i < Hero.length; i++) {
            if(indexLat == Hero[i][0] && indexLong == Hero[i][1]) {
                return true;
            }
        }

        return false;
    }
}
    