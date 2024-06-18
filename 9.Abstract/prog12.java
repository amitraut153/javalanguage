interface Demo{
	void gun();

	default void fun(){

		System.out.println("In fun Demo");
	}
}

class DemoChild implements Demo{

	public void gun(){
		System.out.println("In gun ChildDemo");
	}
}

class Client{
	public static void main(String[]args){

		Demo obj=new DemoChild();	// cannot find symbol
		obj.gun();
		obj.fun();
	}
}

