import java.io.*;
class DigitAdd{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of an array: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter elements of an array: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		System.out.println("Output: ");

		for(int i=0; i<arr.length; i++){
			int temp=arr[i];

			while(temp != 0){
				int rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}
			sum=0;
		}
	}
}
