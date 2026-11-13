package djur;

public class Katt extends Djur{

    public Katt (){
        super(3, 10000);
    }

    @Override
    public String läte() {
        return "UwU, Miiuuaaaoo";
    }

    public void leka(String sak) {
        IO.println("leker med " + sak);
    }
}

