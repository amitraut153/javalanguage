import java.io.*;
class ArrayDemo2{
	public static void main(String[]args)throws IOException{
		int product=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter elements of an array:");
		for(int i=0; i<size; i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				product=product*arr[i];
			}
		}
		System.out.println("Product is: "+product);
		System.out.println("Elements are: ");
		for(int j=0; j<size; j++){
			System.out.println(arr[j]);
		}
	}
}
