import java.util.Random;

public class Warrior extends basicClass {//was cat
    {
        this.name = "Koshak";
        this.attack = 14;

    }


    void disployInfo(){
        System.out.println(name + " ");
    }
    boolean isUsed;
    Warrior(String name){

        this.name = name;
    }


    Warrior(){

    }

    @Override
    void punch(basicClass enemy) {
        Random rnd = new Random();
        int punch = attack + rnd.nextInt(-5, 5);
        enemy.hp -= punch;
        System.out.println(name + " ударил палкой c силой "+ punch + " " + enemy.name + " , у противника" +
                "осталось хп: " + enemy.hp);
        int willHeUseBattleTrance =rnd.nextInt(0,1);
        if(willHeUseBattleTrance==1){
            battleTrance();
        }
    }
    void battleTrance() {
        if (isUsed == false) {
            if (hp != 0 || hp > 0) {
                if (hp % 2 == 0) {
                    System.out.println("warrior used battle trance!");
                    attack += 3;
                    hp /= 2;
                    isUsed =true;
                } else {
                    System.out.println("Warrior hp is odd,sry");
                }
            }

        }
    }
}