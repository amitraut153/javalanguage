//Print sum of all even num and multi of all odd num between 1 to 10
class While6{
	public static void main(String[]args){
		int sum=0;
		int multi=1;
		int i=0;
		while(i<=10){
			if(i%2==0){
				sum=sum+i;
				
			}
			else{
				multi=multi*i;
			}
			i++;
		}
		System.out.println("Sum of Even numbers between 1 to 10= "+sum);
		System.out.println("Multi of Odd numbers between 1 to 10= "+multi);

	}
}


