package djur;
public class Djur {
    protected float vikt;
    protected int energi;
    protected boolean lever;
    protected static int antal_djur = 0;

    Djur(float vikt, int energi) {
        this.vikt = vikt;
        this.energi = energi;
        this.lever = true;
        antal_djur++;
    }

    void äta() {
        energi += 100;
    }

    void spring(int meter) {
        this.energi -= meter * vikt;
        if (this.energi < 0) {
            this.lever = false;
        }
    }

    public String läte() {
        return "djuret låter";
    }
}

