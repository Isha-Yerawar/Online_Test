package Exam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamConsole {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
	QuestionDB qdb;
	public ExamConsole()
	{
		qdb=new QuestionDB(); 
	}
	int menu() throws NumberFormatException, IOException 
    {   int choice=0;
            System.out.println("1--->Start Exam");
            System.out.println("2--->Exit");
            System.out.println("Enter your choice");
           
            choice=Integer.parseInt( br.readLine());
        
            return choice;
    }
    public void start() throws NumberFormatException, IOException    
{
    	
    while (true) {
    	Question q;
    	String answer;
    	
        int choice=menu();
        switch (choice) {
            case 1:
            				System.out.println("Question Number "+qdb.getCount());
            				System.out.println("What will be the output ");	
            				int score,i;
                         	for (i = 0,score=0; i <= qdb.getCount(); i++) {
								q=qdb.getQuestion(i);
								q.display();
								System.out.println("Enter correct choice");
								answer=br.readLine();
								if (q.getanswer().equalsIgnoreCase(answer.trim())) 
								{
									System.out.println("hoorayyyy!!!!,You r Hosiyarr");
				                    score++;
				                }
								else
								{
									System.out.println("Bhakkk:(((,Burbak");
								}
								System.out.println("Your score is: " + score + " out of " + (i+1));
							}
            				                
            				break;
               case 4:System.exit(0);                
                break;
            default: System.out.println("You entered wrong choice");
                }
    }
   
    
}//start
}

