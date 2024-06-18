class ReverseDemo{
	public static void main(String[]args){
		StringBuffer sb=new StringBuffer("Amit");
		System.out.println(sb.reverse());

		String str1="Core@Web";
		StringBuffer sb2=new StringBuffer(str1);

		str1=sb2.reverse().toString();
		System.out.println(str1);
	}
}
