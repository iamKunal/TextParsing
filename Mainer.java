/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainer;

import java.util.*;
import CSVReader.*;
/**
 * Class Description
 * @author kunal
 */
public class Mainer {
	/**
	 * Main Description
     * @param args Parameter description
     * 
     */
    public static void main(String[] args) {
        String a = "536381,82567,\"AIRLINE LOUNGE,METAL SIGN\",2,01/12/10 09:41,2.1,15311,United Kingdom";
        ArrayList<String> t = CSVReader.toList(a);
        for (int i=0; i<t.size(); i++){
            System.out.println(t.get(i));
        }
        String b = CSVReader.toRow(t);
        System.out.println(b);
    }
    
}


