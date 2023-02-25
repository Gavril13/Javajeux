public class Monstre {
    private int attaque;
    private int def;
    private int pv;
    private int velo;
    private int ex;
    private int latitude;
    private int longitude;

    public Monstre (int attaque , int def, int pv, int velo, int ex, int latitude, int longitude){
        this.attaque = attaque;
        this.def = def;
        this.pv = pv;
        this.velo = velo;
        this.ex = ex;
        this.latitude = latitude ;
        this.longitude = longitude;
    }

    public int attaque (){
        return attaque;
    }

    public void attaque(int attaque){
        this.attaque = attaque;
    }

    public int def (){
        return def;
    }

    public void def(int def){
        this.def = def;
    }

    public int pv (){
        return pv;
    }

    public void pv (int pv){
        this.pv = pv;
    }

    public int velo (){
        return velo;
    }

    public void velo (int velo){
        this.velo = velo;
    }

    public int ex (){
        return ex;
    }

    public void ex (int ex){
        this.ex = ex;
    }

    public int latitude (){
        return latitude;
    }

    public void latitude(int latitude){
        this.latitude = latitude;
    }

    public int longitude (){
        return longitude;
    }

    public void longitude(int longitude){
        this.longitude = longitude;
    }
}


