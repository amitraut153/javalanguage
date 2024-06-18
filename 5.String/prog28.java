class StringBufferDemo8{
	public static void main(String[]args){
		String str1="Amit";
		String str2=new String("Raut");
		StringBuffer str3=new StringBuffer("Geniustech");
		String str4=str1.concat(str3);
		String str5=str3.append(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}



