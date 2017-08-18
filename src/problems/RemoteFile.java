package problems;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class RemoteFile {

	public static void main(String[] args) {

		printFileSize("http://www.autani.com/wp-content/uploads/2016/11/Autani_Lighting.pdf");
	}

	public static void printFileSize(String url)
	{
			HttpURLConnection conn;
			try{
				if(url.startsWith("https"))
				{
					conn = (HttpsURLConnection) (new URL(url)).openConnection();
				}
				else
				{
					conn = (HttpURLConnection) (new URL(url)).openConnection();	
				}
					conn.setConnectTimeout(20000);
					conn.setReadTimeout(20000); 
					List<String> headers = conn.getHeaderFields().get("Content-Length");
					double size = Double.parseDouble(headers.get(0))/1024.00;
					System.out.println("FileSize="+size+" KB");
					
					headers = conn.getHeaderFields().get("Content-Type");
					String fileType = headers.get(0);
					System.out.println("FileType="+fileType);
					
				
				}
			catch(Exception e)
			{
				System.out.println("Exception:"+e.getMessage());
			}
			
	}
	
	
}

