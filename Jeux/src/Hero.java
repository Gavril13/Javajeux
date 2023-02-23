public class Hero{ // il faut inventaire (extends Perso)
    private String name;
    private int longitude;
    private int latitude;
    /*private int inventaire;
    private int arme;
    private int potion;
    private int artefacts;*/

    public Hero(int longitude, int latitude, String name){
        //super(ex, attaque, def, pv, velo);
        this.name = name;
        //this.inventaire = inventaire;
        //this.arme = arme;
        //this.potion = potion;
        //this.artefacts = artefacts;
    }

    public int getLongitude(){ // cordo x
        return longitude;
    }

    public void setx(int longitude){
        this.longitude = longitude;
    }

    public int getLatitude (){ //cordo y
        return latitude;
    }

    public void sety(int latitude){
        this.latitude = latitude;
    }

    public String getname(){ //nom 
        return name;
    }

    public void setname(String name){
        this.name = name;
    }
///faire des collision 

    /*public void collision(char X){
        if("haut" == X){

        } 
    }*/

    public void deplacer(String deplacement){ //déplacement
        switch (deplacement) {
            case "haut":
                this.latitude -= 1; break;
            case "bas":
                this.latitude += 1; break;
            case "droite":
                this.longitude += 1; break;
            case "gauche":
                this.longitude -= 1; break;
        }
    }

}