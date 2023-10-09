package q2;

import java.io.*;
import java.util.Map;
import java.util.Map.Entry;

public class q2 {
	//Stream: ['a','b', 'a'] 
	 public static void main( String args[]) throws IOException 
	  {BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String st = "";
		if ((st = buffer.readLine()) == null) {
			System.out.println("No input received");
			System.exit(0);
		}
		st = st.toLowerCase();
		char[] tokens = st.toCharArray();

		FirstNonRepeatingStream n = new FirstNonRepeatingStream();
		for (int i = 0; i < tokens.length; i++) {
			n.add(tokens[i]);
		}
		System.out.println("String :  " + st);

		System.out.println("First Non Repeating character :  " + n.getFirstNonRepeating());
	}

 
             
		    
		 
		  
	  }

