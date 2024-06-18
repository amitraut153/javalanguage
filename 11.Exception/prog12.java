import java.io.*;
class Demo{

	public static void main(String []args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=0;

		try{
			x=Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Exception=1");
		}
		catch(NumberFormatException nf){
			System.out.println("Exception=2");
		}catch(NullPointerException Np){
			System.out.println("Exception=3");
		}
		catch(Exception e){
			System.out.println("Exception=4");
		}
	}
}
