class Demo9{
	static{
		System.out.println("Static block1");
	}
	public static void main(String[]args){
		System.out.println("In Demo main");
	}
}
class Client{
	static {
		System.out.println("Static Block2");
	}
	public static void main(String[]args){
		System.out.println("In Client main");
	}
	static {
		System.out.println("Static block3");
	}
}




