//Deprecated

class Parent{
	@Deprecated
	void m1(){
		System.out.println("Parent m1");
	}
}

class Client{
	@SuppressWarnings("Hello")
	public static void main(String[]args){

		Parent p=new Parent();
		p.m1();
	}
}
