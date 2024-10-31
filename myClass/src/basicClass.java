import java.util.ArrayList;

public class basicClass  {
    String name;
    int hp = 50;
    int attack;

    void punch(basicClass enemy){
    }
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
