class Pet{
    private int age;
    private int legs;

    public Pet(int age, int legs) {
        this.age = age;
        this.legs = legs;
    }
    public void sound(){
        System.out.println("hi");
    }
}
class Cat extends Pet {
    private boolean run;
    private boolean bitePeople;
    public Cat(int age, int legs, boolean run, boolean bitePeople) {
        super(age, legs);
        this.run = run;
        this.bitePeople = bitePeople;
    }
    @Override
    public void sound(){
        System.out.println("meow");
    }

}
class Dog extends Pet {
    public Dog(int age, int legs) {
        super(age, legs);
    }
    @Override
    public void sound(){
        System.out.println("Bark");
    }
}
//'Java'
class Main {
    public static void main(String[] args) {
        Dog d = new Dog(2,4);
        Cat c = new Cat(3,4,true,true);
        d.sound();
        c.sound();

    }

}