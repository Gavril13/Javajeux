public class Hero{ // il faut inventaire (extends Perso)
    private String name;
    private int latitude;//  latitude
    private int longitude;// longitude
    private int attaque;
    private int def;
    private int pv;
    private int velo;
    private int ex;

    public Hero(int latitude, int longitude, int attaque, int def, int pv, int velo, int ex){
        this.latitude = latitude;
        this.longitude = longitude;
        this.attaque = attaque;
        this.def = def;
        this.pv = pv;
        this.velo = velo;
        this.ex =ex;
    }
    
    public int getattaque(){
        return attaque;
    }

    public void setattaque(int attaque){
        this.attaque = attaque;
    }

    public int getdef(){
        return def;
    }

    public void setdef(int def){
        this.def = def;
    }

    public int getpv(){
        return pv;
    }

    public void setpv(int pv){
        this.pv = pv;
        if(this.pv <= 0){
            this.pv = 0;
        }
        if(this.pv >= 100){
            this.pv = 100;
        }
    }

    public int getvelo(){
        return velo;
    }

    public void setvelo(int velo){
        this.velo = velo;
    }

    public int getLongitude(){ // cordo x
        return longitude;
    }

    public void setLongitude(int longitude){
        this.longitude = longitude;
    }

    public int getLatitude (){ //cordo y
        return latitude;
    }

    public void setLatitude(int latitude){
        this.latitude = latitude;
    }

    public String getname(){ //nom 
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public void deplacer(String deplacement){ //déplacement + colision 
        switch (deplacement){ 
            case "haut":
                setLatitude(latitude -=1);
                if (getLatitude() == 0 || getLatitude() == 4 && getLongitude() == 1 || getLatitude() == 3 && getLongitude() == 3 || getLatitude() == 3 && getLongitude() == 4 || getLatitude() == 6 && getLongitude() == 2 || getLatitude() == 6 && getLongitude() == 3 || getLatitude() == 6 && getLongitude() == 4 || getLatitude() == 3 && getLongitude() == 7 ) {
                    setLatitude(latitude += 1); 
                    System.out.println("Attention il y a un mur !");
                }
                break;
            case "bas":
                setLatitude(latitude += 1);
                if (getLatitude() == 9 || getLatitude() == 4 && getLongitude() == 1 || getLatitude() == 2 && getLongitude() == 3 || getLatitude() == 2 && getLongitude() == 4 || getLatitude() == 6 && getLongitude() == 2 || getLatitude() == 6 && getLongitude() == 3 || getLatitude() == 6 && getLongitude() == 4 || getLatitude() == 8 && getLongitude() == 3 || getLatitude() == 7 && getLongitude() == 7 || getLatitude() == 8 && getLongitude() == 8) {
                    setLatitude(latitude -= 1); 
                    System.out.println("Attention il y a un mur !");
                }
                break;
            case "droite":
                setLongitude(longitude += 1);
                if (getLongitude() == 9 || getLatitude() == 2 && getLongitude() == 3 || getLatitude() == 3 && getLongitude() == 3 || getLatitude() == 6 && getLongitude() == 2 || getLatitude() == 8 && getLongitude() == 3 || getLatitude() == 1 && getLongitude() == 7 || getLatitude() == 2 && getLongitude() == 7 || getLatitude() == 3 && getLongitude() == 7 || getLatitude() == 7 && getLongitude() == 7 || getLatitude() == 8 && getLongitude() == 7) {
                    setLongitude(longitude -= 1);
                    System.out.println("Attention il y a un mur !");
                }
                break;
            case "gauche":
                setLongitude(longitude -= 1);
                if (getLongitude() == 0 || getLatitude() == 4 && getLongitude() == 1 || getLatitude() == 2 && getLongitude() == 4 || getLatitude() == 3 && getLongitude() == 4 || getLatitude() == 6 && getLongitude() == 4 || getLatitude() == 8 && getLongitude() == 3 || getLatitude() == 1 && getLongitude() == 7 || getLatitude() == 2 && getLongitude() == 7 || getLatitude() == 3 && getLongitude() == 7 || getLatitude() == 7 && getLongitude() == 7) {
                    setLongitude(longitude += 1);
                    System.out.println("Attention il y a un mur !");
                }
                break;
        }
    }

}