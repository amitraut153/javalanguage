class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}

	void property(){
		System.out.println("Home, Car, Gold");
	}

	void marry(){
		System.out.println("Disha");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Vaishnavi");
	}
}

class Client{
	public static void main(String[]args){
		Child obj=new Child();
		obj.property();
		obj.marry();
	}
}
		
