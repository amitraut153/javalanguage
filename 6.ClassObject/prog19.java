class Mountain{
	static String name="Everest";
	int height=9000;
	static int member=11;

	void MountainInfo(){

		System.out.println("name= "+name);
		System.out.println("height= "+height);
	}

	static void Tracking(){

		System.out.println("Mountain Name= "+name);
		System.out.println("Member= "+member);
		
	}
}
class Emtertainment{
	public static void main(String[]args){

		Mountain obj=new Mountain();
		obj.MountainInfo();
		obj.Tracking();
		Mountain.Tracking();
	}
}
