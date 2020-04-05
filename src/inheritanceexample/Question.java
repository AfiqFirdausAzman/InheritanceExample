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
public class Question {
    
    public String bloom_taxonomy;
    public String question;
    public String correctAns;
    
    //default COnstructor
    public Question()
    {
        
    }
    
    
    public Question(String bloom_taxonomy, String question, String correctAns)
    {
        this.bloom_taxonomy = bloom_taxonomy;
        this.question = question;
        this.correctAns = correctAns;
    }
    
    public String getBloom()
    {
        return bloom_taxonomy;
    }
    
    public void setBloom(String newBloom)
    {
        this.bloom_taxonomy = newBloom;
    }
    
    public String getQuestion()
    {
        return question;
    }
    
    public void setQuestion(String newQuestion)
    {
        this.question = newQuestion;
    }
    
    public String getCorrectAns()
    {
        return correctAns;
    }
    
    public void setCorrectAns(String newCorrectAns)
    {
        this.correctAns = newCorrectAns;
    }
    
    public String toString()
    {
        return (bloom_taxonomy + "\n" + question);
    }
}
