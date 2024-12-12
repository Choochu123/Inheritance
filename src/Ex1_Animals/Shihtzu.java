package Ex1_Animals;

class Shihtzu extends Dog {
    public int numLegs;

    public Shihtzu(String s) {
        super(s);

    }

    public void talk() {
        System.out.println(name + " is a Shihtzu that says \"Yip!\"");
    }

}