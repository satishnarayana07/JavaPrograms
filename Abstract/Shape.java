package Abstract;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape{

    void draw(){
        System.out.println("Rectangle drawn");
    }
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Circle drawn");
    }
}

class Testabstract{
    public static void main(String[] args) {
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
    }
}


