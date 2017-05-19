/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;
import  java.util.*;
/**
 *
 * @author Nahian
 */
public class Queues {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(9);
        System.out.println(queue);
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);
        
        
    }
}
