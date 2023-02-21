public class Perso { //commentaire scanner (dans d'autre ficher)
    int ex = 0; //expérience
    int attaque; // Attaque
    int def; //Defence
    int pv; //Point de vie
    int velo; // agilité, vitesse
    int latitude; //cordo
    int longitude; //cordo

    public Perso(int ex, int attaque, int def, int pv, int velo, int latitude, int longitude){
        this.ex = ex;
        this.attaque = attaque;
        this.def = def;
        this.pv = pv;
        this.velo = velo;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public int getLongitude(){// x cordonnée
        return longitude;
    }

    public void setx(int longitude){
        this.longitude = longitude;
    }

    public int getLatitude(){// y cordonnée
        return latitude;
    }

    public void sety(int latitude){
        this.latitude = latitude;
    }

}