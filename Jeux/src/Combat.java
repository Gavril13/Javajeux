public class Combat {
    public void Combat (Hero hero1, Monstre monstre){
        System.out.println("Un combat va commencer !");
        hero1.getLatitude(); hero1.getLongitude();
        monstre.getlatitude(); monstre.getlongitude();

        if(hero1.getLatitude() == monstre.getlatitude() && hero1.getLongitude() == monstre.getlongitude()){
            System.out.println("tu es en combat");
        }

        }
    }
}
