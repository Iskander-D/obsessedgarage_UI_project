package data;

public enum Currency {
    DOMINICAN("DOP"),
    BRUNEI("BND");


    public final String label;
    Currency(String label) {
        this.label = label;
    }
}
