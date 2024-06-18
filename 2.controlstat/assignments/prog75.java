import java.util.*;
class SwitchDemo5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int choice;

		System.out.println("Whats your interest?");
		System.out.println("1.Indoor Games");
		System.out.println("2.Outdoor Games");
		System.out.println("Enter your Choice:");
		choice=sc.nextInt();

		switch(choice){
			case 1:{
				       int wish;
				       System.out.println("List of Indoor Games you wish to play");
				       System.out.println("1.Chess ");
				       System.out.println("2.Carrom ");
				       System.out.println("3.Ludoking ");
				       System.out.println("4.Table tennis ");
				       System.out.println("5.Badminton ");
				       System.out.println("6.Puzzle ");

				       System.out.println("Enter your choice:");
				       wish = sc.nextInt();

				       switch(wish){
					       case 1:
						       System.out.println("You wish to play chess");
						       break;
					       case 2:
						       System.out.println("You wish to play Carrom ");
						       break;
					       case 3:
						       System.out.println("You wish to play Ludoking");
						       break;
					       case 4:
						       System.out.println("You wish to paly Table tennis");
						       break;
					       case 5:
						       System.out.println("You wish to paly Badminton");
						       break;
					       case 6:
						       System.out.println("You wish to paly Puzzle");
						       break;
					       default:
						       System.out.println("Invalid Choice");
						       break;
				       }
			}
			break;
			case 2:{
				       int wish;
				       System.out.println("Lists of Outdoor Games you wish to played");
				       System.out.println("1.Cricket ");
				       System.out.println("2.Kho-Kho ");
				       System.out.println("3.Kabaddi ");
				       System.out.println("4.Football ");
				       System.out.println("5.Hocky ");
				       System.out.println("6.Relay ");

				       System.out.println("Enter your choice:");
				       wish=sc.nextInt();



				       switch(wish){
					       case 1:
						       System.out.println("You wish to play Cricket");
						       break;
					       case 2:
						       System.out.println("You wish to play Kho-Kho ");
						       break;
					       case 3:
						       System.out.println("You wish to play Kabaddi");
						       break;
					       case 4:
						       System.out.println("You wish to paly Table Football");
						       break;
					       case 5:
						       System.out.println("You wish to paly Hocky");
						       break;
					       case 6:
						       System.out.println("You wish to paly Relay");
						       break;
					       default:
						       System.out.println("Invalid Choice");
						       break;
				       }
			}
			break;
			default:
				System.out.println("Invalid choice");
				break;
		}
	}
}


