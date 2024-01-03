package Poly;
public class Bank {
    float getRateofInterest(){
        return 0;
    }
}

class ICICI extends Bank {

    float getRateofInterest(){
        return 8.5f;
    }
}

class Sbi extends Bank {

    @Override
    float getRateofInterest() {
        return 7.f;
    }
}

class Axis extends Bank{

    @Override
    float getRateofInterest() {
        return 8.9f;
    }
}

class TestPoly{

    public static void main(String[] args) {

        Bank b;
        b=new ICICI();
        System.out.println("ICICI rate of interert is:"+b.getRateofInterest());
        b=new Sbi();
        System.out.println("SBI rate of interest is:"+b.getRateofInterest());
        b=new Axis();
        System.out.println("SBI rate of interest is:"+b.getRateofInterest());


    }
}