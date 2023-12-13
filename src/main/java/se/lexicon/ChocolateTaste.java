package se.lexicon;

public enum ChocolateTaste {
    OREO(1),
    MINT(2),
    ORANGE(3),
    DEFAULT(0);

    private int id;

    public int getId(){return id;}
    private ChocolateTaste(int id)
    {
        this.id = id;
    }
}
