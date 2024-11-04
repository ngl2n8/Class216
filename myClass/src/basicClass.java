import java.util.ArrayList;

public abstract class basicClass {
    String name;
    int hp = 0;
    int attack;

    abstract void punch(basicClass enemy);
    int doNothing(){return 0;}
    boolean pr(){
        int foo = 0;
        try {
            Class.class.getDeclaredField("qwe");
        } catch (NoSuchFieldException e) {
            foo =1;
        }
        if(foo==1){
            return true;
        }else {
            return false;
        }
    }
    ArrayList<Weapon> weapons = new ArrayList<>();
    void addDamage(Weapon weapon){
//        weapon.damageBonus +=foo;
        this.weapons.add(weapon);
    }
    ArrayList<Armor> armors = new ArrayList<>();
    void addArmoryPoints(Armor armor){
        this.armors.add(armor);
    }
}
