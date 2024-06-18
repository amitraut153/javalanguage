class ifelse5{
	public static void main(String[]args){
		int month=5;

		if(month<=0 || month>12){
			System.out.println(month+"is Invalid");
		}
		else if(month==1){
			System.out.println("January has 31 days");
		}
		else if(month==2)
			System.out.println("February has 28/29 days");
		else if(month==3)
			System.out.println("March has 31 days");
		else if(month==4)
			System.out.println("April has 30 days");
		else if(month==5)
			System.out.println("May has 31 days");
		else if(month==6)	
			System.out.println("June has 30 days");
		else if(month==7)
			System.out.println("July has 31 days");
		else if(month==8)
			System.out.println("August has 31 days");
		else if(month==9)
			System.out.println("September has 31 days");
		else if(month==10)
			System.out.println("October has 30 days");
		else if(month==11)
			System.out.println("November has 31 days");
		else if(month==12)
			System.out.println("December has 30 days");
	}
}

