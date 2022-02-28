import java.util.ArrayList;  
  
public class Remove {  
   public static void main(String[] args) {  
     
      ArrayList<String> arr = new ArrayList<String>(5);  
      
      arr.add("Hell");  
      arr.add("Park");  
      arr.add("Kim Jongeun");  
      arr.add("Tony Shark");  
      System.out.println("The list of the size is: " + arr.size());  
      
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
      
      arr.remove(1);  
      System.out.println("\n After removing the element the size of the ArrayList is: " + arr.size());  
     
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  
