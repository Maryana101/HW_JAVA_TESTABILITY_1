public class BonusMilesService {
    int bonusForMile = 20; // стоимость бонусной мили

    public int calculate(int cost) {

        return cost / bonusForMile;
    }

}

