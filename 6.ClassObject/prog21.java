class Demo8{
	int x=10;
	static int y=20;

	static {
		System.out.println("Static block1");
	}
	public static void main(String[]args){
		
		System.out.println("Main Method");

		Demo8 obj=new Demo8();
		System.out.println(obj.x);
	}
	static {
		System.out.println("Static block2");
		System.out.println(y);
	}
}


