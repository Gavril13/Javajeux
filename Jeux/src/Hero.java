public class Hero extends Perso{ // il faut inventaire
    String name;
    String deplacement;
    int inventaire;
    int arme;
    int potion;
    int artefacts;

    public Hero(int x, int y, int ex, int attaque, int def, int pv, int velo, String name, int inventaire, int arme, int potion, int artefacts){
        super(x, y, ex, attaque, def, pv, velo);
        this.name = name;
        this.inventaire = inventaire;
        this.arme = arme;
        this.potion = potion;
        this.artefacts = artefacts;
    }

    public int getx(){ // cordo x
        return x;
    }

    public void setx(int x){
        this.x = x;
    }

    public int gety (){ //cordo y
        return y;
    }

    public void sety(int y){
        this.y = y;
    }

    public int getex(){ //experience
        return ex;
    }

    public void setex(int ex){
        this.ex = ex;
    }

    public int getattaque(){ //attaque
        return attaque;
    }

    public void setattaque(int attaque){
        this.attaque = attaque;
    }

    public int getdef(){ //defence
        return def;
    }

    public void setdef(int def){
        this.def = def;
    }

    public int getpv(){ //point de vie
        return pv;
    }

    public void setpv(int pv){
        this.pv = pv;
    }

    public int getvelo(){ //velocité (agilité, vitesse)
        return velo;
    }

    public void setvelo(int velo){
        this.velo = velo;
    }

    public String getname(){ //nom 
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public int getinventaire(){ //inventaire
        return inventaire;
    }

    public void setinventaire(int inventaire){
        this.inventaire = inventaire;
    }

    public int getarme(){// arme
        return arme;
    }

    public void setarme(int arme){
        this.arme = arme;
    }

    public int getpotion(){// potion
        return potion;
    }

    public void setpotion(int potion){
        this.potion = potion;
    }

    public int getartefacts(){//artefacts
        return artefacts;
    }

    public void setartefacts(int artefacts){
        this.artefacts = artefacts;
    }
///faire des collision 

    public void deplacer(){ //déplacement
        switch (deplacement) {
            case "haut":
                this.y -= 1; break;
            case "bas":
                this.y += 1; break;
            case "droite":
                this.x += 1; break;
            case "gauche":
                this.x -= 1; break;
        }
    }
}