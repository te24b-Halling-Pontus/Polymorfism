package djur;

public class Mus extends Djur {
    public Mus() {
        super(1, 5000);
    }

    @Override
    public String läte() {
        return "piiip";
    }

    public void klätrar(){
        IO.println("Musen klätrar");
    }
}
