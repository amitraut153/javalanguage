class ifelse7{
	public static void main(String[] args){
		int sellingPrice=1200;
		int costPrice=1200;

		if(sellingPrice>costPrice){

			System.out.println("Profit of "+(sellingPrice-costPrice)+"Rs");
		}
		else if(sellingPrice<costPrice){
			System.out.println("Loss of "+(costPrice-sellingPrice)+"Rs");
		}
		else 
			System.out.println("NO loss NO profit");
	}
}
