class Player{
	private int jerNo=0;
	private String name=null;

	Player(int jerNo, String name){

		this.jerNo = jerNo;
		this.name = name;

		System.out.println("In constructor");
	}
	void info(){
		System.out.println(jerNo+" = "+name);
	}
}
class Client3{
	public static void main(String[]args){
							////Internal
		Player obj1=new Player(18, "Virat");	// Player(obj1, 18, Virat)
		obj1.info();				//info(obj1)
	
		Player obj2=new Player(45, "Rohit");	//Player(obj2, 45, Rohit)
		obj2.info();				//info(obj2)

		Player obj3=new Player(7, "MSD");	//Player( obj3, 7, MSD)
		obj3.info();				//info(obj3)
	}
}
