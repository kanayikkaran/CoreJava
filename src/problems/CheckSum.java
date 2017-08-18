package problems;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;

public class CheckSum {

	public static void main(String[] args) {
		
		System.out.println(getCheckSumLocal("C:\\Users\\sachin.k\\Downloads\\consumption_comparison586e0bf33760a.csv"));
		
	}

	public static String getCheckSum(String fileUrl)
	{
		String checksum = null;
		try
		{
			MessageDigest md = MessageDigest.getInstance("SHA1");
			//InputStream fis = new URL(fileUrl).openStream();
			FileInputStream fis = new FileInputStream(fileUrl);
			byte[] dataBytes = new byte[1024];
			int nread = 0;

		    while ((nread = fis.read(dataBytes)) != -1) {
		      md.update(dataBytes, 0, nread);
		    };

		    byte[] mdbytes = md.digest();
		    StringBuffer sb = new StringBuffer("");
		    for (int i = 0; i < mdbytes.length; i++) {
		    	sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		    }
		    checksum = sb.toString();
		    fis.close();
		} 
		catch (Exception e) 
		{
			checksum = "Exception="+e.getMessage();
		} 
		return checksum;
	}
	
	
	public static String getCheckSumLocal(String fileUrl)
	{
		String checksum = null;
		try
		{
			MessageDigest md = MessageDigest.getInstance("SHA1");
			//InputStream fis = new URL(fileUrl).openStream();
			FileInputStream fis = new FileInputStream(fileUrl);
			byte[] dataBytes = new byte[1024];
			int nread = 0;

		    while ((nread = fis.read(dataBytes)) != -1) {
		      md.update(dataBytes, 0, nread);
		    };

		    byte[] mdbytes = md.digest();
		    StringBuffer sb = new StringBuffer("");
		    for (int i = 0; i < mdbytes.length; i++) {
		    	sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		    }
		    checksum = sb.toString();
		    fis.close();
		} 
		catch (Exception e) 
		{
			checksum = "Exception="+e.getMessage();
		} 
		return checksum;
	}
}
