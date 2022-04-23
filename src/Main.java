public class Main {
    public static void main(String[] args) {

        float cost = 12_500.23F; //стоимость билета
        char BONUS_FOR_MILE = 20; // стоимость бонусной мили

        int bonusMiles = (int) cost / BONUS_FOR_MILE;
        System.out.println("Начислено " + bonusMiles + " бонусных миль");

    }
}
