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
public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> pb = new HashMap<>();
        pb.put("Nahian", 1677);
        pb.put("Monsur", 1777);
        System.out.println(pb.get("Nahian"));
        System.out.println(pb.size());
         System.out.println(pb.values());
        
    }
    
}
