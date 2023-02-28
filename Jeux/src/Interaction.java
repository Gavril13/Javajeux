import java.util.Scanner;

public class Interaction {
    private String name;

    public void start(Scanner in, String startgame , Hero hero1){ 
                System.out.println("\n=================================================================\n"+ 
                "| Es-tu prête à ce jeux ?                                       |\n"+ 
                "| 1 : Oui                                                       |\n"+ 
                "| 2 : Non                                                       |\n"+ 
                "=================================================================\n");
                switch (startgame){
                    case "Oui":
                        Scanner Choix1 = new Scanner (System.in); 
                        System.out.println("-----------------------------------------------------------------\n"+
                            "La Partie va commencer !\n"+
                            "Ton héro s'appelera comment ? \n"+
                            "-----------------------------------------------------------------\n");
                        String name = Choix1.next();
                        Choix1.close();
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
