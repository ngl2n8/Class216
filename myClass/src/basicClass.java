public class basicClass {
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

}
