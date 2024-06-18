import java.util.*;

class StringDemo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Player Info");
		String str=sc.nextLine();
		
		StringTokenizer st= new StringTokenizer(str," ");

		String token1=st.nextToken();
		String token2=st.nextToken();
		String token3=st.nextToken();

		String name=token1;
		int jerNo=Integer.parseInt(token2);
		float avg=Float.parseFloat(token3);

		System.out.println("Player name= "+token1);
		System.out.println("JerNo= "+token2);
		System.out.println("Average= "+token3);

	}
}
