class Outer{
	int x=10;
	static int y=20;
	class Inner{
		int a=30;
		final static int b=40;
	}
}
class Client{
	public static void main(String[]args){
		Outer obj=new Outer();
		Outer.Inner obj2=obj.new Inner();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj.new Inner().a);
	}
}
