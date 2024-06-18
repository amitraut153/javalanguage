abstract class University{
	void examTime(){

		System.out.println("All colleges are same");
	}

	abstract void eventClg();
}

class College extends University{
	void eventClg(){

		System.out.println("Annual function farewell");
	}
}

class Client{

	public static void main(String[]args){

		University obj= new College();
		obj.examTime();
		obj.eventClg();
	}
}


