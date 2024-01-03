package Poly;

//Examples of Run time polymorphism
public class Shape {

    void draw(){
        System.out.println("drawing");
    }
}

class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Rectangle drawing....");
    }
}

class Circle extends Shape{

    void draw(){
        System.out.println("circle is dawing");
    }
}

class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("Triangle is drawing...");
    }
}

class RuntimePoly{

    public static void main(String[] args) {
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}
