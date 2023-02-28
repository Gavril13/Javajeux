import java.util.Scanner;

public class Coffre {
    private int arme;
    private int artefacts;
    private int inventaire;
    private int longitude;
    private int latitude;


    public Coffre(int arme, int artefacts, int inventaire, int longitude, int latitude){
        this.arme = arme;
        this.artefacts = artefacts;
        this.inventaire = inventaire;
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

    public int getinventaire(){
        return inventaire;
    }

    public void setinventaire(int inventaire){
        this.inventaire = inventaire;
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