class ifelse9{
	public static void main(String[]args){
		int a=3,b=4,c=5;

		if(a*a==b*b+c*c || b*b==c*c+a*a || c*c==a*a+b*b ){
			System.out.println("It is a Pythagorean triplet");
		}
		else 
			System.out.println("Its not Pythagorean triplet");
	}
}
