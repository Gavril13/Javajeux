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

    public nomhero(){
        System.out.println("Saisie ton nom ");
        Scanner nom = new Scanner(name);
        System.out.println("Votre nom est :" + name);
    }
}
