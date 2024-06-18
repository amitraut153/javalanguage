class ConstrDemo2{
	ConstrDemo2(){
		System.out.println("In Constructor");
	}
	void fun(){
		ConstrDemo2 obj=new ConstrDemo2();
		System.out.println(obj);

	}
	public static void main(String[]args){
		ConstrDemo2 obj1=new ConstrDemo2();
		ConstrDemo2 obj2=new ConstrDemo2();

		System.out.println(obj1);
		System.out.println(obj2);

		obj1.fun();
	}
}
