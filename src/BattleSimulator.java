public class BattleSimulator {
    static void fight(Team team1, Team team2) {
        double team2Hp = attack(team1, team2);
        double team1Hp = attack(team2, team1);
        double hpDiff = team1Hp - team2Hp;
        if (hpDiff > 0) {
            System.out.println("Wygrywa drużyna " + team1.getName() + " z przewagą " + hpDiff + " życia");
        } else  if (hpDiff < 0 ){
            System.out.println("Wygrywa drużyna " + team2.getName() + " z przewagą " + (-hpDiff) + " życia");
        } else {
            System.out.println("Remis");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double hp = defender.hp();
        if (attackPower > 0) {
           double result =  hp - attackPower;
            return result >= 0? result : 0;
        } else {
            return hp;
        }
    }
}
