class Parent{
	static void fun(){
		System.out.println("In parent fun");
	}
}

class Child extends Parent{
	
	static void fun(){
		System.out.println("In child fun");
	}

}
class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.fun();

		Child obj1=new Child();
		obj1.fun();

		Parent obj2=new Parent();
		obj2.fun();
	}
} 

