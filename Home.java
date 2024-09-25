public class Home extends Policy {
    private int footage;
    private double dwelling;
    private double contents;
    private double liability;


    public Home() {
        super("", "");
    }

    @Override
    public void getCommission() {
        commission = (liability * 0.30) + ((dwelling + contents) * 0.20);
    }

    // Getters and Setters
    public int getFootage() {
        return footage;
    }

    public void setFootage(int footage) {
        this.footage = footage;
    }

    public double getDwelling() {
        return dwelling;
    }

    public void setDwelling(double dwelling) {
        this.dwelling = dwelling;
    }

    public double getContents() {
        return contents;
    }

    public void setContents(double contents) {
        this.contents = contents;
    }

    public double getLiability() {
        return liability;
    }

    public void setLiability(double liability) {
        this.liability = liability;
    }

    @Override
    public String toString() {
        return "Home Policy\n-----------\n" + 
               super.toString() +
               "Footage: " + footage + "\n" +
               "Dwelling: $" + String.format("%.2f", dwelling) + "\n" +
               "Contents: $" + String.format("%.2f", contents) + "\n" +
               "Liability: $" + String.format("%.2f", liability) + "\n";
    }
}
