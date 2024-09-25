public abstract class Policy {
    protected String firstName;
    protected String lastName;
    protected double commission;

    public Policy(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void getCommission();

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
               "Commission: $" + String.format("%.2f", commission) + "\n";
    }
}
