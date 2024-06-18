import java.util.Scanner;

class SwitchDemo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		int marathiMarks;
		System.out.println("Enter Marathi marks =");
		marathiMarks = sc.nextInt();

		int englishMarks;
		System.out.println("Enter your English marks =");
		englishMarks = sc.nextInt();

		int hindiMarks;
		System.out.println("Enter your Hindi marks =");
		hindiMarks = sc.nextInt();

		int mathsMarks;
		System.out.println("Enter your Maths marks =");
		mathsMarks = sc.nextInt();
		
		int historyMarks;
		System.out.println("Enter your History marks =");
		historyMarks = sc.nextInt();

		if(marathiMarks<35 || englishMarks<35 || hindiMarks<35 || mathsMarks<35 || historyMarks<35){
			System.out.println("You failed in Exam");
		}
		else{
			double avg=(marathiMarks+englishMarks+hindiMarks+mathsMarks+historyMarks)/5;

			char ch;
			if(avg>75)
				ch='A';
			else if(avg>60)
				ch='B';
			else if(avg>50)
				ch='C';
			else if(avg>40)
				ch='D';
			else if(avg>=35)
				ch='E';
			else
				ch='F';

			switch(ch){
				case 'A':
					System.out.println("First class with Distinction");
					break;
				case 'B':
					System.out.println("First class");
					break;
				case 'C':
					System.out.println("Second class");
					break;
				case'D':
					System.out.println("Third class");
					break;
				case'E':
					System.out.println("Passed");
					break;
				case 'F':
					System.out.println("Failed");
					break;
			}
			System.out.println("Your Percentage is="+avg+"%");
		}

	}
}

