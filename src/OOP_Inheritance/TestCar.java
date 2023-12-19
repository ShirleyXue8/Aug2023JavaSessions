package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//overridden
		BMW.billing();
		Car.billing();
		System.out.println(b.maxSpeed);
		b.selling();
		
		
		System.out.println("--------");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//top/up casting:
		//child  class object can be referred by parent class ref variable:
		
		System.out.println("--------");
		Car c1=new BMW();// BMW start
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		System.out.println("--------");
		//child class object can be referred by grand parent class ref variable:
		Vehicle v1=new BMW();
		v1.engine();
		
		
		//down casting :parent class object can be referred by child class ref variable????
//		BMW b1=(BMW)new Car();//ClassCastException
		
//		BMW b2=(BMW)new Vehicle();//ClassCastException
		
		
		//page
		//LP
		//HP
		//RP
		//Page p=new LP();YES
		//LP p1=new Page;

	}

}
