public class Auto extends Policy {
    private String make;
    private String model;
    private double liability;
    private double collision;

    public Auto(String firstName, String lastName, String make, String model, double liability, double collision) {
        super(firstName, lastName);
        this.make = make;
        this.model = model;
        this.liability = liability;
        this.collision = collision;
    }

    @Override
    public void getCommission() {
        commission = (liability + collision) * 0.30;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLiability() {
        return liability;
    }

    public void setLiability(double liability) {
        this.liability = liability;
    }

    public double getCollision() {
        return collision;
    }

    public void setCollision(double collision) {
        this.collision = collision;
    }

    @Override
    public String toString() {
        return "Auto Policy\n-----------\n" +
               super.toString() +
               "Make: " + make + "\n" +
               "Model: " + model + "\n" +
               "Liability: $" + String.format("%.2f", liability) + "\n" +
               "Collision: $" + String.format("%.2f", collision) + "\n";
    }
}
