import java.util.*;
class StringLen{
	static int myStrlen(String str){
		char []arr=str.toCharArray();
		int count=0;

		for(int i=0; i<arr.length; i++){
			count++;
		}
		return count;			// or /*.......*/ String
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		String str1=sc.next();
		String str2=sc.next();

		if(myStrlen(str1)==myStrlen(str2)){
			System.out.println("Length Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}
}
