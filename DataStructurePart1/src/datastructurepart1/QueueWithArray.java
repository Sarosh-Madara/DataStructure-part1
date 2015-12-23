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
public class QueueWithArray {
    
    private static int[] buffer = {-1,-1,-1,-1,-1};
    private int last_element_index = -1;
    
    private static int QUEUE_FULL = 0;
    private static int QUEUE_EMPTY = 0;
    
    public void enqueue(int element){
        if(QUEUE_FULL != 1){
            buffer[++last_element_index] = element;
            if(last_element_index == buffer.length - 1)
                QUEUE_FULL = 1;
        }
    }
    
    public int dequeue(){
        int temp = buffer[0];
        for(int i = 0; i < buffer.length - 1; i++)
            buffer[ i ] = buffer[ i+1 ];
        
        buffer[ buffer.length - 1 ] = -1;
        return temp;
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
