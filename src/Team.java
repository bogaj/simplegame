public class Team {
    private String name;
    private GameCharacter[] characters = new GameCharacter[3]; //ponieważ będzie można dodać postać z GameChar oraz dziedziczących

    public Team(String name, GameCharacter character1, GameCharacter character2, GameCharacter character3) {
        this.name = name;
        characters[0] = character1;
        characters[1] = character2;
        characters[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double attack() {
        double attack = 0;
        for (GameCharacter character : characters) {
            attack += character.totalAttack();
        }
        return attack;
    }

    double defense() {
        double defense = 0;
        for (GameCharacter character : characters) {
            defense += character.totalDefense();
        }
        return defense;
    }

    double hp() {
        double hp = 0;
        for (GameCharacter character : characters) {
            hp += character.getHp();  //korzystamy ze zwykłego gettera ponieważ postaci nie mają bonusu do HP

        }
        return hp;
    }
}
