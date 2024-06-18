import java.io.*;
class SearchEle{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of an array: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		System.out.println("Enter elements: ");

		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		System.out.println("Enter elements to search: ");
		int search=Integer.parseInt(br.readLine());

		for(int i=0; i<arr.length; i++){
			if(arr[i]==search){
				System.out.println("Elements found at index= "+i);
			}
		}
	}
}
