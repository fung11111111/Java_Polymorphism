class Printer{
    private int size;
    private String paper;

    public Printer(int size, String paper) {
        this.size = size;
        this.paper = paper;
    }
    public void printPaper(){
        System.out.println("print something");
    }
}
class Colorprinter extends Printer{
    private boolean isFilled;

    public Colorprinter(int size, String paper, boolean isFilled) {
        super(size, paper);
        this.isFilled = isFilled;
    }
    @Override
    public void printPaper(){
        if(isFilled){
            System.out.println("print something with color");
        }else{
            System.out.println("print something");
        }

    }
}
class BWprinter extends Printer{
    public BWprinter(int size, String paper) {
        super(size, paper);
    }
    @Override
    public void printPaper(){
        System.out.println("print something with black color");
    }
}

class Main {
    public static void main(String[] args) {
        Colorprinter cp = new Colorprinter(20,"A4", true);
        BWprinter bwp = new BWprinter(20,"A5");
        cp.printPaper();
        bwp.printPaper();

    }

}