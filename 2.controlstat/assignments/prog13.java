//Print count of given digits
class While3{
	public static void main(String[]args){
		int digits=942111423;
		int count=0;

		while(digits != 0){
			count++;
			digits=digits/10;
		}
		System.out.println("Count of digits="+count);
	}
}




