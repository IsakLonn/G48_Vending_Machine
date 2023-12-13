package se.lexicon;

public class ChocolateBar extends Product{
    private ChocolateTaste taste;

    public void setTaste(ChocolateTaste taste) {
        if(taste == null) throw new IllegalArgumentException("Taste is null");
        this.taste = taste;
    }
    public ChocolateTaste getTaste(){return taste;}

    public ChocolateBar(String productName, double price, ChocolateTaste taste) {
        super(productName, price,ProductId.CHOCOLATE.getId() + taste.getId());
        setTaste(taste);
    }

    @Override
    public String examine() {
        return "This chocolate bar has the added taste of " + getTaste();
    }

    @Override
    public String use() {
        return switch (getTaste()) {
            case MINT -> "You eat the chocolate bar, it tastes like heavenly mint";
            case OREO -> "You eat the chocolate bar, it has chunks of oreo in it";
            case ORANGE -> "You eat the chocolate bar, it tastes like somewhat like an orange";
            case DEFAULT -> "You eat the chocolate bar, it tastes like a normal chocolate bar";
        };

    }
}
