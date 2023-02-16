public class Map { //class perso pour les déplacement
    int latitude;
    int longitude;
    int[][] Carte = new int[latitude][longitude];  //matrice (définie) si > 20 mur et < 1 mur pour x et y
   
    public Map(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
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
/* (faire de possition)
    public void lieu(int x, int y){
        if()
    }
*/
    /*public void showmap(int latitude, int longitude){ //il faut parcourir la carte(pas besoin de l'afficher) (savoir ou est le personnage sur la map)
        for (int i = 0; i < Carte.length; i++) {
            for (int j = 0; j < Carte.length; j++) {
                System.out.println(Carte[i][j]);
            }          
        }
    }*/
}

