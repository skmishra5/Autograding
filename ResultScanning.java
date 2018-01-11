import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ResultScanning {
	
	private static boolean compCheck = false;
	private static boolean warnCheck = false;

	public static void main(String[] args) throws IOException {
		
		CompileResults();
		Testcase7();
		Testcase8();
		Testcase9();
		Testcase10();
		Testcase11();
		Testcase12();
		Testcase13();
		Testcase14();
		Testcase15();
		FinalResults1();
		FinalResults2();
		FinalResults3();
		FinalResults4();
		CalculateToalScore();
		
	}
	
	private static void	CompileResults() throws IOException{
		
		String target_dir = "./HW4CompileResults/";
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
                        new FileWriter("./Grades_HW4/" + studentName + ".grade");

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
                    
                    bufferedWriter.write("#####");
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
                    	bufferedWriter.write("Testcase2: 0.125/0.125");
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
                    	bufferedWriter.write("Testcase3: 0.125/0.125");
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
                    	bufferedWriter.write("Testcase4: 0.125/0.125");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    }
                    
                    if(compCheck == false){
                    	bufferedWriter.newLine();
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Checking for ASCII int constants");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Testcase5: 0.125/0.125");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    }
                    
                    if(compCheck == false){
                    	bufferedWriter.newLine();
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("#########################");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Checking for terminating newline at the end of output");
                    	bufferedWriter.newLine();
                    	bufferedWriter.write("Testcase6: 0.125/0.125");
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
	
	private static void	Testcase7() throws IOException{
		String target_dir = "./HW4Results/Testcase7/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking for error where options do not come before filenames in stderr!");
                    	
                    	if(flag == true)
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase7: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase7: 0/0.125");
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
	
	private static void	Testcase8() throws IOException{
		String target_dir = "./HW4Results/Testcase8/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        boolean flag1 = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    	
                    	if(line.contains("UnicodeData.txt"))
                    	{
                    		flag1 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking if a property file can't be read error in stderr!");
                    	
                    	if((flag == true) && (flag1 = true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase8: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase8: 0/0.125");
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
	
	private static void	Testcase9() throws IOException{
		String target_dir = "./HW4Results/Testcase9/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking if no property file is given error in stderr!");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase9: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("Testcase9: 0/0.125");
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
		String target_dir = "./HW4Results/Testcase10/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        boolean flag1 = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    	
                    	if(line.contains("blah"))
                    	{
                    		flag1 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking for invalid option error in stderr!");
                    	
                    	if((flag == true) && (flag1 = true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTen: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseTen: 0/0.125");
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
	
	private static void	Testcase11() throws IOException{
		String target_dir = "./HW4Results/Testcase11/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    	
                    	if(line.contains("story2.txt"))
                    	{
                    		flag1 = true;
                    	}
                    	
                    	if(line.contains("b36"))
                    	{
                    		flag2 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking for char not in property file error in stderr!");
                    	
                    	if((flag == true) && (flag1 = true) && (flag2 = true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseEleven: 0.125/0.125");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseEleven: 0/0.125");
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
	
	private static void	Testcase12() throws IOException{
		String target_dir = "./HW4Results/Testcase12/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking no argument error in stderr!");
                    	
                    	if((flag == true))
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
                }
            }
        }
	}
	
	private static void	Testcase13() throws IOException{
		String target_dir = "./HW4Results/Testcase13/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking if a normal file can't be read error in stderr!");
                    	
                    	if((flag == true))
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
                }
            }
        }
	}
	
	private static void	Testcase14() throws IOException{
		String target_dir = "./HW4Results/Testcase14/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    	
                    	if(line.contains("error1"))
                    	{
                    		flag1 = true;
                    	}
                    	
                    	if(line.contains("dc80"))
                    	{
                    		flag2 = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking for error in stderr where improperly formatted byte exists input file!");
                    	
                    	if((flag == true) && (flag1 = true) && (flag2 = true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFourteen: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFourteen: 0/0.25");
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
	
	private static void	Testcase15() throws IOException{
		String target_dir = "./HW4Results/Testcase15/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	if(line.contains("HW4_Out"))
                    	{
                    		flag = true;
                    	}
                    }

                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write("Checking for error in stderr when no option is given.");
                    	
                    	if((flag == true))
                    	{    		                    		
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFifteen: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else
                    	{
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseFifteen: 0.25/0.25");
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
	
	private static void	FinalResults1() throws IOException{
		String target_dir = "./HW4Results/Testcase16/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        int count = 0;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	
                    	if(line.equals("Cc: 3"))
                    	{
                    		count++;
                    		comment += "Option -Cc ";
                    	}
                    	else if(line.equals("Zs: 14"))
                    	{
                    		count++;
                    		comment += "Option -Zs ";
                    	}
                    	
                    }
                    
                    	if(count == 0)
                		{
                			comment += "Option -Cc/Zs does not ";
                		}
                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write(comment + "match.");
                		bufferedWriter.newLine();
                    	
                    	if(count == 2)
                    	{    		
                    		bufferedWriter.write("Good Job!");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseSixteen: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 1)
                    	{    		
                    		bufferedWriter.write("TestcaseSixteen: 0.12/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 0)
                    	{
                    		bufferedWriter.write("TestcaseSixteen: 0.0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    
                    
                    //bufferedWriter.newLine();
                    //bufferedWriter.write("Graded By Pratik Warade <Pratik.Warade@ColoState.Edu>");
            		//bufferedWriter.newLine();
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(count != 0)
                    {
                    	count = 0;
                    	comment = "";
                    }
                }
            }
        }
	}
	
	private static void	FinalResults2() throws IOException{
		String target_dir = "./HW4Results/Testcase17/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        int count = 0;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	
                    	if(line.equals("Cc: 3"))
                    	{
                    		count++;
                    		comment += "Option -Cc, ";
                    	}
                    	else if(line.equals("Cf: 0"))
                    	{
                    		count++;
                    		comment += "Option -Cf ";
                    	}
                    	else if(line.equals("Co: 1"))
                    	{
                    		count++;
                    		comment += "Option -Co ";
                    	}
                    	else if(line.equals("Cs: 0"))
                    	{
                    		count++;
                    		comment += "Option -Cs ";
                    	}
                    	else if(line.equals("Ll: 2"))
                    	{
                    		count++;
                    		comment += "Option -Ll ";
                    	}
                    	else if(line.equals("Lm: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lm ";
                    	}
                    	else if(line.equals("Lo: 3"))
                    	{
                    		count++;
                    		comment += "Option -Lo ";
                    	}
                    	else if(line.equals("Lt: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lt ";
                    	}
                    	else if(line.equals("Lu: 1"))
                    	{
                    		count++;
                    		comment += "Option -Lu ";
                    	}
                    	else if(line.equals("Mc: 0"))
                    	{
                    		count++;
                    		comment += "Option -Mc ";
                    	}
                    	else if(line.equals("Me: 0"))
                    	{
                    		count++;
                    		comment += "Option -Me ";
                    	}
                    	else if(line.equals("Mn: 2"))
                    	{
                    		count++;
                    		comment += "Option -Mn ";
                    	}
                    	else if(line.equals("Nd: 0"))
                    	{
                    		count++;
                    		comment += "Option -Nd ";
                    	}
                    	else if(line.equals("Nl: 0"))
                    	{
                    		count++;
                    		comment += "Option -Nl ";
                    	}
                    	else if(line.equals("No: 0"))
                    	{
                    		count++;
                    		comment += "Option -No ";
                    	}
                    	else if(line.equals("Pc: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pc ";
                    	}
                    	else if(line.equals("Pd: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pd ";
                    	}
                    	else if(line.equals("Pe: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pe ";
                    	}
                    	else if(line.equals("Pf: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pf ";
                    	}
                    	else if(line.equals("Pi: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pi ";
                    	}
                    	else if(line.equals("Po: 1"))
                    	{
                    		count++;
                    		comment += "Option -Po ";
                    	}
                    	else if(line.equals("Ps: 0"))
                    	{
                    		count++;
                    		comment += "Option -Ps ";
                    	}
                    	else if(line.equals("Sc: 3"))
                    	{
                    		count++;
                    		comment += "Option -Sc ";
                    	}
                    	else if(line.equals("Sk: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sk ";
                    	}
                    	else if(line.equals("Sm: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sm ";
                    	}
                    	else if(line.equals("So: 0"))
                    	{
                    		count++;
                    		comment += "Option -So ";
                    	}
                    	else if(line.equals("Zl: 0"))
                    	{
                    		count++;
                    		comment += "Option -Zl ";
                    	}
                    	else if(line.equals("Zp: 0"))
                    	{
                    		count++;
                    		comment += "Option -Zp ";
                    	}
                    	else if(line.equals("Zs: 14"))
                    	{
                    		count++;
                    		comment += "Option -Zs ";
                    	}
                    }
                    
                    	if(count == 0)
                		{
                			comment += "None of the options ";
                		}
                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write(comment + "match.");
                		bufferedWriter.newLine();
                    	
                    	if(count == 29)
                    	{    		
                    		bufferedWriter.write("Good Job!");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseSeventeen: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 28 || count == 27 || count == 26 || count == 25 || count == 24 || count == 23 || count == 22
                    			|| count == 21 || count == 20)
                    	{    		
                    		bufferedWriter.write("TestcaseSeventeen: 0.20/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 19 || count == 18 || count == 17 || count == 16 || count == 15 || count == 14 || count == 13
                    			|| count == 12 || count == 11 || count == 10)
                    	{    		
                    		bufferedWriter.write("TestcaseSeventeen: 0.12/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 9 || count == 8 || count == 7 || count == 6 || count == 5 || count == 4 || count == 3
                    			|| count == 2 || count == 1)
                    	{    		
                    		bufferedWriter.write("TestcaseSeventeen: 0.05/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 0)
                    	{
                    		bufferedWriter.write("TestcaseSeventeen: 0.0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    
                    
                    //bufferedWriter.newLine();
                    //bufferedWriter.write("Graded By Pratik Warade <Pratik.Warade@ColoState.Edu>");
            		//bufferedWriter.newLine();
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(count != 0)
                    {
                    	count = 0;
                    	comment = "";
                    }
                }
            }
        }
	}
	
	private static void	FinalResults3() throws IOException{
		String target_dir = "./HW4Results/Testcase18/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        int count = 0;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	
                    	if(line.equals("Cc: 107"))
                    	{
                    		count++;
                    		comment += "Option -Cc, ";
                    	}
                    	else if(line.equals("Cf: 0"))
                    	{
                    		count++;
                    		comment += "Option -Cf ";
                    	}
                    	else if(line.equals("Co: 0"))
                    	{
                    		count++;
                    		comment += "Option -Co ";
                    	}
                    	else if(line.equals("Cs: 0"))
                    	{
                    		count++;
                    		comment += "Option -Cs ";
                    	}
                    	else if(line.equals("Ll: 3347"))
                    	{
                    		count++;
                    		comment += "Option -Ll ";
                    	}
                    	else if(line.equals("Lm: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lm ";
                    	}
                    	else if(line.equals("Lo: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lo ";
                    	}
                    	else if(line.equals("Lt: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lt ";
                    	}
                    	else if(line.equals("Lu: 136"))
                    	{
                    		count++;
                    		comment += "Option -Lu ";
                    	}
                    	else if(line.equals("Mc: 0"))
                    	{
                    		count++;
                    		comment += "Option -Mc ";
                    	}
                    	else if(line.equals("Me: 0"))
                    	{
                    		count++;
                    		comment += "Option -Me ";
                    	}
                    	else if(line.equals("Mn: 0"))
                    	{
                    		count++;
                    		comment += "Option -Mn ";
                    	}
                    	else if(line.equals("Nd: 0"))
                    	{
                    		count++;
                    		comment += "Option -Nd ";
                    	}
                    	else if(line.equals("Nl: 0"))
                    	{
                    		count++;
                    		comment += "Option -Nl ";
                    	}
                    	else if(line.equals("No: 0"))
                    	{
                    		count++;
                    		comment += "Option -No ";
                    	}
                    	else if(line.equals("Pc: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pc ";
                    	}
                    	else if(line.equals("Pd: 8"))
                    	{
                    		count++;
                    		comment += "Option -Pd ";
                    	}
                    	else if(line.equals("Pe: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pe ";
                    	}
                    	else if(line.equals("Pf: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pf ";
                    	}
                    	else if(line.equals("Pi: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pi ";
                    	}
                    	else if(line.equals("Po: 236"))
                    	{
                    		count++;
                    		comment += "Option -Po ";
                    	}
                    	else if(line.equals("Ps: 0"))
                    	{
                    		count++;
                    		comment += "Option -Ps ";
                    	}
                    	else if(line.equals("Sc: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sc ";
                    	}
                    	else if(line.equals("Sk: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sk ";
                    	}
                    	else if(line.equals("Sm: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sm ";
                    	}
                    	else if(line.equals("So: 0"))
                    	{
                    		count++;
                    		comment += "Option -So ";
                    	}
                    	else if(line.equals("Zl: 0"))
                    	{
                    		count++;
                    		comment += "Option -Zl ";
                    	}
                    	else if(line.equals("Zp: 0"))
                    	{
                    		count++;
                    		comment += "Option -Zp ";
                    	}
                    	else if(line.equals("Zs: 839"))
                    	{
                    		count++;
                    		comment += "Option -Zs ";
                    	}
                    }
                    
                    	if(count == 0)
                		{
                			comment += "None of the options ";
                		}
                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write(comment + "match.");
                		bufferedWriter.newLine();
                    	
                    	if(count == 29)
                    	{    		
                    		bufferedWriter.write("Good Job!");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseEighteen: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 28 || count == 27 || count == 26 || count == 25 || count == 24 || count == 23 || count == 22
                    			|| count == 21 || count == 20)
                    	{    		
                    		bufferedWriter.write("TestcaseEighteen: 0.20/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 19 || count == 18 || count == 17 || count == 16 || count == 15 || count == 14 || count == 13
                    			|| count == 12 || count == 11 || count == 10)
                    	{    		
                    		bufferedWriter.write("TestcaseEighteen: 0.12/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 9 || count == 8 || count == 7 || count == 6 || count == 5 || count == 4 || count == 3
                    			|| count == 2 || count == 1)
                    	{    		
                    		bufferedWriter.write("TestcaseEighteen: 0.05/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 0)
                    	{
                    		bufferedWriter.write("TestcaseEighteen: 0.0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    
                    
                    //bufferedWriter.newLine();
                    //bufferedWriter.write("Graded By Pratik Warade <Pratik.Warade@ColoState.Edu>");
            		//bufferedWriter.newLine();
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(count != 0)
                    {
                    	count = 0;
                    	comment = "";
                    }
                }
            }
        }
	}
	
	private static void	FinalResults4() throws IOException{
		String target_dir = "./HW4Results/Testcase19/";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        String studentName = "";
        int count = 0;
        String comment = "";
        
        for (File f : files) {
            if(f.isFile()) {
            	
            	String fileName = f.getName();
            	String[] token = fileName.split("_");
            	studentName = token[1];
            	
                BufferedReader inputStream = null;
                BufferedWriter bufferedWriter = null;
                FileWriter fileWriter =
                        new FileWriter("./Grades_HW4/" + studentName + ".grade", true);

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    
                    bufferedWriter = new BufferedWriter(fileWriter);
           
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                    	
                    	if(line.equals("Cc: 11"))
                    	{
                    		count++;
                    		comment += "Option -Cc, ";
                    	}
                    	else if(line.equals("Cf: 19"))
                    	{
                    		count++;
                    		comment += "Option -Cf ";
                    	}
                    	else if(line.equals("Co: 0"))
                    	{
                    		count++;
                    		comment += "Option -Co ";
                    	}
                    	else if(line.equals("Cs: 0"))
                    	{
                    		count++;
                    		comment += "Option -Cs ";
                    	}
                    	else if(line.equals("Ll: 0"))
                    	{
                    		count++;
                    		comment += "Option -Ll ";
                    	}
                    	else if(line.equals("Lm: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lm ";
                    	}
                    	else if(line.equals("Lo: 5388"))
                    	{
                    		count++;
                    		comment += "Option -Lo ";
                    	}
                    	else if(line.equals("Lt: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lt ";
                    	}
                    	else if(line.equals("Lu: 0"))
                    	{
                    		count++;
                    		comment += "Option -Lu ";
                    	}
                    	else if(line.equals("Mc: 1687"))
                    	{
                    		count++;
                    		comment += "Option -Mc ";
                    	}
                    	else if(line.equals("Me: 0"))
                    	{
                    		count++;
                    		comment += "Option -Me ";
                    	}
                    	else if(line.equals("Mn: 1864"))
                    	{
                    		count++;
                    		comment += "Option -Mn ";
                    	}
                    	else if(line.equals("Nd: 0"))
                    	{
                    		count++;
                    		comment += "Option -Nd ";
                    	}
                    	else if(line.equals("Nl: 0"))
                    	{
                    		count++;
                    		comment += "Option -Nl ";
                    	}
                    	else if(line.equals("No: 0"))
                    	{
                    		count++;
                    		comment += "Option -No ";
                    	}
                    	else if(line.equals("Pc: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pc ";
                    	}
                    	else if(line.equals("Pd: 5"))
                    	{
                    		count++;
                    		comment += "Option -Pd ";
                    	}
                    	else if(line.equals("Pe: 0"))
                    	{
                    		count++;
                    		comment += "Option -Pe ";
                    	}
                    	else if(line.equals("Pf: 24"))
                    	{
                    		count++;
                    		comment += "Option -Pf ";
                    	}
                    	else if(line.equals("Pi: 1"))
                    	{
                    		count++;
                    		comment += "Option -Pi ";
                    	}
                    	else if(line.equals("Po: 269"))
                    	{
                    		count++;
                    		comment += "Option -Po ";
                    	}
                    	else if(line.equals("Ps: 0"))
                    	{
                    		count++;
                    		comment += "Option -Ps ";
                    	}
                    	else if(line.equals("Sc: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sc ";
                    	}
                    	else if(line.equals("Sk: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sk ";
                    	}
                    	else if(line.equals("Sm: 0"))
                    	{
                    		count++;
                    		comment += "Option -Sm ";
                    	}
                    	else if(line.equals("So: 0"))
                    	{
                    		count++;
                    		comment += "Option -So ";
                    	}
                    	else if(line.equals("Zl: 0"))
                    	{
                    		count++;
                    		comment += "Option -Zl ";
                    	}
                    	else if(line.equals("Zp: 0"))
                    	{
                    		count++;
                    		comment += "Option -Zp ";
                    	}
                    	else if(line.equals("Zs: 1719"))
                    	{
                    		count++;
                    		comment += "Option -Zs ";
                    	}
                    }
                    
                    	if(count == 0)
                		{
                			comment += "None of the options ";
                		}
                    
                    	bufferedWriter.newLine();
                		bufferedWriter.newLine();
                		bufferedWriter.write("#########################");
                		bufferedWriter.newLine();
                		bufferedWriter.write(comment + "match.");
                		bufferedWriter.newLine();
                    	
                    	if(count == 29)
                    	{    		
                    		bufferedWriter.write("Good Job!");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("TestcaseNineteen: 0.25/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 28 || count == 27 || count == 26 || count == 25 || count == 24 || count == 23 || count == 22
                    			|| count == 21 || count == 20)
                    	{    		
                    		bufferedWriter.write("TestcaseNineteen: 0.20/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 19 || count == 18 || count == 17 || count == 16 || count == 15 || count == 14 || count == 13
                    			|| count == 12 || count == 11 || count == 10)
                    	{    		
                    		bufferedWriter.write("TestcaseNineteen: 0.12/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 9 || count == 8 || count == 7 || count == 6 || count == 5 || count == 4 || count == 3
                    			|| count == 2 || count == 1)
                    	{    		
                    		bufferedWriter.write("TestcaseNineteen: 0.05/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    	else if(count == 0)
                    	{
                    		bufferedWriter.write("TestcaseNineteen: 0.0/0.25");
                    		bufferedWriter.newLine();
                    		bufferedWriter.write("#########################");
                    		bufferedWriter.newLine();
                    	}
                    
                    
                    bufferedWriter.newLine();
                    bufferedWriter.write("Graded By Pratik Warade <Pratik.Warade@ColoState.Edu>");
            		bufferedWriter.newLine();
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    
                    if (bufferedWriter != null) {
                    	bufferedWriter.close();
                    }
                    
                    if(count != 0)
                    {
                    	count = 0;
                    	comment = "";
                    }
                }
            }
        }
	}
	
	
	
	
	
	private static void	CalculateToalScore() throws IOException{
		String target_dir = "./Grades_HW4/";
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
        		, test18 = null, test19 = null;
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
                    		//System.out.println("Testcase11");
                        	String[] token = line.split(":");
                        	String score = token[1];
                        	String[] token1 = score.split("/");
                        	test19 = token1[0];
                        	//System.out.println(test11);
                    	}
                    } 	
                    	if((test1 != null) && (test2 != null) && (test3 != null) && (test4 != null) && (test5 != null)
                    			&& (test6 != null) && (test7 != null) && (test8 != null) && (test9 != null) && (test10 != null) && 
                    			(test11 != null) && (test12 != null) && (test13 != null) && (test14 != null) && (test15 != null)
                    			&& (test16 != null) && (test17 != null) && (test18 != null) && (test19 != null))
                    	{	
                    		//System.out.println("Inside sum");
                    		double sum = Double.parseDouble(test1.trim()) + Double.parseDouble(test2.trim()) + Double.parseDouble(test3.trim())
                    			+ Double.parseDouble(test4.trim()) + Double.parseDouble(test5.trim()) + Double.parseDouble(test6.trim())
                    			+ Double.parseDouble(test7.trim()) + Double.parseDouble(test8.trim()) + Double.parseDouble(test9.trim())
                    					+ Double.parseDouble(test10.trim()) + Double.parseDouble(test11.trim()) + 
                    					Double.parseDouble(test12.trim()) + Double.parseDouble(test13.trim()) + 
                    					Double.parseDouble(test14.trim()) + Double.parseDouble(test15.trim()) + Double.parseDouble(test16.trim())
                    					+ Double.parseDouble(test17.trim()) + Double.parseDouble(test18.trim()) + Double.parseDouble(test19.trim());
                    		
                    		String finalScore = Double.toString(sum) + "/" + "4.0";
                    	
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
