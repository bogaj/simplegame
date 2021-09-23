public class AttackCharacter extends GameCharacter {
    private double extraAttack;

    public AttackCharacter(String name, int hp, int attack, int defense, double extraAttack) {
        super(name, hp, attack, defense);
        this.extraAttack = extraAttack;
    }

    @Override
    double totalAttack() {
        return getAttack() + extraAttack * getAttack();
    }

    public double getExtraAttack() {
        return extraAttack;
    }

    public void setExtraAttack(double extraAttack) {
        this.extraAttack = extraAttack;
    }
}
