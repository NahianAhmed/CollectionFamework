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
public class iterater_linklist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(7);
        list.add(91);
        System.out.println(list);
        
        Iterator itr =  list.iterator();
        while (itr.hasNext()) {
            int i = (int) itr.next();
            System.out.println(i);
            
        }
        
    }
}
