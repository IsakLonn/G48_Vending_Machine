package se.lexicon.util;

public enum Coins {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONE_HUNDRED(100),
    TWO_HUNDRED(200),
    FIVE_HUNDRED(500),
    ONE_THOUSAND(1000);

    private int value;

    public int getValue(){return value;}

    Coins(int value){
        this.value = value;
    }
}
