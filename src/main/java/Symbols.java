public enum Symbols {

    CHERRY(10),
    BAR(25),
    BELL(50),
    SEVEN(100);


    private final int value;

    Symbols(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

}
