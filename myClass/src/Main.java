
public class Main {
    public static void main(String[] args) {
        Warrior barsik = new Warrior("Tom");

        Warrior g1 = new Warrior();
        Warrior g2 = new Warrior("Kruz");

        barsik.disployInfo();
        g1.disployInfo();
        g2.disployInfo();

        Archer d1 = new Archer();

        battle(barsik, d1);
    }

    static void battle(basicClass an1, basicClass an2){
        System.out.println("Battle");
        while (an1.hp > 0 && an2.hp > 0){
            an1.punch(an2);
            an2.punch(an1);
        }
        if(an1.hp <= 0) System.out.println("Победил " + an2.name);
        if(an2.hp <= 0) System.out.println("Победил " + an1.name);
        if(an1.hp <= 0&& an2.hp <= 0) System.out.println("лохи друг друга убили");
    }
}
