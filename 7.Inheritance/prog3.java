class Defence{
	Defence(){

		System.out.println("In Defence Parent constructor");
	}
}
class Army extends Defence{
	Army(){
		
		System.out.println("In Army child Constructor");
	}
}

class Navy extends Army{
	Navy(){
		System.out.println("In Navy Child constructor");
	}
}
class Client{
	
	public static void main(String[]args){

	//	Defence obj1= new Defence();

	//	Army obj2= new Army();

		Navy obj3= new Navy();
	}
}
