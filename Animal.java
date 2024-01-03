public class Animal {

    public void eat()
    {
        System.out.println("Animal is eating");
    }
}
//Example of single inheritance
/*class Dog extends Animal{

       void bark(){
           System.out.println("Dog is barking");
       } */
//Example of Multilevel Inheritence
/*class Dog extends Animal{ void bark()
{ System.out.println("Dog is barking");} }

    class BabyDog extends Dog
    { void weep() { System.out.println("baby dog is weeping");}


*/

//Example of Hierarchical inheritance

class Dog extends Animal{
    void bark(){System.out.println("Dog is barking");}
    }
    class Cat extends Animal
    {
        void Meow(){System.out.println("cat is Meowing");} }

class HierachiInheritance{
        public static void main (String args[]) {

         Cat c = new Cat();

            c.eat();
            c.Meow();
        }

        }


