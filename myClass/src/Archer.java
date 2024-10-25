import java.util.Random;

public class Archer extends basicClass
{
    {
        this.name = "Cartman";
        this.attack = 15;
    }

    @Override
    void punch(basicClass enemy) {
        Random rnd = new Random();
        int punch = attack + rnd.nextInt(-12, 7);
        enemy.hp -= punch;
        System.out.println(name + " кастанул заклинание с силой "+ punch + " " + enemy.name + " , у противника" +
                "осталось хп: " + enemy.hp);
    }
}
