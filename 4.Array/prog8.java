import java.io.*;
class ArrayDemo8{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int EvenCount=0;
		int OddCount=0;

		System.out.println("Enter size of an array: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		System.out.println("Enter elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				EvenCount++;
			}
			else{
				OddCount++;
			}
		}
		System.out.println("Even count is: "+EvenCount);
		System.out.println("Odd count is: "+OddCount);
	}
}


