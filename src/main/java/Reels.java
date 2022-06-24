import java.util.Random;

public class Reels {

    private Symbols symbols;

    public Symbols getSymbol() {
        return symbols;
    }

    public void setRandomSymbol(){
        int reel = new Random().nextInt(3);
        symbols = Symbols.values()[reel];
    }


}
