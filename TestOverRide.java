public class TestOverRide {  //creating parent class

    int getRateofIntrest()
    { return 0;
    }
}

 class ICICI extends TestOverRide{ //creating child class

    int getRateofIntrest(){
        return 9;}
}

 class SBI extends TestOverRide {

    int getRateofIntrest(){
        return 8;}
}

 class Axis extends TestOverRide{

    int getRateofIntrest(){
        return 7;}
}

class Test{
    public static void main(String args[]){

        ICICI i=new ICICI();
        SBI s=new SBI();
        Axis a=new Axis();
        System.out.println("ICICi rate of interest:"+i.getRateofIntrest());
        System.out.println("SBI rate of interest:"+s.getRateofIntrest());
        System.out.println("Axis rate of interest:"+a.getRateofIntrest());
    }
}