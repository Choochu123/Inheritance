package Ex1_Animals;

class Animal {
    public String name;
    public int numLegs;

    public Animal(String s) {
        this.name = s;
        numLegs = 0;
    }

    
    public void talk() {
        System.out.println(name + " is an animal that says \"tbd\"");
    }

    public int getNumLegs() {
        return numLegs;
    }

    public String getName() {
        return name;
    }

}