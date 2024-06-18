//Print factorial of the given num
class While2{
	public static void main(String[]args){
		int n=6;
		int i=1;
		int fact=1;

		while(i<=n){
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+n+" is"+fact);
	}
}	
