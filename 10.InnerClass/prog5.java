//*****
class Demo{
	Demo(){
		System.out.println("In Demo constructor");
	}
}

class DemoChild extends Demo{
	DemoChild(){
		System.out.println("In constructor DemoChild");
	}
}

class Parent{
	Parent(){
		System.out.println("In Parent constructor");
	}

	Demo m1(){
		System.out.println("In M1 Parent");
		return new Demo();
	}
}

class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}

	DemoChild m1(){
		System.out.println("In m1 child");
		return new DemoChild();
	}
}

class Client{
	public static void main(String[]args){
		Parent p=new Child();
		p.m1();
	}
}
