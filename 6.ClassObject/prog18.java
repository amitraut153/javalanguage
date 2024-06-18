class Demo7{
	int jerNo=18;
	static String name="Virat";

	void disp(){
		System.out.println(jerNo);
		System.out.println(name);
	}

	static void Player(){

		System.out.println(name);
	}
}
class Cricket{
	public static void main(String[]args){
		Demo7 obj=new Demo7();
		obj.disp();
		obj.Player();

		System.out.println(obj.jerNo);
		System.out.println(obj.jerNo);
	}
}

