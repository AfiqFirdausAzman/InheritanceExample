/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author User
 */
public class QuickQuiz extends Question {
    
    public QuickQuiz()
    {
        
    }
    
    public QuickQuiz(String bloom_taxonomy, String question, String correctAns)
    {
        super(bloom_taxonomy, question, correctAns);
        
    }
    
    public void checkAns(String userAns)
    {
        if(userAns.equals(super.correctAns)){
            System.out.println("Congrats! Correct Answer!");
        }
        else{
            System.out.println("Wrong Answer! Try again next time!");
        }
    }
    
    @Override
    public String toString()
    {
        return (super.toString());
    }
    
}
