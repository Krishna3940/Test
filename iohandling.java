
import java.util.*;
import java.io.*;

public class iohandling {
		public static void main(String[] args) {
	    try {
	      File myObj = new File("C:\\Users\\krishnajha\\Desktop\\New folder\\assignment.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	        Map<String,Integer> mp=new TreeMap<>();
	        
	        
	        String arr[]=data.split(" ");
	 
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            
	            if(mp.containsKey(arr[i]))
	            {
	                mp.put(arr[i], mp.get(arr[i])+1);
	            }
	            else
	            {
	                mp.put(arr[i],1);
	            }
	        }
	        
	        
	        for(Map.Entry<String,Integer> entry:
	                    mp.entrySet())
	        {
	            System.out.println(entry.getKey()+
	                    " - "+entry.getValue());
	        }
	        
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    
	    
    }
	    
	  }
