
public class Test {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.price=100;
		//c.start();
		
		
		BMW B =new BMW();
		B.price=200;
		//B.start();
		B.theftsafety();
		
		System.out.println("*************************");
		
		c.start();
		B.start();
		//only calls functions of super class
		//if any function is overridden ,that wil be called
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();

	}

}
