
public class Main {
    public static void main(String[] args) {
        Archer g1 = new Archer("random luchnik");
        Warrior g2 = new Warrior(" Tom Kruz");
        Armor armory = new Armor(10);
        g2.addArmoryPoints(armory);
        g2.disployInfo();


        battle(g2, g1);
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
