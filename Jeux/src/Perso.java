public class Perso { //commentaire scanner (dans d'autre ficher)
    int ex; //expérience
    int attaque ; // Attaque
    int def ; //Defence
    int pv ; //Point de vie
    int velo ; // agilité, vitesse

    public Perso(int ex, int attaque, int def, int pv, int velo){
        this.ex = ex;
        this.attaque = attaque;
        this.def = def;
        this.pv = pv;
        this.velo = velo;
    }

    public int getex(){
        return ex;// renvoie l'ex
    }

    public int getattaque(){
        return attaque;
    }

    public int getdef(){
        return def;
    }

    public int getpv(){
        return pv;
    }

    public int getvelo(){
        return velo;
    }

    public void setex(int ex){
        this.ex = ex; //definie l'ex
    }

    public void setattaque(int attaque){
        this.attaque = attaque;
    }

    public void setdef(int def){
        this.def = def;
    }

    public void setpv(int pv){
        this.pv = pv;
    }

    public void setvelo(int velo){
        this.velo = velo;
    }

}