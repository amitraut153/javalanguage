class StringDemo2{
	public static void main(String[]args){
		String str1="Core2Web";
		String str2=new String("Core2Web");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		String str3="Core2Web";
		String str4=new String("Core2Web");

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		String str5=str1.concat(str2);

		System.out.println(str5);

	}
}

