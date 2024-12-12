package Ex1_Animals;

class Dog extends Animal {
    // numLegs
    public Dog(String s) {
        super(s); // calls the parent constructor
        this.numLegs = 4;
    }//Dog

    public void talk() {
        System.out.println(name + " is a dog that says \"Bark!\"");
    }//talk

}//Animal