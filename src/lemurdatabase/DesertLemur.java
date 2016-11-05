package lemurdatabase;

/**
 *
 * @author etwat3497
 */
public class DesertLemur extends Lemur{
    //Declare variables
    private double babyDeathRate;
    private String output;
    
    
  /**
   * pre: void
   * post: void
   * Default constructor of class to assign base values to variables
   */
    public DesertLemur(){
        //Call to superclass
        super();
        //Set variables
        food = "Cacti";
        colour = "White";
        babyDeathRate = 0.66;
        mane = "Has a mane";
        speciesType = "Desert Lemur";
    }
    
    
  /**
   * pre: void
   * post: string species type
   * Method to return what type of species the lemur is
   */
    public String getSpecies(){
        return speciesType;
    }
    
    
  /**
   * pre: void
   * post: string output
   * Method to return all relevant information about the desert lemur
   */
    public String toString(){
        output = "\n"+speciesType+":\n";
        //Call to lemur toString method
        output += super.toString();
        output += "Food = "+food+"\nColour = "+colour+"\nBaby Death Rate = "+babyDeathRate+"\nMane = "+mane+"\n";
        return output;
    }
}
