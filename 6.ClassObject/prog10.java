class Core2Web{
	int noOfCources=8;
	private String favCource="javadsa";

	void disp(){
		System.out.println(noOfCources);
		System.out.println(favCource);

	}
}
class Student2{
	public static void main(String[]args){
		Core2Web obj=new Core2Web();
		obj.disp();

		System.out.println(noOfCources);
		System.out.println(obj.favCource);//error it is a private that means it cannot access out of the self class 
	}
}
