import java.util.*;

public class Hero { 
    private String name;
    private int latitude;
    private int longitude;
    private int attaque;
    private int def;
    private int pv;
    private int velo;
    private int ex;
    private int inventaire ;
    private String arc = "Aucun";
    private String lance = "Aucun";
    private String pierre1 = "Aucun";
    private String pierre2 = "Aucun";
    private String potion1 = "Aucun";
    private String potion2 = "Aucun";
    private int nbarc = 1;
    private int nblance = 1;
    private int nbpierre1 = 1;
    private int nbpierre2 = 1;
    private int nbpotion1 = 1;
    private int nbpotion2 = 1;


    public Hero(int latitude, int longitude, int attaque, int def, int pv, int velo, int ex, int inventaire){
        this.latitude = latitude;
        this.longitude = longitude;
        this.attaque = attaque;
        this.def = def;
        this.pv = pv;
        this.velo = velo;
        this.ex = ex;
        this.inventaire = inventaire;
    }

    public int getnbarc(){
        return nbarc;
    }

    public void setnbarc(int nbarc){
        this.nbarc = nbarc;
    }

    public int getnblance(){
        return nblance;
    }

    public void setnblance(int nblance){
        this.nblance = nblance;
    }

    public int getnbpierre1(){
        return nbpierre1;
    }

    public void setnbpierre1(int nbpierre1){
        this.nbpierre1 = nbpierre1;
    }

    public int getnbpierre2(){
        return nbpierre2;
    }

    public void setnbpierre2(int nbpierre2){
        this.nbpierre2 = nbpierre2;
    }

    public int getnbpotion1(){
        return nbpotion1;
    }

    public void setnbpotion1(int nbpotion1){
        this.nbpotion1 = nbpotion1;
    }

    public int getnbpotion2(){
        return nbpotion2;
    }

    public void setnbpotion2(int nbpotion2){
        this.nbpotion2 = nbpotion2;
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
        else if(this.pv >= 100){
            this.pv = 100;
        }
    }

    public int getvelo(){
        return velo;
    }

    public void setvelo(int velo){
        this.velo = velo;
    }

    public int getex(){
        return ex;
    }

    public void setex(int ex){
        this.ex = ex;
    }

    public int getinventaire(){
        return inventaire;
    }

    public void setinventaire(int inventaire){
        this.inventaire = inventaire;
        if(inventaire <= 0){
            System.out.println("Tu as plus de place dans ton inventaire");
            this.inventaire = 0;
        }
    }

    public int getLongitude(){ 
        return longitude;
    }

    public void setLongitude(int longitude){
        this.longitude = longitude;
    }

    public int getLatitude (){ 
        return latitude;
    }

    public void setLatitude(int latitude){
        this.latitude = latitude;
    }

    public String getname(){  
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    
    public String getarc(){
        return arc;
    }

    public void setarc(String arc){
        this.arc = arc;
    }

    public String getlance(){
        return lance;
    }

    public void setlance(String lance){
        this.lance = lance;
    }

    public String getpierre1(){
        return pierre1;
    }

    public void setpierre1(String pierre1){
        this.pierre1 = pierre1;
    }

    public String getpierre2(){
        return pierre2;
    }

    public void setpierre2(String pierre2){
        this.pierre2 = pierre2;
    }

    public String getpotion1(){
        return potion1;
    }

    public void setpotion1(String potion1){
        this.potion1 = potion1;
    }

    public String getpotion2(){
        return potion2;
    }

    public void setpotion2(String potion2){
        this.potion2 = potion2;
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
            case "inventaire":
                System.out.println("\n=================================================================\n"+ 
                "|                      Inventaire du Hero                       |\n"+ 
                "| Armes :                                                       |\n"+ 
                "|       - " + getarc() + "                                                 |\n"+
                "|       - " +getlance()+"                                                 |\n"+
                "|                                                               |\n"+  
                "| Artefacts :                                                   |\n"+
                "|       - "+ getpierre1() +"                                                 |\n"+
                "|       - "+ getpierre2()+"                                                 |\n"+
                "|                                                               |\n"+
                "| Potions :                                                     |\n"+ 
                "|       - "+ getpotion1()+"                                                 |\n"+ 
                "|       - "+ getpotion2()+"                                                 |\n"+ 
                "|                                                               |\n"+
                "=================================================================\n");
                break;
        }
    }

