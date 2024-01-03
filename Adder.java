public class Adder {

    static int add(int a, int b){
        return a+b;
    }

    static double add(double a, double b, double c){
        return a+b+c;
    }
}

//Method Overloading with same data type
/*class TestOverloading1{

    public static void main(String args[]){

        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(22,22,22));
    }
}*/

//Method Overloading with different data type

class TestOverloading2{
    public static void main(String args[]){

        System.out.println(Adder.add(44,55));
        System.out.println(Adder.add(10.4,11.5,33.45));

    }
}

