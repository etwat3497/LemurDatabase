package lemurdatabase;

/**
 *
 * @author etwat3497
 */
public class TreeLemur extends Lemur{
    //Declare variables
    private String output, packSize;
    
    
  /**
   * pre: void
   * post: void
   * Default constructor of class to assign base values to variables
   */
    public TreeLemur(){
        //Call to superclass
        super();
        //Set variables
        colour = "Red";
        food = "Fruit";
        packSize = "Large groups";
        mane = "Has a mane";
        speciesType = "Tree Lemur";
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
   * Method to return all relevant information about the tree lemur
   */
    public String toString(){
        output = "\n"+speciesType+":\n";
        //Call to lemur toString method
        output+= super.toString();
        output += "Food = "+food+"\nColour = "+colour+"\nPack Size = "+packSize+"\nMane = "+mane+"\n";
        return output;
    }
}
