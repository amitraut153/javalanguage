import java.io.*;
class ArrayDemo5{
	public static void main(String[]args)throws IOException{
		BufferedReader br=inew BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];

		System.out.println("Enter array elements:");
		for(int i=0; i<5; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Array elements are:");
		for(int j=0; j<5; j++){
			System.out.println(arr[j]);
		}
	}

}

