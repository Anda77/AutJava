/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication653;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


     
    
    

public class StaticBlock1 {

   
        public static Map<Integer,Print> map = new HashMap<>();
     
    static{
         
        DataInputStream i = null;
        boolean eof = false;
     
        try{
     
          i = new DataInputStream(new BufferedInputStream(new FileInputStream("file.dat")));
             
          while(!eof){
           
          int data1 = i.readInt();
          String data2 = i.readUTF();
           
          map.put(data1, new Print(data1,data2));
             
          }
             
        }catch(IOException e){
             
            eof = true;
            try{
            i.close();
            }catch(IOException p){
                     
            }
        }
    }
    
    public static void main(String[] args) {
       
    }

}
