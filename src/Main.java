public class Main {
    public static void main(String[] args) {

        BonusMilesService bonusMilesService = new BonusMilesService();
        int bonusMiles = bonusMilesService.calculate(12000);
        System.out.println("Начислено " + bonusMiles + " бонусных миль");

    }
}
