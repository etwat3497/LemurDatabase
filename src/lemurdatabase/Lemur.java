package lemurdatabase;

/**
 *
 * @author etwat3497
 */
abstract public class Lemur extends Mammal {
    //Private variables only for the lemur class
    private String location, classification, coat, dominantRole, grooming, output;
    //Public variables to be used in the lemur subclasses
    public String colour, food, mane, speciesType;
    
    
  /**
   * pre: void
   * post: void
   * Default constructor of class to assign base values to variables
   */
    public Lemur(){
        //Call to super class
        super();
        //Set variables
        location = "Madagascar";
        classification = "Prosimians";
        coat = "Fur";
        dominantRole = "Female";
        grooming = "Use their teeth as a comb";
        age = rand.nextInt((20-1)+1)+1;
        weight = Math.random()*((7-1)+1)+1;
    }
    
    
  /**
   * pre: void
   * post: string output
   * Method to return all relevant information about the lemur
   */
    public String toString(){
        //Add mammal toString to output
        output = super.toString();
        output += "Location = "+location+"\nClassification = "+classification+"\nCoat = "+coat+"\n";
        
        //If male add additional output
        if(gender == "Male"){
            output+="Male lemur = Non-dominant role\n";
        }
        //If female add additional output
        else{
            output+="Female lemur = Dominant role\n";
        }
        return output;
    }
}
