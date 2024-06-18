//write the program to print the square of even digits of the given num
class While5{
	public static void main(String[]args){
		int digits=942111423;
		
		while(digits!=0){
			int rem=digits%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			digits/=10;
		}
		//System.out.println("\n");
	}
}
