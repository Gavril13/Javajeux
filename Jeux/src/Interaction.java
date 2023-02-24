import java.util.Scanner;

public class Interaction {
    private String name;
    private int info;

    public Interaction (String name, int info){
        this.name = name;
        this.info = info;

    }

    public String name(){
        return name;
    }

    public int info(){
        return info;
    }

    public void name(String name){
        this.name = name;
    }

    public void info(int info){
        this.info = info;
    }

    public void nomhero(String information){
        switch (information) {
            case "Nom":
                System.out.println("Saisie ton nom de hero ");
                Scanner nom = new Scanner(System.in);
                String name = nom.nextLine();
                System.out.println("Votre nom est : " + name );
                break;
            case "Info":
                System.out.println("ok c'est carré");
                break;
            case "Jeux":
                System.out.println("pas ok ededde");
                break;
        }
        System.out.println("Saisie ton nom ");
        Scanner nom = new Scanner(name);
        System.out.println("Votre nom est :" + name);
    }
}
