package lemurdatabase;

import java.util.Random;

/**
 *
 * @author etwat3497
 */
abstract public class Mammal {
    
    //Declare private variables
    private int genderDecider;
    private String  output;
    
    //Declare public variables 
    public int age;
    public double weight;
    public String gender;
    
    //Instantiate random class
    Random rand = new Random();
    
    
  /**
   * pre: void
   * post: void
   * Default constructor of class to assign base values to variables
   */
    public Mammal(){
        //Generate random age and weight for any mammal
        age = rand.nextInt((200-1)+1)+1;
        weight = Math.random()*((6000-0.001)+1)+0.001;
        
        //Generate either 1 or 2
        genderDecider = rand.nextInt((2-1)+1)+1;
        //If 1, the gender is male
        if(genderDecider == 1){
            gender = "Male";
        }
        //If 2, the gender is female
        else if(genderDecider == 2){
            gender = "Female";
        }
    }
    
    //Abstract class to return the species to the database
    abstract public String getSpecies();

    
  /**
   * pre: void
   * post: string output
   * Method to return all relevant information about the mammal
   */
    public String toString(){
        output = "Age = "+age+"\nWeight = "+weight+"\nGender = "+gender+"\n";
        return output;
    }
}
