package Exam;
public class Question {
    private String question;
    private String o1;
    private String o2;
    private String o3;
    private String o4;
    private String answer; // Correct answer identifier ("a", "b", "c", "d")

    public Question(String question, String o1, String o2, String o3, String o4, String answer) {
        this.question = question;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
        this.answer = answer;
    }
    public void display()
	{
		System.out.println(question+"\na-->"+o1+"\nb-->"+o2+"\nc-->"+o3+"\nd-->"+o4);
	}
    // Getters for accessing the question and options
    public String getQuestion() {
        return question;
    }

    public String geto1() {
        return o1;
    }

    public String geto2() {
        return o2;
    }

    public String geto3() {
        return o3;
    }

    public String geto4() {
        return o4;
    }

    public String getanswer() {
        return answer;
    }
    

}


