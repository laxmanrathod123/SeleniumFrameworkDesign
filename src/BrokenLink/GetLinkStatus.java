package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetLinkStatus {

	static int invalidlink;
	
	public static void verifyLink(String linkSting) throws IOException {
		
		URL url;
		try {
			url = new URL(linkSting);
			// open http connection
			HttpURLConnection urlConnect= (HttpURLConnection) url.openConnection();
			// define timeout
			urlConnect.setConnectTimeout(50000);
			
			urlConnect.connect();
			
			if(urlConnect.getResponseCode()==200) {
				
			}else {
				System.out.println(linkSting +" : " + urlConnect.getResponseMessage()+ " : " + urlConnect.HTTP_NOT_FOUND);
				invalidlink++;
			}
			
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void getInvalidLinkCount() {
		System.out.println("Total invalid link:"+invalidlink);
	}
	public static void main(String[] args) {

		
		
	}

}
