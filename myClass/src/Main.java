
public class Main {
    public static void main(String[] args) {
        Archer luchnik = new Archer("random luchnik");
        Warrior voin = new Warrior(" Tom Kruz");
        Magician mag = new Magician("mag epta");
        Armor armory = new Armor(2);
        Weapon weapon = new Weapon(1);
        voin.addArmoryPoints(armory);
        mag.addArmoryPoints(armory);
        mag.addDamage(weapon);



        battle(voin, mag);
    }

    static void battle(basicClass an1, basicClass an2){
        System.out.println("Battle");
        while (an1.hp > 0 && an2.hp > 0){
            an1.punch(an2);
            an2.punch(an1);
            System.out.println();
        }
        if(an1.hp <= 0) System.out.println("Победил " + an2.name);
        if(an2.hp <= 0) System.out.println("Победил " + an1.name);
        if(an1.hp <= 0&& an2.hp <= 0) System.out.println("лохи друг друга убили");
    }
}
