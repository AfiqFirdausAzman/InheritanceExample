/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int whatToDo;
                
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        Scanner obj3 = new Scanner(System.in);
        Scanner obj4 = new Scanner(System.in);
        Scanner obj5 = new Scanner(System.in);
        Scanner obj6 = new Scanner(System.in);
        Scanner obj7 = new Scanner(System.in);
        Scanner obj8 = new Scanner(System.in);
        Scanner obj9 = new Scanner(System.in);
        Scanner obj10 = new Scanner(System.in);
        Scanner obj11 = new Scanner(System.in);
        Scanner obj12 = new Scanner(System.in);
        
        QuickQuiz qQuiz1 = new QuickQuiz();
        QuickQuiz qQuiz2 = new QuickQuiz();
        do{
        System.out.println("Welcome to EALA");
        System.out.println("Please choose:");
        System.out.println("1.Add Question 2.View Question 3.Update Question 4.Try Quiz 5.Exit");
        whatToDo = in.nextInt();
        
        switch(whatToDo) {
            case 1:
                
                System.out.println("Enter category:");
                String category = obj1.nextLine();
                System.out.println("Enter question:");
                String question = obj2.nextLine();
                System.out.println("Enter correct answer:");
                String correctAns = obj3.nextLine();

                System.out.println("Enter category:");
                String category2 = obj4.nextLine();
                System.out.println("Enter question:");
                String question2 = obj5.nextLine();
                System.out.println("Enter correct answer:");
                String correctAns2 = obj6.nextLine();

                qQuiz1 = new QuickQuiz(category, question, correctAns);
                qQuiz2 = new QuickQuiz(category2, question2, correctAns2);
                break;
                
            case 2:
                
                System.out.println("Quesion 1:");
                System.out.println("\nCategory: " + qQuiz1.getBloom());
                System.out.println("\nQuestion: " + qQuiz1.getQuestion());
                System.out.println("\nCorrect Answer: " + qQuiz1.getCorrectAns());
                
                System.out.println("\nQuesion 2:");
                System.out.println("\nCategory: " + qQuiz2.getBloom());
                System.out.println("\nQuestion: " + qQuiz2.getQuestion());
                System.out.println("\nCorrect Answer: " + qQuiz2.getCorrectAns());
                break;
                
            case 3:
                
                System.out.println("Update Question 1:");
                System.out.println("Update category:");
                String UptCategory = obj7.nextLine();
                System.out.println("Update question:");
                String UptQuestion = obj8.nextLine();
                System.out.println("Update correct answer:");
                String UptCorrectAns = obj9.nextLine();

                System.out.println("Update Question 2:");
                System.out.println("Update category:");
                String UptCategory2 = obj10.nextLine();
                System.out.println("Update question:");
                String UptQuestion2 = obj11.nextLine();
                System.out.println("Update correct answer:");
                String UptCorrectAns2 = obj12.nextLine();

                qQuiz1.setBloom(UptCategory);
                qQuiz1.setQuestion(UptQuestion);
                qQuiz1.setCorrectAns(UptCorrectAns);
                
                qQuiz2.setBloom(UptCategory2);
                qQuiz2.setQuestion(UptQuestion2);
                qQuiz2.setCorrectAns(UptCorrectAns2);
                break;
                
            case 4:
                
                System.out.println(qQuiz1.toString());
                System.out.println("Enter your answer: " );
                String userInput = in2.nextLine();
                System.out.println("Your entered answer is " + userInput);
                qQuiz1.checkAns(userInput);

                System.out.println(qQuiz2.toString());
                System.out.println("Enter your answer: " );
                String userInput2 = in3.nextLine();
                System.out.println("Your entered answer is " + userInput2);
                qQuiz2.checkAns(userInput2);
                break;
                
        }
        }while(whatToDo != 5);
        
        System.out.println("See you next time!");
        
        
        
        
        
        
        
    }
    
}
