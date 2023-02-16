import javax.swing.text.Position;

public class Map { //class perso pour les déplacement

private int latitude;
private int longitude;
private int[][] mur;  //matrice (définie) si > 20 mur et < 1 mur pour x et y
   
   public Map(int latitude, int longitude, int[][] mur) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.mur = mur;
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

    /*public int getmur(){
        return [][] mur;
    }

    public void setmur(int [][] mur){
        this.mur = mur;
    }*/
    
    public void showmap(){ //il faut parcourir la carte(pas besoin de l'afficher) (savoir ou est le personnage sur la map)
        for (int i = 0; i < latitude; i++) {
            for (int j = 0; j < longitude; j++) { //faire en sorte de mettre voir les cordonée et faire  (detecter les cordonées)
                if()
                System.out.print("0\t");
                
            }          
            System.out.println();
        }

        for (int i = 0; i < mur.length; i++) {
            for (int j = 0; j < mur.length; j++) {
                System.out.print("X\t");
            }

        }
    }
}
    