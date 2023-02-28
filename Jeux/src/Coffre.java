public class Coffre {
    private int arme;
    private int potion;
    private int artefacts;
    private int inventaire;
    private int longitude;
    private int latitude;
    private boolean coffres;


    public Coffre(int arme, int potion, int artefacts, int inventaire, int longitude, int latitude){
        this.arme = arme;
        this.potion = potion;
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

    public int getpotion(){
        return arme;
    }

    public void setpotion(int potion){
        this.potion = potion;
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


    public boolean is_open() {
		return coffres;
	}
	public void open() {
		this.coffres = true;
	}
	public void close() {
		this.coffres = false;
	}
}