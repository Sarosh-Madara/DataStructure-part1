/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurepart1;

/**
 *
 * @author Sarosh Madara
 */
public class StackWithArray {
    private static int[] buffer = {-1,-1,-1,-1,-1};
    
    private static final int STACK_UNDERFLOW = 0;
    private static final int STACK_OVERFLOW = 0;
    
    public void push(int element){
        
        for(int i = buffer.length-1 ; i >0; i--){
            buffer[i] = buffer[i-1];
        }
        buffer[0] = element;

    }
    public int pop(){
        int temp = buffer[0];
        
        for(int i=0; i < buffer.length - 1; i++){
            buffer[i] = buffer[i+1];
        }
        buffer[buffer.length - 1] = -1;
        return temp;
    }
    
    public void top(){
        System.out.println("Stack Top: "+buffer[0]);
    }

    @Override
    public String toString() {
        String str = "[";
        
        for (int i = 0; i<buffer.length; i++) {
            if(i == buffer.length-1)
                str += buffer[i];
            else
                str += buffer[i] +", ";
        }
        str += "]";
        return str;
    }
}
