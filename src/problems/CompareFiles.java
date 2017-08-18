package problems;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.util.Iterator;

public class CompareFiles {

	public static void main(String[] args) {
		
		File f1 = new File(".//log4j.properties");
		File f2 = new File(".//log4j - Copy.properties");
		
		System.out.println("F1 Name="+f1.getName());
		System.out.println("F2 Name="+f2.getName());
		
		System.out.println("F1 total space="+f1.getTotalSpace());
		System.out.println("F2 total space="+f2.getTotalSpace());
		
		System.out.println("f1 equals f2="+f1.equals(f2));
		
		System.out.println("f1 compareTo f2="+f1.compareTo(f2));
		
		System.out.println("F1 hashcode="+f1.hashCode());
		System.out.println("F2 hashcode="+f2.hashCode());
		
		System.out.println("F1CheckSum="+problems.CheckSum.getCheckSum(".//log4j.properties"));
		System.out.println("F2CheckSum="+problems.CheckSum.getCheckSum(".//log4j - Copy.properties"));
		
	}

}
