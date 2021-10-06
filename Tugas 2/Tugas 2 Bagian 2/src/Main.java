public class Main {

    public static void main(String[] args) {
        GameCharacter Raiden = new GameCharacter("Raiden", 10, 20);
        GameCharacter SubZero = new GameCharacter("SubZero", 5, 25);
        Raiden.hit(SubZero);
        SubZero.kick(Raiden);

        for (int i = 0; i < 3; i++) {
            SubZero.hit(Raiden);
        }
        for (int i = 0; i < 4; i++) {
            SubZero.kick(Raiden);
        }
        System.out.println(Raiden.getLifePoint());
        System.out.println(SubZero.getLifePoint());
        System.out.println();

        if (Raiden.getLifePoint()> SubZero.getLifePoint()){
            System.out.println("Raiden Menang");
        }
        else if(Raiden.getLifePoint()==SubZero.getLifePoint()){
            System.out.println("Seri");
        }
        else {
            System.out.println("SubZero Menang");
        }
    }

}
