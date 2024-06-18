class Demo11{
	int x=10;
	Demo11(){
		System.out.println("In constructor");
		System.out.println(this);
		System.out.println(this.x);
	}

	void fun(){

		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String[]args){
		Demo11 obj1=new Demo11();
		System.out.println(obj1);
		obj1.fun();

	}
}

