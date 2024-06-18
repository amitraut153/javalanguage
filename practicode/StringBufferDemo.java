
public class StringBufferDemo{

	public static void main(String[]args){
		StringBuffer str1=new StringBuffer("Amit");
		System.out.println(str1.capacity());

		System.out.println(System.identityHashCode(str1));
		str1.append("DnyaneshwarRaut");

		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

	}
}
