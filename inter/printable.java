package inter;

interface printable {
    void print();
}

class A6 implements printable{

    public void print(){
        System.out.println("A6 is printing");
    }

    public static void main(String[] args) {
        A6 a=new A6();
        a.print();
    }
}

