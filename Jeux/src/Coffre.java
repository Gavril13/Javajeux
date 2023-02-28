public class Coffre { //Tout les Caractéristique Du Coffre
    private int arme;
    private int artefacts;
    private int potion;
    private int longitude;
    private int latitude;


    public Coffre(int arme, int artefacts,int potion, int longitude, int latitude){
        this.arme = arme;
        this.artefacts = artefacts;
        this.potion = potion;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getarme(){
        return arme;
    }

    public void setarme(int arme){
        this.arme = arme;
    }

    public int getartefacts(){
        return artefacts;
    }

    public void setartefacts(int artefacts){
        this.artefacts = artefacts;
    }

    public int getpotion(){
        return potion;
    }

    public void setpotion(int potion){
        this.potion = potion;
    }

    public int getlongitude(){
        return longitude;
    }

    public void setlongitude(int longitude){
        this.longitude = longitude;
    }

    public int getlatitude(){
        return latitude;
    }

    public void setlatitude(int latitude){
        this.latitude = latitude;
    }
    
}