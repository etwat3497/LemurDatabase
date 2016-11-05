/*
 * Created by Ethan Watt
 * On October 28,2016
 * Designed to demonstrate abstract superclasses and the use of subclasses in displaying lemur information
 */

package lemurdatabase;

//Add imports
import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class LemurDatabase {

   /**
    * pre: String array
    * post: void
    * Main method to have the lemur database communicate with the various classes
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create an arraylist of lemur objects
        Lemur[] lemurObjects;
        
        //Create scanner object to get user response
        Scanner input = new Scanner(System.in);
        
        //Declare variables
        int numOfLemurs = 0, lemurTypeInput = 0;
        String lemurType = "";
        boolean lemursNumLoop = true, typeOfLemurLoop = true;
        
        //Get user input
        System.out.println("How many lemurs do you want to add to the list?");
        while(lemursNumLoop){
            try{
                //Get user input
                numOfLemurs = Integer.parseInt(input.nextLine());
                
                //Catch bad user input
                if(numOfLemurs<0){
                    System.out.println("Please enter a positive amount of lemurs!");
                }
                //End the while loop
                else{
                    lemursNumLoop = false;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please input the number of lemurs you want.");
            }
        }
        //Set the size of the lemur array to the number of lemurs desired
        lemurObjects = new Lemur[numOfLemurs];
        
        //Run for loop for the number of lemurs
        for(int i = 0; i<numOfLemurs;i++){
            //Get user input
            System.out.println("\nPlease enter the type of lemur to add:\n1 - Tree Lemur\n"
                    + "2- Desert Lemur\n3 - JungleLemur");
            
            //Set while loop to true so it runs for each for loop iteration
            typeOfLemurLoop = true;
            while(typeOfLemurLoop){
                try{
                    //Get user input
                    lemurTypeInput = Integer.parseInt(input.nextLine());
                    //Catch bad user input
                    if(lemurTypeInput<1 || lemurTypeInput>3){
                        System.out.println("Please enter either 1, 2, or 3.");
                    }
                    //End the while loop
                    else{
                        typeOfLemurLoop = false;
                    }
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid input. Please enter the type of lemur.");
                }
            }

            //If tree lemur selected
            if(lemurTypeInput == 1){
                lemurObjects[i]= new TreeLemur();
            }
            //If desert lemur selected
            else if(lemurTypeInput == 2){
                lemurObjects[i] = new DesertLemur();
            }
            //If jungle lemur selected
            else{
                lemurObjects[i] = new JungleLemur();
            }     
        }
        
        //Formatting output
        System.out.println("\n\n");
        for(int j = 0;j<numOfLemurs;j++){
            //Display what types of lemurs are being created
            System.out.println("Creating "+lemurObjects[j].getSpecies()+".");
        }
        
        System.out.println("----------------------");
        
        for(int k = 0; k<numOfLemurs; k++){
            //Display the lemur information
            System.out.println(lemurObjects[k].toString());
        }
    }
    
}
