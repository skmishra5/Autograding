import java.io.File;
import java.io.IOException;

public class AutoGrading {

	static String studentName = "";
	
	public static void main(String[] args) throws IOException {
		
		File dir = new File("./HW6_Submissions/");
		traverse(dir);
	}

	private static void traverse(File dir) throws IOException{

	    if (dir.isDirectory()) {
	    	studentName = dir.getName();
	    	// Do it only for the first time
	    	Process p = Runtime.getRuntime().exec("touch ./Grades_HW6/" + studentName + ".grade"); 
	        String[] children = dir.list();
	        for (int i = 0; children != null && i < children.length; i++) {
	            traverse(new File(dir, children[i]));
	        }
	    }
	    
	    if (dir.isFile()) {
	    	// Do nothing for now
	    }
	}
	
}
