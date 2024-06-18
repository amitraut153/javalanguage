class Parent{
	Object fun(){
		Object obj=new Object();
		System.out.println("Object fun");
		// shortcut==return new Object();
		return obj;
	}
}
class Child extends Parent{
	String fun(){

		System.out.println("Child fun");
		return "Shashi";
	}
}
class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.fun();
	}
}
