class Pet{
    private int age;
    private int legs;

    public Pet(int age, int legs) {
        this.age = age;
        this.legs = legs;
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
   
    
    public void eating(){
        System.out.println("");
    }
    public void eating(boolean sound){
        if(sound){
            System.out.println("eat eat eat");
        }
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