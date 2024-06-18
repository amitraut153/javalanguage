import java.io.*;
class ArrayDemo7{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;

		System.out.println("Enter size of an elements: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		System.out.println("Enter elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.println("count of even number= "+count);
	}
}
