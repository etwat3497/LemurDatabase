/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

//Add imports
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create an arraylist of lemur objects
        ArrayList<Lemur> lemurs = new ArrayList();
        
        //Create scanner object to get user response
        Scanner input = new Scanner(System.in);
        
        //Declare variables
        int numOfLemurs = 0, lemurTypeInput = 0;
        String lemurType = "";
        
        //Get user input
        System.out.println("How many lemurs do you want to add to the list?");
        numOfLemurs = Integer.parseInt(input.nextLine());
        
        //Run for loop for the number of lemurs
        for(int i = 0; i<numOfLemurs;i++){
            //Get user input
            System.out.println("Please enter the type of lemur to add:\n1 - Tree Lemur\n"
                    + "2- Desert Lemur\n3 - JungleLemur");
            lemurTypeInput = Integer.parseInt(input.nextLine());

            //If tree lemur selected
            if(lemurTypeInput == 1){
                lemurs.add(new TreeLemur());
            }
            //If desert lemur selected
            else if(lemurTypeInput == 2){
                lemurs.add(new DesertLemur());
            }
            //If jungle lemur selected
            else{
                lemurs.add(new JungleLemur());
            }
        }
    }
    
}
