package djur;

public class Hund extends Djur {
    public Hund() {
        super(5, 20000);
    }

    @Override
    public String läte() {
        return "Vofff";
    }

    public void spåra(String bytet) {
        IO.println("spårar " + bytet);
    }
}