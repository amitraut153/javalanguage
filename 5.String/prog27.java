class StringBufferDemo7{
	public static void main(String[]args){
		String str1="Shashi";
		String str2=new String("Core2Web");
		StringBuffer str3=new StringBuffer("Core2Web");
		StringBuffer str4=str3.append(str1);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
