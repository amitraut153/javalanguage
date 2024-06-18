class MovThre{
	int seatNo=222;
	static String MovieName="Pushpa-2";

	void movieInfo(){
		System.out.println("SeatNum= "+ seatNo);
		System.out.println("Movie name= "+ MovieName);

	}
}
class MainDemo4{
	public static void main(String[]args){
		MovThre mov1=new MovThre();
		MovThre mov2=new MovThre();

		mov1.movieInfo();
		mov2.movieInfo();

		mov2.seatNo=333;
		mov2.MovieName="Gadar-2";

		mov1.movieInfo();
		mov2.movieInfo();
	}
}


		
