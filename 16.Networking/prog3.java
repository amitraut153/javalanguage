import java.awt.*;
import java.net.*;
import java.io.*;

class OpenWebSite{
	public static void main(String[]args)throws IOException,URISyntaxException{

		//URI obj=new URI("www.youtube.com");
		String url="www.core2web.in";
		URI obj2=new URI(url);
		Desktop desk=Desktop.getDesktop();
		desk.browse(obj2);
	}
}
