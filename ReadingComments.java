import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingComments {

	static String studentName = "";
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		File dir = new File("./HW8_Submissions/");
		readingComments(dir);
		//readingComments1(dir);
		readingOthers(dir);
		//readingOthers1(dir);
	}

	private static void readingComments(File dir) throws IOException{

	    if (dir.isDirectory()) {
	    	studentName = dir.getName();
	        String[] children = dir.list();
	        for (int i = 0; children != null && i < children.length; i++) {
	        	readingComments(new File(dir, children[i]));
	        }
	    }
	    
	    if (dir.isFile()) {
	    	
	    	if((dir.getName().trim().equals("U.cc")))
	    	{
	    		BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("commentFileU", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(dir.getAbsolutePath()));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
                    String line;
                    bufferedWriter.write(studentName);
                    bufferedWriter.newLine();
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    while (((line = inputStream.readLine()) != null) && (count != 3)) {
                    		bufferedWriter.write(line);
                    		bufferedWriter.newLine();
                    		count++;
                    }
                    
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    count = 0;
                  
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                }
	    	}
	    	
	    }
	}
	
	private static void readingComments1(File dir) throws IOException{

	    if (dir.isDirectory()) {
	    	studentName = dir.getName();
	        String[] children = dir.list();
	        for (int i = 0; children != null && i < children.length; i++) {
	        	readingComments1(new File(dir, children[i]));
	        }
	    }
	    
	    if (dir.isFile()) {
	    	
	    	if((dir.getName().trim().equals("P.cc")))
	    	{
	    		BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("commentFileP", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(dir.getAbsolutePath()));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
                    String line;
                    bufferedWriter.write(studentName);
                    bufferedWriter.newLine();
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    while (((line = inputStream.readLine()) != null) && (count != 3)) {
                    		bufferedWriter.write(line);
                    		bufferedWriter.newLine();
                    		count++;
                    }
                    
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    count = 0;
                  
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                }
	    	}
	    	
	    }
	}
	
	private static void readingOthers(File dir) throws IOException{

	    if (dir.isDirectory()) {
	    	studentName = dir.getName();
	        String[] children = dir.list();
	        for (int i = 0; children != null && i < children.length; i++) {
	        	readingOthers(new File(dir, children[i]));
	        }
	    }
	    
	    if (dir.isFile()) {
	    	
	    	if((dir.getName().trim().equals("U.cc")))
	    	{
	    		BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("printStatementsU", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(dir.getAbsolutePath()));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
                    String line;
                    bufferedWriter.write(studentName);
                    bufferedWriter.newLine();
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    while (((line = inputStream.readLine()) != null)) {               	
                    	if((line.contains("<stdio.h>")) || (line.contains("<cstdio>")) || (line.contains("printf")) ||
                    			(line.contains("scanf")) || (line.contains("fopen")) || (line.contains("getchar")) ||
                    			(line.contains("malloc")) || (line.contains("calloc")) || (line.contains("realloc")) || 
                    			(line.contains("free")) || (line.contains("wstring")) || (line.contains("wcout")) || 
                    			(line.contains("wchar_t")) || (line.contains("popen")) || (line.contains("system")))
                    	{
                    		bufferedWriter.write(line);
                    		bufferedWriter.newLine();
                    	}	
                    }
                    
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    
                  
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                }
	    	}
	    	
	    }
	}
	
	private static void readingOthers1(File dir) throws IOException{

	    if (dir.isDirectory()) {
	    	studentName = dir.getName();
	        String[] children = dir.list();
	        for (int i = 0; children != null && i < children.length; i++) {
	        	readingOthers1(new File(dir, children[i]));
	        }
	    }
	    
	    if (dir.isFile()) {
	    	if((dir.getName().trim().equals("P.cc")))
	    	{
	    		BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("printStatementsP", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(dir.getAbsolutePath()));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
                    String line;
                    bufferedWriter.write(studentName);
                    bufferedWriter.newLine();
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    while (((line = inputStream.readLine()) != null)) {               	
                    	if((line.contains("<stdio.h>")) || (line.contains("<cstdio>")) || (line.contains("printf")) ||
                    			(line.contains("scanf")) || (line.contains("fopen")) || (line.contains("getchar")) ||
                    			(line.contains("malloc")) || (line.contains("calloc")) || (line.contains("realloc")) || 
                    			(line.contains("free")) || (line.contains("wstring")) || (line.contains("wcout")) || 
                    			(line.contains("wchar_t")) || (line.contains("popen")) || (line.contains("system")))
                    	{
                    		bufferedWriter.write(line);
                    		bufferedWriter.newLine();
                    	}	
                    }
                    
                    bufferedWriter.write("######################");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    
                  
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                }
	    	}
	    	
	    }
	}
	
}
