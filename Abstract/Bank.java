package Abstract;

abstract class Bank {
    abstract int getRateOfInterest();
}
class Pob extends Bank{

    int getRateOfInterest(){
        return 7;
    }
}

class Apgvb extends  Bank{

    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class TestAbstract2{
    public static void main(String[] args) {
        Bank b;
        b=new Pob();
        System.out.println("POB interest is:"+b.getRateOfInterest());
        b=new Apgvb();
        System.out.println("POB interest is:"+b.getRateOfInterest());

    }
}
