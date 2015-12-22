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
public class OneDimensionalArray {
    int nos[] = {-1,-1,-1,-1,-1};
    
    Scanner scan = new Scanner(System.in);
    
    void insert(int elem,int index){
        if( nos[index] == -1 ){
            nos[index] = elem;
        }else{
            
            for(int i = nos.length-1; i != index; i--){
                nos[i] = nos[i-1];
            }
            nos[index] = elem;
        }
    }
    
    void delete(int index){
        if( nos[index] == -1){
            return;
        }else{
            for(int i = index; i < nos.length ; i++){
                
                if(!(i+1 >= nos.length))
                    nos[index++] = nos[i+1];
            }
            nos[index] = -1;
        }
        
    }
    
    void display(){
        
        System.out.println("Array");
        for(int i = 0; i < nos.length ; i++){
            System.out.println(nos[i]);
        }
    }
}
