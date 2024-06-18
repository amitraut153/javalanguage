
class StringBufferDemo1{
	public static void main(String[]args){
		StringBuffer sb=new StringBuffer("Shashi");

		System.out.println(System.identityHashCode(sb));
		sb.append("Sir");

		System.out.println(sb);
	}
}

