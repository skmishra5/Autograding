import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ResultScanningHW5 {
	private static boolean compCheck = false;
	private static boolean warnCheck = false;

	public static void main(String[] args) throws IOException {
		
		CompileResults();
		Testcase6();
		Testcase7();
		Testcase8();
		Testcase9();
		Testcase10();
		Testcase11();
		Testcase12();
		Testcase13();
		Testcase14();
		Testcase15();
		Testcase16();
		Testcase17();
		Testcase18();
		Testcase19();
		Testcase20();
		CalculateToalScore();
		
	}
	
	private static void	CompileResults() throws IOException{
		
		String target_dir = "./HW8CompileResults/compile/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade");

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
                    
                    bufferedWriter.write("#########");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    
                    
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if((line.contains("warning")) && (warnCheck == false))
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Warning existed!");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase1: 0.0/1.0");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		warnCheck = true;
                    	}
                    	else if(line.contains("error"))
                    	{
                    		if(compCheck == false){
                    			bufferedWriter.write("#########################");
                    			bufferedWriter.newLine();
                    			bufferedWriter.write("Compilation Failed!");
                    			bufferedWriter.newLine();
                    			bufferedWriter.write("#########################");
                    			bufferedWriter.newLine();
                    			compCheck = true;
                    		}
                    	}
                    }
                    if(compCheck == false)
                    {
                    	if(warnCheck == false)
                    	{
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("No Warning!");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase1: 1.0/1.0");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    	}
                    }
                    if(compCheck == false){
                    	bufferedWriter.newLine();
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Checking comments in file!");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Testcase2: 0.1/0.1");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    }
                    
                    if(compCheck == false){
                    	bufferedWriter.newLine();
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Checking global variables in file!");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Testcase3: 0.1/0.1");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    }
                    
                    if(compCheck == false){
                    	bufferedWriter.newLine();
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Checking for no printf, scanf, fopen, getchar, C-style <stdio.h> or <cstdio> facilities");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("and malloc, calloc, realloc, free, u16_string(cpp), u32_string(cpp), wstring, wcout, wchar_t,"
                    			+ " C++ wide-character facilities, popen, system etc.");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Testcase4: 0.1/0.1");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    }
                    
                    if(compCheck == false){
                    	bufferedWriter.newLine();
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Checking for ASCII int constants and namespace flooding");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Testcase5: 0.1/0.1");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    }
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(compCheck == true)
                    {
                    	compCheck = false;
                    }
                    
                    if(warnCheck == true)
                	{
                    	warnCheck = false;
                	}
                }
            }
        }

	}
	
	private static void	Testcase6() throws IOException{
		String target_dir = "./HW8Results/Testcase6/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("ERROR SUMMARY: 0 errors"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Test for memory leak");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase6: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase6: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase7() throws IOException{
		String target_dir = "./HW8Results/Testcase7/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false, flag1 = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("ମ ୁ 08 ଗ ୋ ଓ 05 ଡ ି ଆ"))
                    	{
                    		flag = true;
                    	}
                    	else if(line.equals("0xb2e 0x20 0xb41 0x20 0x30 0x38 0x20 0xb17 0x20 0xb4b 0x20 0xb13 0x20 0x30 0x35 0x20 0xb21 0x20 0xb3f 0x20 0xb06"))
                    	{
                    		flag1 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing all U methods");
                    	
                    	if((flag == true) && (flag1 == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase7: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase7: 0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                    
                    if(flag1 = true)
                    {
                    	flag1 = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase8() throws IOException{
		String target_dir = "./HW8Results/Testcase8/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("Good: caught error as expected"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing error cases when U(iter, iter) thorws an error");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase8: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase8: 0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase9() throws IOException{
		String target_dir = "./HW8Results/Testcase9/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if((line.contains("Throws")))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing when the .front() method throws an error");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase9: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase9: 0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase10() throws IOException{
		String target_dir = "./HW8Results/Testcase10/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";	
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	
                    	if(line.contains("Throws"))
                    	{	
                    		flag = true;
                    	}
                    }
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing when the .back() method throws an error");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTen: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTen: 0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase11() throws IOException{
		String target_dir = "./HW8Results/Testcase11/";	
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("0xb2e 0x20 0xb41 0x20 0x30 0x38 0x20 0xb17 0x20 0xb4b 0x20 0xb13 0x20 0x30 0x35 0x20 0xb21 0x20 0xb3f 0x20 0xb06"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing U::iterator methods");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseEleven: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseEleven: 0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase12() throws IOException{
		String target_dir = "./HW8Results/Testcase12/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("Get: c"))
                    	{
                    		flag = true;
                    	}
                    	else if(line.contains("u2 + u3: Nirvana was an American rock band formed by singer and guitarist Kurt Cobain and bassist Krist Novoselic in Aberdeen, Washington, in 1987"))
                    	{
                    		flag1 = true;
                    	}
                    	else if(line.contains("The Doors were an American rock band formed in 1965 in Los Angeles.Detta är cs253 klass"))
                    	{
                    		flag2 = true;
                    	}
                    	else if(line.contains("No chage u2: Nirvana was an American rock band formed by singer and guitarist Kurt Cobain and bassist Krist Novoselic in Aberdeen, Washington, in 1987"))
                    	{
                    		flag3 = true;
                    	}
                    	else if(line.contains("The Doors were an American rock band formed in 1965 in Los Angeles"))
                    	{
                    		flag4 = true;
                    	}
                    	else if(line.contains("No chage u3: Detta är cs253 klass"))
                    	{
                    		flag5 = true;
                    	}
                    	
                    	if(line.contains("u2 + u3: Nirvana") || line.contains("1987. The Doors") || line.contains("Angeles.Detta"))
                    	{
                    		flag = true;
                    		flag1 = true;
                    		flag2 = true;
                    	}
                    	
                    	if(line.contains("No chage u2: Nirvana") || line.contains("1987. The Doors"))
                    	{
                    		flag3 = true;
                    		flag4 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Test for Assignment operator/Testing Append method in U class");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing get method with a single argument/Test for concatenation of U objects");
                    	
                    	if((flag == true) && (flag1 == true) && (flag2 == true) && (flag3 == true) && (flag4 == true)
                    			&& (flag5 == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTwelve: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTwelve: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                    if(flag1 = true)
                    {
                    	flag1 = false;
                    }
                    if(flag2 = true)
                    {
                    	flag2 = false;
                    }
                    if(flag3 = true)
                    {
                    	flag3 = false;
                    }
                    if(flag4 = true)
                    {
                    	flag4 = false;
                    }
                    if(flag5 = true)
                    {
                    	flag5 = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase13() throws IOException{
		String target_dir = "./HW8Results/Testcase13/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false, flag1 = false, flag2 = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("u: Happiness is only real when shared: Into The Wild"))
                    	{
                    		flag = true;
                    	}
                    	else if(line.contains("Only I can change my life. No one can do it for me"))
                    	{
                    		flag1 = true;
                    	}
                    	
                    	if(line.contains("No change u1: Only I can change my life. No one can do it for me"))
                    	{
                    		flag2 = true;
                    	}
                    	
                    	if(line.contains("u: Happiness") || line.contains("Wild Only"))
                    	{
                    		flag = true;
                    		flag1 = true;
                    	}
                    }

                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing for Append of U objects");
                    	
                    	if((flag == true) && (flag1 == true) && (flag2 == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseThirteen: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseThirteen: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                    if(flag1 = true)
                    {
                    	flag1 = false;
                    }
                    if(flag2 = true)
                    {
                    	flag2 = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase14() throws IOException{
		String target_dir = "./HW8Results/Testcase14/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("u: यह एक कंप्यूटर साइंस क्लास है"))
                    	{
                    		flag = true;
                    	}
                    	else if(line.contains("これはコンピュータサイエンスのクラスです"))
                    	{
                    		flag1 = true;
                    	}
                    	else if(line.contains("There is only one happiness in this life, to love and be loved"))
                    	{
                    		flag2 = true;
                    	}
                    	else if(line.contains("u[17]: इ"))
                    	{
                    		flag4 = true;
                    	}
                    	
                    	if(line.contains("No change test: There is only one happiness in this life, to love and be loved"))
                    	{
                    		flag3 = true;
                    	}
                    	
                    	if(line.contains("u: यह") || line.contains("I こ") || line.contains("。 There"))
                    	{
                    		flag = true;
                    		flag1 = true;
                    		flag2 = true;
                    	}
                    }
                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing for Concatenation and Subscripting");
                    	
                    	if((flag == true) && (flag1 == true) && (flag2 == true) && (flag3 == true) && 
                    			(flag4 == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFourteen: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFourteen: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                    flag1 = false; flag2 = false; flag3 = false; flag4 = false;
                }
            }
        }
	}
	
	private static void	Testcase15() throws IOException{
		String target_dir = "./HW8Results/Testcase15/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        boolean flag1 = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("First True"))
                    	{
                    		flag = true;
                    	}
                    	else if(line.equals("Second False"))
                    	{
                    		flag1 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Boolean evaluation");
                    	
                    	if((flag == true) && (flag1 == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFifteen: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFifteen: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                    
                    if(flag1 = true)
                    {
                    	flag1 = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase16() throws IOException{
		String target_dir = "./HW8Results/Testcase16/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("Testing for constant argument in readfile"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing for constant argument in readfile");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseSixteen: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseSixteen: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if (flag ==  true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase17() throws IOException{
		String target_dir = "./HW8Results/Testcase17/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("Size 139"))
                    	{
                    		flag = true;
                    	}
                    	else if(line.equals("Get(): Nirvana was an American rock band formed by singer and guitarist Kurt Cobain and bassist Krist Novoselic in Aberdeen, Washington, in 1987."))
                    	{
                    		flag1 = true;
                    	}
                    	else if(line.equals("Get(5): a"))
                    	{
                    		flag2 = true;
                    	}
                    	else if(line.equals("Get(6, 8): a"))
                    	{
                    		flag3 = true;
                    	}
                    	else if(line.equals("Codepoint 114"))
                    	{
                    		flag4 = true;
                    	}
                    	else if(line.equals("Empty 0"))
                    	{
                    		flag5 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing for constant methods");
                    	
                    	if((flag == true) && (flag1 == true) && (flag2 == true) && (flag3 == true) && (flag4 == true)
                    			&& (flag5 == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseSeventeen: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseSeventeen: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                    
                    if(flag1 = true)
                    {
                    	flag1 = false;
                    }
                    
                    if(flag2 = true)
                    {
                    	flag2 = false;
                    }
                    
                    if(flag3 = true)
                    {
                    	flag3 = false;
                    }
                    
                    if(flag4 = true)
                    {
                    	flag4 = false;
                    }
                    
                    if(flag5 = true)
                    {
                    	flag5 = false;
                    }
                }
            }
        }
	}
	
	private static void	Testcase18() throws IOException{
		String target_dir = "./HW8Results/Testcase18/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("Success"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing for Comparison");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseEighteen: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseEighteen: 0/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}	
	
	private static void	Testcase19() throws IOException{
		String target_dir = "./HW8Results/Testcase19/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("Success"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing returned value from iterator increment");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseNineteen: 0.175/0.175");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseNineteen: 0/0.175");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}	
	
	private static void	Testcase20() throws IOException{
		String target_dir = "./HW8Results/Testcase20/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW8/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("Success"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Testing returned value from iterator decrement");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTwenty: 0.175/0.175");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTwenty: 0/0.175");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(flag = true)
                    {
                    	flag = false;
                    }
                }
            }
        }
	}
	
	private static void	CalculateToalScore() throws IOException{
		String target_dir = "./Grades_HW8/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String test1 = null;
        String test2 = null;
        String test3 = null;
        String test4 = null;
        String test5 = null;
        String test6 = null;
        String test7 = null;
        String test8 = null;
        String test9 = null;
        String test10 = null;
        String test11 = null, test12 = null, test13 = null, test14 = null, test15 = null, test16 = null, test17 = null
        		, test18 = null, test19 = null, test20 = null;
        //System.out.println("Inside Calculate Score!");
        for (File f : files) {
            if(f.isFile()) {
            	//System.out.println("Inside for loop!");
                BufferedReader inputStream = null;
                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));

                    String line;
                    
                    while ((line = inputStream.readLine()) != null) {
                    	if(line.equals("Compilation Failed!"))
                    	{
                    		RandomAccessFile ra = new RandomAccessFile(new File(f.toString()), "rw");
                    		ra.seek(0);
                    		ra.write("0.0/4.0".getBytes());
                    		ra.close();
                    		break;
                    	}
                    	
                    	if(line.contains("Testcase1"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test1 = token1[0];
                        	//System.out.println(test1);
                    	}
                    	else if(line.contains("Testcase2"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test2 = token1[0];
                        	//System.out.println(test2);
                    	}
                    	else if(line.contains("Testcase3"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test3 = token1[0];
                        	//System.out.println(test3);
                    	}
                    	else if(line.contains("Testcase4"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test4 = token1[0];
                        	//System.out.println(test4);
                    	}
                    	else if(line.contains("Testcase5"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test5 = token1[0];
                        	//System.out.println(test5);
                    	}
                    	else if(line.contains("Testcase6"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test6 = token1[0];
                        	//System.out.println(test6);
                    	}
                    	else if(line.contains("Testcase7"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test7 = token1[0];
                        	//System.out.println(test7);
                    	}
                    	else if(line.contains("Testcase8"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test8 = token1[0];
                        	//System.out.println(test8);
                    	}
                    	else if(line.contains("Testcase9"))
                    	{
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test9 = token1[0];
                        	//System.out.println(test9);
                    	}
                    	else if(line.contains("TestcaseTen"))
                    	{
                    		//System.out.println("Testcase10");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test10 = token1[0];
                        	//System.out.println(test10);
                    	}
                    	else if(line.contains("TestcaseEleven"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test11 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseTwelve"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test12 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseThirteen"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test13 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseFourteen"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test14 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseFifteen"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test15 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseSixteen"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test16 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseSeventeen"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test17 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseEighteen"))
                    	{
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test18 = token1[0];
                        	//System.out.println(test11);
                    	}
                    	else if(line.contains("TestcaseNineteen"))
                    	{
                    		//System.out.println("Testcase19");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test19 = token1[0];
                        	//System.out.println(test19);
                    	}
                    	else if(line.contains("TestcaseTwenty"))
                    	{
                    		//System.out.println("Testcase20");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test20 = token1[0];
                        	//System.out.println(test20);
                    	}
                    } 	
                    	if((test1 != null) && (test2 != null) && (test3 != null) && (test4 != null) && (test5 != null)
                    			&& (test6 != null) && (test7 != null) && (test8 != null) && (test9 != null) && (test10 != null) && 
                    			(test11 != null) && (test12 != null) && (test13 != null) && (test14 != null) && (test15 != null)
                    			&& (test16 != null) && (test17 != null) && (test18 != null) && (test19 != null)
                    			&& (test20 != null))
                    	{	
                    		//System.out.println("Inside sum");
                    		double sum = Double.parseDouble(test1.trim()) + Double.parseDouble(test2.trim()) + Double.parseDouble(test3.trim())
                    			+ Double.parseDouble(test4.trim()) + Double.parseDouble(test5.trim()) + Double.parseDouble(test6.trim())
                    			+ Double.parseDouble(test7.trim()) + Double.parseDouble(test8.trim()) + Double.parseDouble(test9.trim())
                    					+ Double.parseDouble(test10.trim()) + Double.parseDouble(test11.trim()) + 
                    					Double.parseDouble(test12.trim()) + Double.parseDouble(test13.trim()) + 
                    					Double.parseDouble(test14.trim()) + Double.parseDouble(test15.trim()) + Double.parseDouble(test16.trim())
                    					+ Double.parseDouble(test17.trim()) + Double.parseDouble(test18.trim()) + Double.parseDouble(test19.trim())
                    					+ Double.parseDouble(test20.trim());
                    		
                    		//String finalScore = Double.toString(sum) + "/" + "4.0";
                    		String finalScore1 = String.format("%.3f", sum);
                    		String finalScore = finalScore1 + "/" + "4.0";
                    		RandomAccessFile ra = new RandomAccessFile(new File(f.toString()), "rw");
                    		ra.seek(0);
                    		ra.write(finalScore.getBytes());
                    		ra.close();
                    	}
                    	else
                    	{
                    		//System.out.println(test1 + ":" + test2 + ":" + test3 + ":" + test4 + ":" + test5 + ":" + test6
                    			//	+ ":" + test7 + ":" + test8 + ":" + test9 + ":" + test10 + ":" + test11);
                    	}
                    }
                
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            }
        }
	}
}
