package Exam;

import Exam.Question;

public class QuestionDB {
	
	private Question q [];
	
	private int cnt=10;

	public QuestionDB() {
		super();
		// TODO Auto-generated constructor stub
		
		q=new Question[cnt];
        q[0]=new Question("What will be the output?\n" +"String s = \"abcdefgh\";\n" +"System.out.println(s.indexOf(\"j\"));","true","false","-1","1","c");
        q[1]=new Question("Which of the following method/s" +"do not belong to String class?\n1.length()\n2.sizeof()\n3.endsWith()\n4.reverse()","2, 4","2","1, 3","3","a" );
        q[2]=new Question("If X, Y are classes and L, M are interfaces, then which of the following is illegal in Java ?","class Y extends X implements L, M {}","class Y extends X {}","interface M extends L {}","interface M extends X {}","d");
        q[3]=new Question("Instance variable is a variable \ndeclared in _____.","class and method","class","method","main()","b");
        q[4]=new Question("System.out.println(\"Hello\");  Here, out is of ___ class.","PrintStream","String","System","PrintWriter","a");
        q[5]=new Question("What is false?","Abstract class should not contain constructor.","Reference of super class can refer to object \n" +"   of subclass.","Abstract class is created for inheritance purpose only.","The keyword super helps to access an overridden method.","a");
        q[6]=new Question("What is false about interface?","It contains only abstract methods and final fields","It can be extended by another interface.","It can be instantiated.","It can be implemented by a class.","c");
        q[7]=new Question("Which of the following classes belong to java.lang package?\n1. ArrayIndexOutOfBoundsException\n" +"2. BufferedReader\n" +"3. String\n" +"4. System","3, 4","1, 3, 4","1,2","2,3,4","b");
        q[8]=new Question("Which of the following statements is incorrect?","String is a class in Java.","Strings in java are mutable.","String class can not be inherited.","Java defines a class called StringBuffer, \n" +"   which allows string to be altered.","b");
        q[9]=new Question("Which of the following lines will compile without error?","float f=1.3;","char c=\"a\"; ","int i=10;","boolean b=null; ","c");
        
        
    }
	
	
	
	// add a student 
	//sdb.add(s);
//	public void add(Student p)
//	{
//		s[n]=p;
//		n++;
//	}
	// get a student at specified position
	public Question getQuestion(int i)
	{
		return q[i];
	}
	// get Count of students;
	public int getCount()
	{
		return cnt;
	}

}