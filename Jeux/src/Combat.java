import java.util.Scanner;

public class Combat {
    boolean combattre = false;
    boolean partir = false;

    public void combat (Hero hero1, Monstre monstre1, Monstre monstre2, Monstre monstre3, Monstre monstre4 , Boss boss1){

        if(hero1.getLatitude() == monstre1.getlatitude() && hero1.getLongitude() == monstre1.getlongitude()){
            System.out.println("\n-----------------------\n" +"TU ES EN COMBAT\n");
            System.out.println("Tes Capacité :\n" + "   -Point de vie ->" + hero1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + hero1.getattaque() 
            + "\n" + "   -Ta Défence -> " + hero1.getdef()
            + "\n" + "   -Ton Esquive -> " + hero1.getvelo()
            + "\n" + "\n"
            + "Capacité du Monstre :\n" + "   -Point de vie ->" + monstre1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + monstre1.getattaque() 
            + "\n" + "   -Défence -> " + monstre1.getdef()
            + "\n" + "   -Esquive -> " + monstre1.getvelo()
            +"\n-----------------------\n");

            System.out.print("Tu Veux Attaquer ou Fuir ? (saisir Attaquer ou Fuir)\n");

            Scanner attaque = new Scanner(System.in);
            String attaqueoupas = attaque.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                combattre = true;
                System.out.println("Le Combat va commencer !"); //Il manque le combat
                if(attaqueoupas.equals("Combattre")){
                    monstre1.setpv(monstre1.getpv() - hero1.getattaque());
                    System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie");
                }
                if(attaqueoupas.equals("Soigner")){
                    hero1.setpv(hero1.getpv() + 20);
                    System.out.println("Tu viens de te soigner 20 point de vie, il te reste " + hero1.getpv() + " point de vie");
                }
            } 
            if (attaqueoupas.equals("Fuir")){
                partir = true;
                System.out.println("Tu viens de Fuir le Combat !"); 
                return;
            }

        }
        else if(hero1.getLatitude() == monstre2.getlatitude() && hero1.getLongitude() == monstre2.getlongitude()){
            System.out.println("\n-----------------------\n" +"TU ES EN COMBAT\n");
            System.out.println("Tes Capacité :\n" + "   -Point de vie ->" + hero1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + hero1.getattaque() 
            + "\n" + "   -Ta Défence -> " + hero1.getdef()
            + "\n" + "   -Ton Esquive -> " + hero1.getvelo()
            + "\n" + "\n"
            + "Capacité du Monstre :\n" + "   -Point de vie ->" + monstre2.getpv()
            +"\n" + "   -Puissance D'attaque -> " + monstre2.getattaque() 
            + "\n" + "   -Défence -> " + monstre2.getdef()
            + "\n" + "   -Esquive -> " + monstre2.getvelo()
            +"\n-----------------------\n");

            System.out.print("Tu Veux Attaquer ou Fuir ? (saisir Attaquer ou Fuir)\n");

            Scanner attaque = new Scanner(System.in);
            String attaqueoupas = attaque.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                combattre = true;
                System.out.println("Le Combat va commencer !"); //Il manque le combat
            } 
            if (attaqueoupas.equals("Fuir")){
                partir = true;
                System.out.println("Tu viens de Fuir le Combat !"); 
                return;
            }

        }
        else if(hero1.getLatitude() == monstre3.getlatitude() && hero1.getLongitude() == monstre3.getlongitude()){
            System.out.println("\n-----------------------\n" +"TU ES EN COMBAT\n");
            System.out.println("Tes Capacité :\n" + "   -Point de vie ->" + hero1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + hero1.getattaque() 
            + "\n" + "   -Ta Défence -> " + hero1.getdef()
            + "\n" + "   -Ton Esquive -> " + hero1.getvelo()
            + "\n" + "\n"
            + "Capacité du Monstre :\n" + "   -Point de vie ->" + monstre3.getpv()
            +"\n" + "   -Puissance D'attaque -> " + monstre3.getattaque() 
            + "\n" + "   -Défence -> " + monstre3.getdef()
            + "\n" + "   -Esquive -> " + monstre3.getvelo()
            +"\n-----------------------\n");

            System.out.print("Tu Veux Attaquer ou Fuir ? (saisir Attaquer ou Fuir)\n");

            Scanner attaque = new Scanner(System.in);
            String attaqueoupas = attaque.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                combattre = true;
                System.out.println("Le Combat va commencer !"); //Il manque le combat
            } 
            if (attaqueoupas.equals("Fuir")){
                partir = true;
                System.out.println("Tu viens de Fuir le Combat !"); 
                return;
            }

        }
        else if(hero1.getLatitude() == monstre4.getlatitude() && hero1.getLongitude() == monstre4.getlongitude()){
            System.out.println("\n-----------------------\n" +"TU ES EN COMBAT\n");
            System.out.println("Tes Capacité :\n" + "   -Point de vie ->" + hero1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + hero1.getattaque() 
            + "\n" + "   -Ta Défence -> " + hero1.getdef()
            + "\n" + "   -Ton Esquive -> " + hero1.getvelo()
            + "\n" + "\n"
            + "Capacité du Monstre :\n" + "   -Point de vie ->" + monstre4.getpv()
            +"\n" + "   -Puissance D'attaque -> " + monstre4.getattaque() 
            + "\n" + "   -Défence -> " + monstre4.getdef()
            + "\n" + "   -Esquive -> " + monstre4.getvelo()
            +"\n-----------------------\n");

            System.out.print("Tu Veux Attaquer ou Fuir ? (saisir Attaquer ou Fuir)\n");

            Scanner attaque = new Scanner(System.in);
            String attaqueoupas = attaque.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                combattre = true;
                System.out.println("Le Combat va commencer !"); //Il manque le combat
            } 
            if (attaqueoupas.equals("Fuir")){
                partir = true;
                System.out.println("Tu viens de Fuir le Combat !"); 
                return;
            }

        }
        if(hero1.getLatitude() == boss1.getlatitude() && hero1.getLongitude() == boss1.getlongitude()){
            System.out.println("\n-----------------------\n" +"TU ES EN COMBAT\n");
            System.out.println("Tes Capacité :\n" + "   -Point de vie ->" + hero1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + hero1.getattaque() 
            + "\n" + "   -Ta Défence -> " + hero1.getdef()
            + "\n" + "   -Ton Esquive -> " + hero1.getvelo()
            + "\n" + "\n"
            + "Capacité du Boss Final :\n" + "   -Point de vie ->" + boss1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + boss1.getattaque() 
            + "\n" + "   -Défence -> " + boss1.getdef()
            + "\n" + "   -Esquive -> " + boss1.getvelo()
            +"\n-----------------------\n");

            System.out.print("Tu Veux Attaquer ou Fuir ? (saisir Attaquer ou Fuir)\n");

            Scanner attaque = new Scanner(System.in);
            String attaqueoupas = attaque.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                combattre = true;
                System.out.println("Le Combat va commencer !"); //Il manque le combat
            } 
            if (attaqueoupas.equals("Fuir")){
                partir = true;
                System.out.println("Tu viens de Fuir le Combat !"); 
                return;
            }

        }

    }
}
