import java.util.Random;

import static java.lang.Math.pow;

public class magician extends basicClass{
    {
        this.hp=80;
        this.attack=5;

    }
    int mana = 1;
    @Override
    void punch(basicClass enemy) {
        Random rnd = new Random();
        int punch = attack ;
        if (rnd.nextInt(0, 7) == 7) {
            spell(enemy);
        } else if (Math.abs(rnd.nextInt(-11, 11))%2==0) {
            regenMana();
        } else {
//            doNothing();
            enemy.hp -= punch;
            System.out.println(name + " ударил с силой "+ punch + " " + enemy.name + " , у противника" +
                    "осталось хп: " + enemy.hp);
        }

    }
    void spell(basicClass enemy){
        Random rnd = new Random();
        double spellDamage = pow(attack,3)/2;
        mana =0;
        enemy.hp -= (int) spellDamage;
        System.out.println(name + "кастанул на руку скилл и как ударил на" + spellDamage + " " + enemy.name + "у противника" +
                "осталось хп: " + enemy.hp);
    }

    int regenMana() {
        return mana==0?mana=1:doNothing();
    }
    int doNothing(){return 0;}//just doing nothing
}
