import java.util.*;
public class CheckNumber{
       
  
     public static void main(String []args){
       
        String str = "638537"; 
        String input = "3"; 
        
        List<String>  mylist = new ArrayList<String>(); 
      
      
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
			 mylist.add(str.charAt(i)+"");
        } 

		int occurancec = Collections.frequency(mylist, input); 
         
        if(occurancec!=0) 
        System.out.println("Whole Number=> "+str+" Input =>"+input+" Output =>True  And Occurance =>"+occurancec);
		else
		System.out.println("Whole Number=> "+str+"Input =>"+input+"Output =>False  And Occurance =>"+occurancec);
	
     }
}