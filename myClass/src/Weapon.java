public class Weapon implements Weaponable{
    int damageBonus;
    Weapon(int bonus){
        addDamage(bonus);
    }

    @Override
    public void addDamage(int value) {
        this.damageBonus =value;
    }
}
