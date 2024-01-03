//Inheritance
//Has-a Relationship in Aggregation Example
public class Emp {

	int id;
	String name;
	Address address;

	public Emp (int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}

	void display(){

		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {

		Address ad1=new Address("PPM","Andra","IND");
		Address ad2=new Address("HYD", "Telangana","IND");

		Emp e1=new Emp(111,"Sairam",ad1);
		Emp e2=new Emp(222,"Sambasiva",ad2);

		e1.display();
		e2.display();
	}

}
