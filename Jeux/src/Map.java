public class Map { //class perso pour les déplacement

private int latitude;
private int longitude;
private int[][] mur;  //matrice (définie) si > 20 mur et < 1 mur pour x et y
private int[][] Hero; 
private int[][] Monstre; 
private int[][] COffre; 
private int[][] Boss; 
   
   public Map(int latitude, int longitude, int[][] mur, int[][] Hero, int[][] Monstre, int[][] COffre, int[][] Boss) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.mur = mur;
        this.Hero = Hero;
        this.Monstre = Monstre;
        this.COffre = COffre;
        this.Boss = Boss;
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
                }
                else if(this.estHero(i, j)){
                    System.out.print("H\t");
                }
                else if(this.estMonstre(i, i)){
                    System.out.print("M\t");
                }
                else if(this.estCOffre(i, i)){
                    System.out.print("C\t");
                }
                else if (this.estBoss(i, i)) {
                    System.out.print("B\t");
                }
                else {
                    System.out.print("0\t");
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

    private boolean estMonstre(int indexLat, int indexLong) { //Position des Monstres
        for(int i = 0; i < Monstre.length; i++) {
            if(indexLat == Monstre[i][0] && indexLong == Monstre[i][1]) {
                return true;
            }
        }

        return false;
    }

    private boolean estCOffre(int indexLat, int indexLong) { //position des Coffre
        for(int i = 0; i < COffre.length; i++) {
            if(indexLat == COffre[i][0] && indexLong == COffre[i][1]) {
                return true;
            }
        }

        return false;
    }

    private boolean estBoss(int indexLat, int indexLong) { //Possition des Boss
        for(int i = 0; i < Boss.length; i++) {
            if(indexLat == Boss[i][0] && indexLong == Boss[i][1]) {
                return true;
            }
        }

        return false;
    }
}
    