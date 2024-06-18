class StringBufferDemo3{
	public static void main(String[]args){
		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Shashi");
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		sb.append("Bagal");
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		sb.append("core2web");
		System.out.println(sb.capacity());
		System.out.println(sb);
	}
}



