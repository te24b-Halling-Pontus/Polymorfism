import djur.Djur;
import djur.Hund;
import djur.Katt;
import djur.Mus;

void main() {

    Djur[] djuren = new Djur[5];
    djuren[0] = new Hund();
    djuren[1] = new Hund();
    djuren[2] = new Katt();
    djuren[3] = new Katt();
    djuren[4] = new Mus();
    for (Djur djur : djuren) {
        IO.println(djur.läte());
        if (djur instanceof Hund hunden) {
            hunden.spåra("råttor");
        } else if (djur instanceof Katt katten) {
            katten.leka("mus");
        } else if (djur instanceof Mus musen) {
            musen.klätrar();
        }
    }

}
