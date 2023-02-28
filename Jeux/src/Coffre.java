public class Coffre {
    private int arme;
    private int potion;
    private int artefacts;
    private int inventaire;
    private int longitude;
    private int latitude;


    public Coffre(int arme, int potion, int artefacts, int inventaire, int longitude, int latitude){
        this.arme = arme;
        this.potion = potion;
        this.artefacts = artefacts;
        this.inventaire = inventaire;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int arme(){
        return arme;
    }

    public void arme(int arme){
        this.arme = arme;
    }

    public int potion(){
        return arme;
    }

    public void potion(int potion){
        this.potion = potion;
    }

    public int artefacts(){
        return artefacts;
    }

    public void artefacts(int artefacts){
        this.artefacts = artefacts;
    }

    public int inventaire(){
        return inventaire;
    }

    public void inventaire(int inventaire){
        this.inventaire = inventaire;
    }

    public int longitude(){
        return longitude;
    }

    public void longitude(int longitude){
        this.longitude = longitude;
    }

    public int latitude(){
        return latitude;
    }

    public void latitude(int latitude){
        this.latitude = latitude;
    }
}