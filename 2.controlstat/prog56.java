class NSwitch1{
	public static void main(String[]args){
		String str="Veg";
		System.out.println("Oh Pune Hotel");

		switch(str){
			case"Veg":
				{
					String str1="Starters";
					switch(str1){
						case "Starters":
							System.out.println("Paneer");
							break;
						case"Main course":
							System.out.println("Non-Paneer");
							break;
					}
				}
				break;
			case"Non-Veg":
				{
					String str1="Starters";
					switch(str1){
						case "Starters":
							System.out.println("Chicken");
							break;
						case"Main course":
							System.out.println("Fish");
							break;
					}
				}
			break;
		}
	}
}
				
