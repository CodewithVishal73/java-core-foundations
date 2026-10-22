import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class QuizSimulator{
        public static void main(String[] args){
			Random r= new Random();
			Scanner s= new Scanner(System.in);
			String[] ques= {"What is the capital of France?",
          			        "Which language is used for Android development?",
          			        "What is the value of Pi (approx)?",
            				"Which planet is known as the Red Planet?",
          			        "Who wrote 'Hamlet'?",
          			        "What is the largest mammal?",
           			        "Which country is known as the Land of the Rising Sun?",
           			        "What is the chemical symbol for Gold?",
          			        "Which organ purifies blood in the human body?",
         			        "Who discovered gravity?"
					};
			
        	         String[][] options = {
          					   {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},                          
         					   {"1. Swift", "2. Kotlin", "3. PHP", "4. Ruby"},                             
         					   {"1. 3.14", "2. 2.14", "3. 4.14", "4. 5.14"},                               
         					   {"1. Earth", "2. Venus", "3. Jupiter", "4. Mars"},                          
         					   {"1. William Shakespeare", "2. Charles Dickens", "3. Mark Twain", "4. Leo Tolstoy"}, 
         					   {"1. Elephant", "2. Giraffe", "3. Rhino", "4. Blue Whale"},                
         					   {"1. China", "2. Japan", "3. Korea", "4. Thailand"},                        
         					   {"1. Au", "2. Ag", "3. Gd", "4. Go"},                                       
         					   {"1. Heart", "2. Lungs", "3. Kidney", "4. Liver"},                         
          					   {"1. Galileo", "2. Newton", "3. Einstein", "4. Tesla"}                     
       						 };

			int[] correct = {3, 2, 1, 4, 1, 4, 2, 1, 3, 2};
			System.out.println("Enter no. of questions you want to attempt(1-10)");
			int n= s.nextInt();
			if(n<1 || n>10){
				System.out.println("Invalid number of questions.....");
			}
			boolean[] ask = new boolean[10];
			int score=0,i=0;
			System.out.println("Your Quiz StartS Now:-\n");
			while(i<n){
				int index= r.nextInt(10);
				if(!ask[index]){
					ask[index]= true;
					System.out.println("Q."+(i+1)+" "+ques[index]);
					for(int j=0;j<4;j++){
						System.out.println(options[index][j]);
					}
					System.out.println("enter your choice(1-4):");
					int ch= s.nextInt();
					if(ch==correct[index]){
							score++;
					}
					System.out.println("____________________________________");
					i++;
				}
			}
			System.out.println("Result:-");
			System.out.println("Your Total Score :"+score);
			System.out.println("Correct Answers :"+score);
			System.out.println("InCorrect Answers :"+(n-score));
			s.close();
	}
}