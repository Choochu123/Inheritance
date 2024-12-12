package Ex1_Animals;

class Trout extends Animal {
    // numLegs
    public Trout(String s) {
        super(s);
        
    }

    public void talk() {
        System.out.println(name + " is a fish. Fish do not speak");
    }

}