public class Boss { // Tout les Caractéristique du Boss
    private int attaque;
    private int def; // Défence
    private int pv; // Point de Vie
    private int velo; // Vélocité
    private int ex; // Expérience
    private int latitude;
    private int longitude;
    
    public Boss (int attaque , int def, int pv, int velo, int ex, int latitude, int longitude){
        this.attaque = attaque;
        this.def = def;
        this.pv = pv;
        this.velo = velo;
        this.ex = ex;
        this.latitude = latitude ;
        this.longitude = longitude;
    }
    
    public int getattaque (){
        return attaque;
    }
    
    public void setattaque(int attaque){
        this.attaque = attaque;
    }
    
    public int getdef (){
        return def;
    }
    
    public void setdef(int def){
        this.def = def;
    }
    
    public int getpv (){
        return pv;
    }
    
    public void setpv (int pv){
        this.pv = pv;
        if(this.pv <= 0){
            this.pv = 0;
        }
    }
    
    public int getvelo (){
        return velo;
    }
    
    public void setvelo (int velo){
        this.velo = velo;
    }
    
    public int getex (){
        return ex;
    }
    
    public void setex (int ex){
        this.ex = ex;
    }
    
    public int getlatitude (){
        return latitude;
    }
    
    public void setlatitude(int latitude){
        this.latitude = latitude;
    }
    
    public int getlongitude (){
        return longitude;
    }
    
    public void setlongitude(int longitude){
        this.longitude = longitude;
    }
}
