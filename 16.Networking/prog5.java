import java.net.*;
import java.io.*;

class Server{
	public static void main(String[]args)throws IOException {

		ServerSocket ss=new ServerSocket(1200);

		Socket s=ss.accept();
		System.out.println("Connection established");
		
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);

		ps.println("Hello Client");
		ps.println("Go to hell");
		
		ps.close();
		s.close();
		ss.close();
	}
}
