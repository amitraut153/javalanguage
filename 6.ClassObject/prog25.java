class Demo10{
	int x=10;
	Demo10(){
		System.out.println("In constructor");
	}
	void fun(){

		System.out.println(x);
	}
	public static void main(String[]args){
		Demo10 obj1=new Demo10();
		obj1.fun();
	}
}
