package q2;

import java.io.*;

public class q2 {
	//Stream: ['a','b', 'a'] 
	 public static void main( String args[]) throws IOException 
	  {
		  BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		  String st="";
		    if((st=buffer.readLine())==null) {
		    	System.out.println("No input received");
		    	System.exit(0);
		    }
		    String[] tokens=st.split( "\'");
		    for(int i=0 ;i<tokens.length;i++) {
		    	tokens[i]=tokens[i].replaceAll(" ","" );
		    //	tokens[i]=tokens[i].replaceAll("[","" );
		    	tokens[i]=tokens[i].replaceAll(",","" );
		    	tokens[i]=tokens[i].replaceAll("]","" );
		    	tokens[i]=tokens[i].replaceAll("'","" );
		    	

		    	
		    	System.out.println(tokens[i]);
		    }
		    
		 
		  
	  }
}
