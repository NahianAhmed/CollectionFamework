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
public class Stack_Ex {

    public static void main(String[] args) {
      Stack st = new Stack();
      st.push("Nahian");
      st.push("Ahmed");
      st.push(5137);
    System.out.println(st);
    st.pop();
    
    System.out.println(st);
    System.out.println(st.search("Ahmed"));
    
    
    }
}