    public void Coffresview (Scanner in, Coffre coffre1, Coffre coffre2, Coffre coffre3){
        while(this.getLatitude() == coffre1.getlatitude() && this.getLongitude() == coffre1.getlongitude()){
            System.out.println("Tu veux voir le Coffre ? ( Saisir Oui ou Non )\n");
            String Coffreopen = in.nextLine();
            if(Coffreopen.equals("Oui")){
                System.out.println("\n=================================================================\n"+ 
            "|                      Inventaire du Coffre                     |\n"+ 
            "| Armes :                                                       |\n"+ 
            "|       - Arc x"+getnbarc()+"                                                |\n"+
            "|                                                               |\n"+  
            "| Artefacts :                                                   |\n"+
            "|       - Pierre de Soin x"+getnbpierre1()+"                                      |\n"+
            "|                                                               |\n"+ 
            "| Potion :                                                      |\n"+ 
            "|       - Aucune                                                |\n"+ 
            "|                                                               |\n"+ 
            "=================================================================\n");
                System.out.println("Tu veux prendre un objet ? ( Saisir Arc ou Pierre de Soin ou Aucune)" +"\n");
                String objet = in.nextLine();
                if(objet.equals("Arc") && nbarc == 1){
                    setinventaire(5);
                    setinventaire(inventaire - 1);
                    setarc("Arc");
                    setnbarc(nbarc - 1);
                    System.out.println("Tu viens de prendre un Arc dans ton inventaire\n" + "Il te reste " + getinventaire() + " places dans ton inventaire");
                }
                else if(objet.equals("Arc") && nbarc == 0){
                    System.out.println("Tu as déja récuperé ton Arc");

                }
                else if(objet.equals("Pierre de Soin") && nbpierre1 == 1){
                    setinventaire(inventaire + 1);
                    setpierre1("Pierre de Soin");
                    setnbpierre1(nbpierre1 - 1);
                    System.out.println("Tu viens de prendre une Pierre de Soin dans ton inventaire\n" + "Il te reste " + getinventaire() + " place dans ton inventaire");
                }
                else if(objet.equals("Pierre de Soin") && nbpierre1 == 0){
                    System.out.println("Tu as déja récuperé ta Pierre de Soin");
                }
                else if(objet.equals("Aucune")){
                    break;
                }
            }
            else if(Coffreopen.equals("Non")){
                break;
            }
        }
        while(this.getLatitude() == coffre2.getlatitude() && this.getLongitude() == coffre2.getlongitude()){
            System.out.println("Tu veux voir le Coffre ? ( Saisir Oui ou Non )\n");
            String Coffreopen = in.nextLine();
            if(Coffreopen.equals("Oui")){
                System.out.println("\n=================================================================\n"+ 
            "|                      Inventaire du Coffre                     |\n"+ 
            "| Armes :                                                       |\n"+ 
            "|       - Lance x"+getnblance()+"                                              |\n"+
            "|                                                               |\n"+  
            "| Artefacts :                                                   |\n"+
            "|       - Aucune                                                |\n"+
            "|                                                               |\n"+ 
            "| Potion :                                                      |\n"+ 
            "|       - Potion de Vélocité x"+getnbpotion1()+"                                   |\n"+ 
            "|                                                               |\n"+ 
            "=================================================================\n");
                System.out.println("Tu veux prendre un objet ? ( Saisir Arc ou Pierre de Soin ou Aucune)" +"\n");
                String objet = in.nextLine();
                if(objet.equals("Lance") && nblance == 1){
                    setinventaire(inventaire - 1);
                    setlance("Lance");
                    setnblance(nblance - 1);
                    System.out.println("Tu viens de prendre une Lance dans ton inventaire\n" + "il te reste " + getinventaire() + " place dans ton inventaire");
                }
                else if(objet.equals("Lance") && nblance == 0){
                    System.out.println("Tu as déja récuperé ta Pierre de Soin");
                }
                else if(objet.equals("Potion de Vélocité") && nbpotion1 ==1){
                    setinventaire(inventaire - 1);
                    setpotion1("Potion de Vélocité");
                    setnbpotion1(nbpotion1 - 1);
                    System.out.println("Tu viens de prendre une Potion de Vélocité dans ton inventaire\n" + "il te reste " + getinventaire() + " place dans ton inventaire");          
                }
                else if(objet.equals("Aucune")){
                    break;
                }
            }
            else if(Coffreopen.equals("Non")){
                break;
            }
        }
        while(this.getLatitude() == coffre3.getlatitude() && this.getLongitude() == coffre3.getlongitude()){
            System.out.println("Tu veux voir le Coffre ? ( Saisir Oui ou Non )\n");
            String Coffreopen = in.nextLine();
            if(Coffreopen.equals("Oui")){
                System.out.println("\n=================================================================\n"+ 
            "|                      Inventaire du Coffre                     |\n"+ 
            "| Armes :                                                       |\n"+ 
            "|       - Aucune                                                |\n"+
            "|                                                               |\n"+  
            "| Artefacts :                                                   |\n"+
            "|       - Pierre de Vélocité x"+getnbpierre2()+"                                 |\n"+
            "|                                                               |\n"+ 
            "| Potion :                                                      |\n"+ 
            "|       - Potion de dégats x"+getnbpotion2()+"                                   |\n"+ 
            "|                                                               |\n"+ 
            "=================================================================\n");
                System.out.println("Tu veux prendre un objet ? ( Saisir Arc ou Pierre de Soin ou Aucune)" +"\n");
                String objet = in.nextLine();
                if(objet.equals("Pierre de Vélocité") && nbpierre2 == 1){
                    setinventaire(inventaire - 1);
                    setpierre2("Pierre de Vélocité");
                    setnbpierre2(nbpierre2 - 1);
                    System.out.println("Tu viens de prendre une Pierre de Vélocité dans ton inventaire\n" + "il te reste " + getinventaire() + " place dans ton inventaire");
                }
                else if(objet.equals("Potion de dégats") && nbpotion2 == 1){
                    setinventaire(inventaire - 1);
                    setpotion2("Potion de dégats");
                    setnbpotion2(nbpotion2 - 1);
                    System.out.println("Tu viens de prendre une Potion de dégats dans ton inventaire\n" + "il te reste " + getinventaire() + " place dans ton inventaire");
                }
                else if(objet.equals("Aucune")){
                    break;
                }
            }
            else if(Coffreopen.equals("Non")){
                break;
            }
        }
    }
}