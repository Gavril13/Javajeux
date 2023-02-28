import java.util.Scanner;

public class Combat {
    
    public void combat (Hero hero1, Monstre monstre1, Monstre monstre2, Monstre monstre3, Monstre monstre4 , Boss boss1, Scanner in){
        while(hero1.getLatitude() == monstre1.getlatitude() && hero1.getLongitude() == monstre1.getlongitude()){
            if(hero1.getnbarc() == 0 ){
                hero1.setvelo(hero1.getvelo() + 5);
            }
            else if(hero1.getnblance() == 0 ){
                hero1.setattaque(hero1.getattaque() + 10);
            }
            else if(hero1.getnbpierre2() == 0){
                hero1.setvelo(hero1.getvelo() + 50);
            }
            if(hero1.getnbpotion2() == 0 ){
                hero1.setattaque(hero1.getattaque() + 40);
            }
            if(hero1.getnbpotion1() == 0 ){
                hero1.setvelo(hero1.getvelo() + 20);
            }
            if(hero1.getnbpierre1() == 0){
                hero1.setpv(hero1.getpv() + 45);
            }
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

            System.out.print("Tu Veux Attaquer ou Fuir ? (Saisir Attaquer ou Fuir)\n");

            String attaqueoupas = in.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                System.out.println("Le Combat va commencer ! (Saisir Combattre ou Soigner)"); 
                String attaqueoupas1 = in.nextLine();
                if(attaqueoupas1.equals("Combattre") && hero1.getvelo() > monstre1.getvelo()){
                    monstre1.setpv(monstre1.getpv() - hero1.getattaque());
                    System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre1.getpv());
                    if(monstre1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre1.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Combattre")  && hero1.getvelo() < monstre1.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre1.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        monstre1.setpv(monstre1.getpv() - hero1.getattaque());
                        System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre1.getpv());
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() > monstre1.getvelo()){
                    hero1.setpv(hero1.getpv() + 20);
                    System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    if(monstre1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre1.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() < monstre1.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre1.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() + 20);
                        System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    }
                }
            } 
            else if (attaqueoupas.equals("Fuir")){
                System.out.println("Tu viens de Fuir le Combat !"); 
                break;
            }
        }
        while(hero1.getLatitude() == monstre2.getlatitude() && hero1.getLongitude() == monstre2.getlongitude()){
            if(hero1.getnbarc() == 0 ){
                hero1.setvelo(hero1.getvelo() + 5);
            }
            else if(hero1.getnblance() == 0 ){
                hero1.setattaque(hero1.getattaque() + 10);
            }
            else if(hero1.getnbpierre2() == 0){
                hero1.setvelo(hero1.getvelo() + 50);
            }
            if(hero1.getnbpotion2() == 0 ){
                hero1.setattaque(hero1.getattaque() + 40);
            }
            if(hero1.getnbpotion1() == 0 ){
                hero1.setvelo(hero1.getvelo() + 20);
            }
            if(hero1.getnbpierre1() == 0){
                hero1.setpv(hero1.getpv() + 45);
            }
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

            System.out.print("Tu Veux Attaquer ou Fuir ? (Saisir Attaquer ou Fuir)\n");
            String attaqueoupas = in.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                System.out.println("Le Combat va commencer ! (Saisir Combattre ou Soigner)"); 
                String attaqueoupas1 = in.nextLine();
                if(attaqueoupas1.equals("Combattre") && hero1.getvelo() > monstre2.getvelo()){
                    monstre2.setpv(monstre2.getpv() - hero1.getattaque());
                    System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre2.getpv());
                    if(monstre2.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre2.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre2.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Combattre")  && hero1.getvelo() < monstre2.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre2.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre2.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre2.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        monstre2.setpv(monstre2.getpv() - hero1.getattaque());
                        System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre2.getpv());
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() > monstre2.getvelo()){
                    hero1.setpv(hero1.getpv() + 20);
                    System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    if(monstre2.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre2.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre2.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() < monstre1.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre2.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre2.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre2.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() + 20);
                        System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    }
                }
            } 
            else if (attaqueoupas.equals("Fuir")){
                System.out.println("Tu viens de Fuir le Combat !"); 
                break;
            }
        }
        while(hero1.getLatitude() == monstre3.getlatitude() && hero1.getLongitude() == monstre3.getlongitude()){
            if(hero1.getnbarc() == 0 ){
                hero1.setvelo(hero1.getvelo() + 5);
            }
            else if(hero1.getnblance() == 0 ){
                hero1.setattaque(hero1.getattaque() + 10);
            }
            else if(hero1.getnbpierre2() == 0){
                hero1.setvelo(hero1.getvelo() + 50);
            }
            if(hero1.getnbpotion2() == 0 ){
                hero1.setattaque(hero1.getattaque() + 40);
            }
            if(hero1.getnbpotion1() == 0 ){
                hero1.setvelo(hero1.getvelo() + 20);
            }
            if(hero1.getnbpierre1() == 0){
                hero1.setpv(hero1.getpv() + 45);
            }
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

            System.out.print("Tu Veux Attaquer ou Fuir ? (Saisir Attaquer ou Fuir)\n");
            String attaqueoupas = in.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                System.out.println("Le Combat va commencer ! (Saisir Combattre ou Soigner)"); 
                String attaqueoupas1 = in.nextLine();
                if(attaqueoupas1.equals("Combattre") && hero1.getvelo() > monstre3.getvelo()){
                    monstre3.setpv(monstre3.getpv() - hero1.getattaque());
                    System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre3.getpv());
                    if(monstre3.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre3.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre3.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Combattre")  && hero1.getvelo() < monstre1.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre3.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre3.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre3.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        monstre3.setpv(monstre3.getpv() - hero1.getattaque());
                        System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre3.getpv());
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() > monstre3.getvelo()){
                    hero1.setpv(hero1.getpv() + 20);
                    System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    if(monstre3.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre3.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre3.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() < monstre3.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre3.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre3.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre3.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() + 20);
                        System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    }
                }
            } 
            else if (attaqueoupas.equals("Fuir")){
                System.out.println("Tu viens de Fuir le Combat !"); 
                break;
            }
        }
        while(hero1.getLatitude() == monstre4.getlatitude() && hero1.getLongitude() == monstre4.getlongitude()){
            if(hero1.getnbarc() == 0 ){
                hero1.setvelo(hero1.getvelo() + 5);
            }
            else if(hero1.getnblance() == 0 ){
                hero1.setattaque(hero1.getattaque() + 10);
            }
            else if(hero1.getnbpierre2() == 0){
                hero1.setvelo(hero1.getvelo() + 50);
            }
            if(hero1.getnbpotion2() == 0 ){
                hero1.setattaque(hero1.getattaque() + 40);
            }
            if(hero1.getnbpotion1() == 0 ){
                hero1.setvelo(hero1.getvelo() + 20);
            }
            if(hero1.getnbpierre1() == 0){
                hero1.setpv(hero1.getpv() + 45);
            }
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

            System.out.print("Tu Veux Attaquer ou Fuir ? (Saisir Attaquer ou Fuir)\n");
            String attaqueoupas = in.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                System.out.println("Le Combat va commencer ! (Saisir Combattre ou Soigner)"); 
                String attaqueoupas1 = in.nextLine();
                if(attaqueoupas1.equals("Combattre") && hero1.getvelo() > monstre4.getvelo()){
                    monstre4.setpv(monstre4.getpv() - hero1.getattaque());
                    System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre4.getpv());
                    if(monstre4.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre4.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre4.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Combattre")  && hero1.getvelo() < monstre4.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre4.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre4.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre4.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 5);
                        hero1.setdef(hero1.getdef() + 5);
                        hero1.setex(hero1.getex() + 20);
                        break;
                    }
                    else{
                        monstre4.setpv(monstre4.getpv() - hero1.getattaque());
                        System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + monstre4.getpv());
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() > monstre4.getvelo()){
                    hero1.setpv(hero1.getpv() + 20);
                    System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    if(monstre4.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - monstre4.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + monstre4.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() < monstre4.getvelo()){
                    hero1.setpv(hero1.getpv() - monstre4.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + monstre4.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(monstre4.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() + 20);
                        System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    }
                }
            } 
            else if (attaqueoupas.equals("Fuir")){
                System.out.println("Tu viens de Fuir le Combat !"); 
                break;
            }
        }
        while(hero1.getLatitude() == boss1.getlatitude() && hero1.getLongitude() == boss1.getlongitude()){
            if(hero1.getnbarc() == 0 ){
                hero1.setvelo(hero1.getvelo() + 5);
            }
            else if(hero1.getnblance() == 0 ){
                hero1.setattaque(hero1.getattaque() + 10);
            }
            else if(hero1.getnbpierre2() == 0){
                hero1.setvelo(hero1.getvelo() + 50);
            }
            if(hero1.getnbpotion2() == 0 ){
                hero1.setattaque(hero1.getattaque() + 40);
            }
            if(hero1.getnbpotion1() == 0 ){
                hero1.setvelo(hero1.getvelo() + 20);
            }
            if(hero1.getnbpierre1() == 0){
                hero1.setpv(hero1.getpv() + 45);
            }
            System.out.println("\n-----------------------\n" +"TU ES EN COMBAT\n");
            System.out.println("Tes Capacité :\n" + "   -Point de vie ->" + hero1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + hero1.getattaque() 
            + "\n" + "   -Ta Défence -> " + hero1.getdef()
            + "\n" + "   -Ton Esquive -> " + hero1.getvelo()
            + "\n" + "\n"
            + "Capacité du Monstre :\n" + "   -Point de vie ->" + boss1.getpv()
            +"\n" + "   -Puissance D'attaque -> " + boss1.getattaque() 
            + "\n" + "   -Défence -> " + boss1.getdef()
            + "\n" + "   -Esquive -> " + boss1.getvelo()
            +"\n-----------------------\n");

            System.out.print("Tu Veux Attaquer ou Fuir ? (Saisir Attaquer ou Fuir)\n");
            String attaqueoupas = in.nextLine();
            if (attaqueoupas.equals("Attaquer")){
                System.out.println("Le Combat va commencer ! (Saisir Combattre ou Soigner)"); 
                String attaqueoupas1 = in.nextLine();
                if(attaqueoupas1.equals("Combattre") && hero1.getvelo() > boss1.getvelo()){
                    boss1.setpv(boss1.getpv() - hero1.getattaque());
                    System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + boss1.getpv());
                    if(boss1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 20);
                        hero1.setdef(hero1.getdef() + 40);
                        hero1.setex(hero1.getex() + 200);
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - boss1.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + boss1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Combattre")  && hero1.getvelo() < boss1.getvelo()){
                    hero1.setpv(hero1.getpv() - boss1.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + boss1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(boss1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        hero1.setattaque(hero1.getattaque() + 20);
                        hero1.setdef(hero1.getdef() + 40);
                        hero1.setex(hero1.getex() + 200);
                        break;
                    }
                    else{
                        boss1.setpv(boss1.getpv() - hero1.getattaque());
                        System.out.println("Le Monstre à perdu " + hero1.getattaque() + " point de vie\n" + "Il lui reste " + boss1.getpv());
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() > boss1.getvelo()){
                    hero1.setpv(hero1.getpv() + 20);
                    System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    if(boss1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() - boss1.getattaque());
                        System.out.println("Le Monstre viens de te mettre \n" + boss1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    }
                }
                else if(attaqueoupas1.equals("Soigner") && hero1.getvelo() < boss1.getvelo()){
                    hero1.setpv(hero1.getpv() - boss1.getattaque());
                    System.out.println("Le Monstre viens de te mettre \n" + boss1.getattaque() + " point de dégat\n" + "Il te reste " + hero1.getpv() + " Point de vie");
                    if(boss1.getpv() <= 0){
                        System.out.println("Tu viens de gagner le combat");
                        break;
                    }
                    else{
                        hero1.setpv(hero1.getpv() + 20);
                        System.out.println("Tu viens de te soigner 20 point de vie\n" + " Il te reste " + hero1.getpv() + " point de vie");
                    }
                }
            } 
            else if (attaqueoupas.equals("Fuir")){
                System.out.println("Tu viens de Fuir le Combat !"); 
                break;
            }
        }

    }
}
