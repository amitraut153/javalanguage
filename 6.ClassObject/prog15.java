class Demo5{
	int x=10;
	private int y=20;
	static int z=30;
	void disp(){

		System.out.println(x);
		System.out.println(y);  	//error because private variable
		System.out.println(z);
	}
}
class Client{
	public static void main(String[]args){

		Demo5 obj1=new Demo5();
		Demo5 obj2=new Demo5();

		obj1.disp();
		System.out.println("-----------------------");

		obj1.x=100;
		obj2.z=300;

		obj1.disp();
		System.out.println("------------------------");
		obj2.disp();
	}
}
