class Demo2{
	int x=10;
	static int y=20;

	void fun(){
		System.out.println("In fun method");
	}
	static void gun(){
		System.out.println("In gun method");
	}
	public static void main(String[]args){
		Demo2 obj=new Demo2();

		System.out.println(obj.x);
		System.out.println(y);
		obj.fun();
		gun();
	}
}

