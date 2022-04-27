public class BonusMilesService {
    char BONUS_FOR_MILE = 20; // стоимость бонусной мили

    public int calculate(int cost) {

        return cost / BONUS_FOR_MILE;
    }

}

