import java.util.*;
class DataOverflowException extends RuntimeException{
	DataOverflowException(String msg){

		super(msg);
	}
}
class DataOverFlowException extends RuntimeException{
	DataOverFlowException(String msg){
		super(msg);
	}
}

class ArrayDemo{
	public static void main(String[]args){
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer value");
		System.out.println("Note:0<elements<100");

		for(int i=0; i<arr.length; i++){
			int data=sc.nextInt();
			if(data<0){
				throw new DataUnderFlowException("Mitra Data 0 peksha kami aahe");
			}
			if(data>100){
				throw new DataUnderFlowException("Mitra Data 100 peksha kami aahe");
			}
			arr[i]=data;
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
		}
	}
}

