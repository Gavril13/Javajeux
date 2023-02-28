import java.util.Scanner;

public class Interaction {
    public void start(Scanner in, Hero hero1){ 
        System.out.println("\n=================================================================\n"+ 
        "| Es-tu prête à ce jeux ?                                       |\n"+ 
        "| 1 : Oui                                                       |\n"+ 
        "| 2 : Non                                                       |\n"+ 
        "=================================================================\n");
        String startgame = in.next();
        switch (startgame){
            case "Oui": 
                System.out.println("-----------------------------------------------------------------\n"+
                "La Partie va commencer !\n"+
                "Ton héro s'appelera comment ? \n"+
                "-----------------------------------------------------------------\n");
                String name = in.next();
                hero1.setname(name);
                System.out.println(" \n"+
                "Ton Nom est "+ hero1.getname() + " ! La Partie va pouvoir commencer ! \n"); 
                break;

            case "Non" :
                System.out.println("-----------------------------------------------------------------\n"+
                "Oublie pas de jouer ?\n"+
                "-----------------------------------------------------------------\n");               
                break;
        }
    } 
}
