class Demo{
	void m1(){
		System.out.println("In m1");
	}

	void m2(){

		System.out.println("In m2");
	}
	public static void main(String[]args){

		System.out.println("Start Main");
		Demo obj=new Demo();
		obj.m1();
		obj=null;
		try {
			obj.m2();
		}
		catch(NullPointerException obj1){
			
			System.out.println("Exption Handled");
		}
		System.out.println("End main");
		
	}
}


