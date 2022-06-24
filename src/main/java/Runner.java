public class Runner {

    public static void main(String[] args) {
        FruitMachine fruitMachine = new FruitMachine();
        fruitMachine.spin();
        fruitMachine.printSpinners();
        int winnings = fruitMachine.getWinnings();
        System.out.println(winnings);


//        System.out.println(fruitMachine.noWin());

    }
}