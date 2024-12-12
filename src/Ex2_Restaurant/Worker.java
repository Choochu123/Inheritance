package Ex2_Restaurant;

public class Worker extends Employee {
    private double wage;
    private double numHours;

    public Worker(double w) {
    wage = w;
    numHours = 160 * Math.random(); //temporary random
    }

    public double getPay() {
        double monthlyPay = wage * numHours;
        double tax = monthlyPay * 0.2;

        taxesCollected += tax;
        return monthlyPay - tax;
    }
}
