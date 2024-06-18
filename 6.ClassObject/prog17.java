class Demo6{
	int x=10;
	static int y=20;

	void fun1(){
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
		System.out.println(y);
	}
}
class Client2{
	public static void main(String[]args){
		Demo6 obj=new Demo6();
		obj.fun1();
		obj.fun2();

		Demo6.fun2();

		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
