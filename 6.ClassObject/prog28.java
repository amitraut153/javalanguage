class Demo13{
	int x=10;

	Demo13(){

		System.out.println("In No args contruction");
	}
	Demo13(int x){
		this();
		System.out.println("In Para Contruction");
	}

	public static void main(String[]args){

		Demo13 obj1=new Demo13();
	}
}
