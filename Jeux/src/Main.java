public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] mur = {{0,0},{1,1}};

        //Hero hero = new Hero(1, 1, 0, 20, 20, 100, 10, null, 0, 0, 0, 0)
        Map map = new Map(10, 10, mur);
        map.showmap();
    }
}