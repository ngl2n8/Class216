import java.util.Random;


public class Warrior extends basicClass {//was cat
    {
        this.name = "qwe";
        this.attack = 14;
        this.hp =120;
    }
    boolean isUsed=false;
    int doNothing(){return 0;}
    void disployInfo(){
        System.out.println(name + " ");
    }
    Warrior(String name){

        this.name = name;
    }


    Warrior(){
    if(pr()){
        doNothing();
    }else{
        System.out.println("u r moron");
    }
    }

    @Override
    void punch(basicClass enemy) {
        Random rnd = new Random();
        int punch = attack + rnd.nextInt(-5, 5);
        int damageBonus=0;
        for(Weapon weap : weapons){
            damageBonus += weap.damageBonus;
        }
        float protect=0;
        for(Armor arm : armors){
            protect +=arm.minusDamage;
        }
        float cantAmagineName =  punch + damageBonus;
        enemy.hp -= cantAmagineName-protect;
        System.out.println(name + " ударил палкой c силой "+ cantAmagineName+ " " + enemy.name + " защитился на " + protect+" , у противника " +
                "осталось хп: " + enemy.hp);
        int willHeUseBattleTrance =rnd.nextInt(0,1);
        if(willHeUseBattleTrance==1){
            battleTrance();
        }
    }
    void battleTrance() {
        if (!isUsed) {
            if (hp != 0 && hp > 0) {
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
