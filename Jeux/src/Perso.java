public class Perso { //commentaire scanner (dans d'autre ficher)
    int ex = 0; //expérience
    int attaque; // Attaque
    int def; //Defence
    int pv; //Point de vie
    int velo; // agilité, vitesse
    int y; //cordo
    int x; //cordo

    public Perso(int ex, int attaque, int def, int pv, int velo, int y, int x){
        this.ex = ex;
        this.attaque = attaque;
        this.def = def;
        this.pv = pv;
        this.velo = velo;
        this.y = y;
        this.x = x;
    }

    public int getex(){//experience
        return ex;
    }

    public void setex(int ex){
        this.ex = ex;
    }

    public int getattaque(){//attaque
        return attaque;
    }

    public void setattaque(int attaque){
        this.attaque = attaque;
    }

    public int getdef(){//defence
        return def;
    }

    public void setdef(int def){
        this.def = def;
    }

    public int getpv(){//point de vie
        return pv;
    }

    public void setpv(int pv){
        this.pv = pv;
    }

    public int getvelo(){//agilité
        return velo;
    }

    public void setvelo(int velo){
        this.velo = velo;
    }

    public int getx(){// x cordonnée
        return x;
    }

    public void setx(int x){
        this.x = x;
    }

    public int gety(){// y cordonnée
        return y;
    }

    public void sety(int y){
        this.y = y;
    }

}