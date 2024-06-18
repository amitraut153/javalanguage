class Demo10{
	int x=10;

	Demo10(){
		System.out.println("Constructor");
	}
	{
		System.out.println("Instance Block1");
	}

	public static void main(String[]args){
		Demo10 obj=new Demo10();
		System.out.println("Main method");
	}
	{
		System.out.println("Instance Block2");
	}
}
