public class Life extends Policy {
    private int age;
    private double term;

    public Life(String firstName, String lastName, int age, double term) {
        super(firstName, lastName);
        this.age = age;
        this.term = term;
    }

    @Override
    public void getCommission() {
        commission = term * 0.20;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Life Policy\n--------------\n" + 
               super.toString() +
               "Age: " + age + "\n" +
               "Term: $" + String.format("%.2f", term) + "\n";
    }
}
