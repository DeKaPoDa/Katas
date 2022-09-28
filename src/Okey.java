public class Okey implements A.B{
    interface C{
        void stop();
    }
    public int goTo(){
        System.out.println("WORD");
        return 5;
    }

    public static void main(String[] args) {
        Okey okey=new Okey();
        okey.goTo();
    }
}
interface A{
    void go();
    interface B{
        int goTo();
    }
}
