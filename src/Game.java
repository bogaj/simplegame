public class Game {
    private static final String APP_NAME = "Battle Simulator v0.1";
    public static void main(String[] args) {
        System.out.println(APP_NAME);
        AttackCharacter character1 = new AttackCharacter("Joe", 100, 100, 100, 0.2);
        AttackCharacter character2 = new AttackCharacter("Boo", 100, 100, 100, 0.2);
        DefenseCharacter character3 = new DefenseCharacter("Zen", 100, 100, 100, 0.2);
        AttackCharacter character4 = new AttackCharacter("Adi", 100, 100, 100, 0.2);
        AttackCharacter character5 = new AttackCharacter("Dan", 100, 100, 100, 0.2);
        DefenseCharacter character6 = new DefenseCharacter("Mar", 10, 100, 100, 0.2);

        Team team1 = new Team("Team Blue", character1, character2, character4);
        Team team2 = new Team("Team Red", character3, character5, character6);
        BattleSimulator.fight(team1, team2);
    }
}
