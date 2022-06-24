public class FruitMachine {


    private Reels reel1;
    private Reels reel2;
    private Reels reel3;
//    private Reels reel4;
//    private Reels reel5;

    public FruitMachine() {
        reel1 = new Reels();
        reel2 = new Reels();
        reel3 = new Reels();
//        reel4 = new Reels();
//        reel5 = new Reels();
    }

    public void spin(){
        reel1.setRandomSymbol();
        reel2.setRandomSymbol();
        reel3.setRandomSymbol();
//        reel4.setRandomSymbol();
//        reel5.setRandomSymbol();

    }

    public void printSpinners(){
        System.out.println(reel1.getSymbol());
        System.out.println(reel2.getSymbol());
        System.out.println(reel3.getSymbol());
//        System.out.println(reel4.getSymbol());
//        System.out.println(reel5.getSymbol());
    }

//    public String noWin() {
//        if (Symbols.values() != Symbols.values())
//                return "0";
//        return null;
//    }

    public int getWinnings(){
        if (!isAllMatching()) {
            return 0;
        } else {
            System.out.println("You won!");
            return (reel3.getSymbol().getValue());
        }
    }
    private boolean isAllMatching(){
        if ((reel1.getSymbol() == reel2.getSymbol()) && (reel3.getSymbol() == reel1.getSymbol())){
            return true;
        } else {
            return false;
        }
    }


}