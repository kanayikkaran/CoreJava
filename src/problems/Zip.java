package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zip {
	Logger logger = LogManager.getLogger(Zip.class);
	List<String> fileList;
	private static String OUTPUT_ZIP_FILE = System.getProperty("user.dir")+"/screenshots/Screenshots.zip";
	private static String SOURCE_FOLDER = System.getProperty("user.dir")+"/screenshots";

	Zip(){
		fileList = new ArrayList<String>();
	}
	
	public static void main(String args[])
	{
		Zip appZip = new Zip();
		appZip.generateFileList(new File(SOURCE_FOLDER));
		appZip.zipIt(OUTPUT_ZIP_FILE);
		appZip = new Zip();
		SOURCE_FOLDER = System.getProperty("user.dir")+"/reports";
		OUTPUT_ZIP_FILE = System.getProperty("user.dir")+"/reports/Report.zip";
		appZip.generateFileList(new File(SOURCE_FOLDER));
		appZip.zipIt(OUTPUT_ZIP_FILE);
	}
	public void zipIt(String zipFile){

		byte[] buffer = new byte[1024];

		try{

			FileOutputStream fos = new FileOutputStream(zipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);

			logger.debug("Output to Zip : " + zipFile);

			for(String file : this.fileList){

				logger.debug("File Added : " + file);
				ZipEntry ze= new ZipEntry(file);
				zos.putNextEntry(ze);

				FileInputStream in = 
					new FileInputStream(SOURCE_FOLDER + File.separator + file);

				int len;
				while ((len = in.read(buffer)) > 0) {
					zos.write(buffer, 0, len);
				}

				in.close();
			}

			zos.closeEntry();
			//remember close it
			zos.close();

			logger.debug("Zip successful");
		}catch(IOException ex){
			ex.printStackTrace();   
		}
	}

	/**
	 * Traverse a directory and get all files,
	 * and add the file into fileList  
	 * @param node file or directory
	 */
	public void generateFileList(File node){
		//add file only
		if(node.isFile()){
			if(node.getAbsoluteFile().toString().endsWith(".jpg") || node.getAbsoluteFile().toString().endsWith(".html"))
			fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
		}

		if(node.isDirectory()){
			String[] subNode = node.list();
			for(String filename : subNode){
				generateFileList(new File(node, filename));
			}
		}

	}

	/**
	 * Format the file path for zip
	 * @param file file path
	 * @return Formatted file path
	 */
	private String generateZipEntry(String file){
		return file.substring(SOURCE_FOLDER.length()+1, file.length());
	}
}





