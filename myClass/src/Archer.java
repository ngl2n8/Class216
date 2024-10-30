import java.util.Random;

public class Archer extends basicClass
{
    {
        this.name = "Cartman";
        this.attack = 10;
        this.hp =100;
    }

    @Override
    void punch(basicClass enemy) {
        Random rnd = new Random();
        int punch = attack + rnd.nextInt(-12, 7);
        enemy.hp -= punch;
        System.out.println(name + " ударил с силой "+ punch + " " + enemy.name + " , у противника" +
                "осталось хп: " + enemy.hp);
    }
    void shoot(basicClass enemy){
        Random rnd = new Random();
        int shoot = attack + rnd.nextInt(-20, 30);
        enemy.hp -= shoot;
        System.out.println(name + " ударил с силой "+ shoot + " " + enemy.name + " , у противника" +
                "осталось хп: " + enemy.hp);
    }
}
