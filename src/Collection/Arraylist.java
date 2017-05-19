/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;
import java.util.*;
/**
 *
 * @author Nahian
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List <String> list1 = new ArrayList<>();
      list1.add("Nahian");
      list1.add("Ahmed");
      list1.add("A");
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list1.contains("Nahian"));
      
      
    }
    
}
