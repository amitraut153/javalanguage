class ReplaceDemo{
	public static void main(String[]args){
		StringBuffer str1= new StringBuffer("Know The Code Untill The Code");

		System.out.println(str1);
		str1.replace(14,20,"Till");
		System.out.println(str1);
	}
}
