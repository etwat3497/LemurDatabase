package lemurdatabase;

/**
 *
 * @author etwat3497
 */
public class JungleLemur extends Lemur{
    //Declare variables
    private String output, packSize;
    
    
  /**
   * pre: void
   * post: void
   * Default constructor of class to assign base values to variables
   */
    public JungleLemur(){
        //Call to superclass
        super();
        //Set variable
        food = "Mice, snails, and insects";
        colour = "Black or blue";
        packSize = "Small groups";
        mane = "Has no mane";
        speciesType = "Jungle Lemur";
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
   * Method to return all relevant information about the jungle lemur
   */
    public String toString(){
        output = "\n"+speciesType+":\n";
        //Call to lemur toString method
        output += super.toString();
        output += "Food = "+food+"\nColour = "+colour+"\nPack Size = "+packSize+"\nMane = "+mane+"\n";
        return output;
    }
}
