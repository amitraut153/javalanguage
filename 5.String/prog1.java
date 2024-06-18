class StringDemo{
	public static void main(String[]args){
		String str1="Core2Web";
		String str2=new String("Core2web");

		char str3[]={'C','2','W'};

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);


		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
