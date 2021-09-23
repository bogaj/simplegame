public class DefenseCharacter extends GameCharacter {

    private  double extraDefense;

    public DefenseCharacter(String name, int hp, int attack, int defense, double extraDefense) {
        super(name, hp, attack, defense);
        this.extraDefense = extraDefense;
    }

    public double getExtraDefense() {
        return extraDefense;
    }

    public void setExtraDefense(double extraDefense) {
        this.extraDefense = extraDefense;
    }

    @Override
    double totalDefense() {
        return getDefense() + extraDefense * getDefense();


    }
}
