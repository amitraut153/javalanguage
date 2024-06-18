// print the sum of the array row wise
import java.io.*;
class RowSum{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int arr[][]=new int[3][4];

/*		arr[0][0]=Integer.parseInt(br.readLine());
		arr[0][1]=Integer.parseInt(br.readLine());
		arr[0][2]=Integer.parseInt(br.readLine());
		arr[0][3]=Integer.parseInt(br.readLine());
		arr[1][0]=Integer.parseInt(br.readLine());
		arr[1][1]=Integer.parseInt(br.readLine());
		arr[1][2]=Integer.parseInt(br.readLine());
		arr[1][3]=Integer.parseInt(br.readLine());
		arr[2][0]=Integer.parseInt(br.readLine());
		arr[2][1]=Integer.parseInt(br.readLine());
		arr[2][2]=Integer.parseInt(br.readLine());
		arr[2][3]=Integer.parseInt(br.readLine());
*/
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		int totSum=0;
		for(int i=0; i<arr[0].length; i++){
			int sum=0;
			for(int j=0; j<arr.length; j++){
				sum=sum+arr[j][i];
				System.out.print(arr[j][i]+" ");
				
			}
			totSum=totSum+sum;
			System.out.println(" Sum is:"+sum);
		}
		System.out.println(" total Sum is:"+totSum);
	}
}
