class Demo11{
	int x=10;
	static int y=20;

	Demo11(){

		System.out.println("In Constructor");
	}
	static {

		System.out.println("In Static block1");
	}
	{

		System.out.println("In Instance block1");
	}
	public static void main(String[]args){
		Demo11 obj=new Demo11();
		System.out.println("In Main");

	}
	static {
		
		System.out.println("In Static block2");
	}
	{

		System.out.println("In Insstance block2");
	}
}

