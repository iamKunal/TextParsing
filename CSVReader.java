
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSVReader;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class CSVReader {
//    public static void main(String[] args) {
//        String str = "536381,82567,\"AIRLINE LOUNGE,METAL SIGN\",2,01/12/10 09:41,2.1,15311,United Kingdom";
//        ArrayList<String> t = toList(str);
//        String a = toRow(t);
//        System.out.println(a);
//        System.out.println(str);
//    }
    public static ArrayList<String> toList(String row, String delim, String ignore){
        ArrayList<String> rowList = new ArrayList();
        String[] tempList = row.split(delim);
        int ignoreCount=0;
        String tempString = "";
        for (int i=0; i<tempList.length; i++){
            ignoreCount = tempList[i].split(ignore, -1).length-1;
            if (ignoreCount%2!=0){
                tempString = tempList[i];
                
                
                while(tempList[i+1].split(ignore, -1).length-1 % 2 != 0){
                    i++;
                    tempString = tempString + delim + tempList[i];
                }
                rowList.add(tempString);
            }
            else{
                rowList.add(tempList[i]);
            }
        }
        return rowList;
    }
    public static ArrayList<String> toList(String row, String delim){
        return toList(row, delim,"\"");
    }
    public static ArrayList<String> toList(String row){
        ArrayList<String> rowList = new ArrayList();
        return toList(row, ",", "\"");
    }
    public static String toRow(ArrayList<String> rowList, String delim, String ignore){
        String listRow = rowList.get(0);
        for(int i=1; i<rowList.size();i++){
            listRow = listRow + delim + rowList.get(i);
        }
        return listRow;
    }
    public static String toRow(ArrayList<String> rowList, String delim){
        return toRow(rowList,delim,"\"");
    }
    public static String toRow(ArrayList<String> rowList){
        return toRow(rowList,",","\"");
    }
}
