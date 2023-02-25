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
                System.out.println("====== Nom Du Hero ======");
                System.out.println(" ");
                return;
            case "Info":
                System.out.println("ok c'e");
                return;
            case "Jeux":
                System.out.println("pas ok ededde");
                break;
        }
    }
}
