class MacD{
	int item=5;
	String product="Frize";

	void Menu(){
		String menu1="Veg";
		String menu2="Non-Veg";
		
		System.out.println(menu1);
		System.out.println(menu2);
		System.out.println(item);
		System.out.println(product);
	}
}
class User{
	public static void main(String[]args){
		MacD obj=new MacD();
		obj.Menu();
	}
}
