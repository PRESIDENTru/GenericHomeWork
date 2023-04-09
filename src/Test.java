public class Test {
    public static void main(String[] args) {
        //Sword<Plastic> sword = new Sword<>(); - не работает
        Sword<Steel> sword1 = new Sword<>(new Steel());
        System.out.println(sword1.isEndurance());
    }
}