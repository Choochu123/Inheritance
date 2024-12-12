package Ex2_Restaurant;

public class Manager extends Employee {
    private int salary;

    public Manager(int s) {
        salary = s;
    }//Manager

    public double getPay() {
        double monthlyPay = salary / 12;
        double tax = monthlyPay * 0.2;

        taxesCollected += tax;
        return monthlyPay - tax;
    }


}
