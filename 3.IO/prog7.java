import java.util.*;
class StringDemo2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Player Info");
		String str= sc.nextLine();

		StringTokenizer st=new StringTokenizer(str," ");

		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
