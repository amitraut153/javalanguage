class Break3{
	public static void main(String[]args){
		for(int i=1; i<=40; i++){
			if(i%3==0 && i%5==0){
				break;
			}
			System.out.println(i);
		}
	}
}
