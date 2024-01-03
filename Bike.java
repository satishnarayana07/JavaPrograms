
public class Bike {

    void run(){
        System.out.println("bike has started");
    }
    //final void run(){
    //        System.out.println("bike has started");
    //    }
}

class Honda extends Bike{

    void run(){
        System.out.println("Honda has started");
    }
}

class Ride{

    public static void main(String args[]){

        Honda h=new Honda();
        h.run();
    }
}