class StringDemo5{
	public static void main(String[]args){
		String str1="Amit";
		String str2="Raut";

		System.out.println(str1+str2);
		String str3="AmitRaut";
		String str4=str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

