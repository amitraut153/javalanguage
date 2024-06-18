// TO calculate the factorial of the given num
class While5{
	public static void main(String[]args){

		int N=6;
		int i=1;
		int fact=1;

		while(i<=N){
			fact = fact*i;
			i++;
		}
		System.out.println(fact);
	}
}
