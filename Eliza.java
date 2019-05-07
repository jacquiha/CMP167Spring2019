import java.util.Scanner;

public class Eliza {
	Scanner scnr = new Scanner(System.in);
	public class PromptBank {

		String [] questions;
		String [] statements;
		
		public PromptBank(){
			System.out.println("Hello, my name is Eliza. What is your name?");
				String name = scnr.next();
				System.out.println("Hello, " + name + ". Tell me what is on your mind in 1 sentence.");
				
			//questions = new String[   ]; //initialize your array to the correct length to match your number of questions you populate it with
			//statements = //initialize your array to the correct length to match your number of questions you populate it with
			
		}

		public void populateStatementsArray(){
			questions[0] = "Tell me more about BLANK1 and BLANK2";
			questions[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
			questions[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
			/*complete this method with your other statements using BLANK1 for word1
			 * and BLANK2 for word2 place holder 
			 */
		}
		public void populateQuestionsArray(){
			questions[0] = "Is there anything else about BLANK1 and BLANK2?";
			questions[1] = "Does BLANK1 bother you? How about BLANK2?";
			questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
			
			/*complete this method with your other questions using BLANK1 for word1
			 * and BLANK2 for word2 place holder 
			 */
			
		}
		/*  
		public String getRandomStatementTrunk(){
			//fill in the method so it randomly selects the statement template
			//from the questions array ... hint use Math.random() to get the random index
			//so you can replace BLANK1 and BLANK2 with the appropriate words
		}
		*/
		/*
		public String getRandomQuestionTrunk(){
			//fill in the method so it randomly selects the question template
			//from the questions array ... hint use Math.random() to get the random index
			//so you can replace BLANK1 and BLANK2 with the appropriate words
		}
		*/
		
		
	}
}
