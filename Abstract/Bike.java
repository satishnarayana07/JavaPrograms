package Abstract;
//Example of an abstract class that has abstract and non-abstract methods
abstract class Bike {
    Bike(){
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear(){
        System.out.println("Gear changed");
    }

}
class Honda extends Bike{

    void run(){
        System.out.println("Honda started");
    }
}


class Testabstract3{

    public static void main(String[] args) {
        Bike b;
        b=new Honda();
        b.run();
        b.changeGear();
    }
}
