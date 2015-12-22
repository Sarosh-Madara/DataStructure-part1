/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurepart1;

import java.util.Scanner;

/**
 *
 * @author Sarosh Madara
 */
public class DataStructurePart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MultiDimensionalLoop mdl = new MultiDimensionalLoop();
       mdl.multiDimentionalLoop();
        
        
        
        
    }
    
    static class MultiDimensionalLoop
    {
        Scanner scan = new Scanner(System.in);
        
        public  void multiDimentionalLoop(){
            double[][] subjectMarks = new double[4][3];
            
            for(int i=0; i<subjectMarks.length; i++){
                
                subjectMarks[i][0] = scan.nextDouble();
                subjectMarks[i][1] = scan.nextDouble();
                subjectMarks[i][2] = scan.nextDouble();
                
            }
            
            for(int i=0; i<subjectMarks.length; i++){
                
                System.out.print("English: "+subjectMarks[i][0]);
                System.out.print("  Urdu: "+subjectMarks[i][1]);
                System.out.print("  Maths: "+subjectMarks[i][2]);
                System.out.println("");
            }
            
        }
    }
    
    
    
    
}
