import java.io.*;

class PlayerInfo{
        public static void main(String[]args)throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Player name:");
		String name1=br.readLine();

		System.out.println("Enter Bowler Name:");
		String name2=br.readLine();

		System.out.println("Batsman Name= "+name1);
		System.out.println("Bowler Name= "+name2);

	}
}
