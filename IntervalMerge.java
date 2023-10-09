package q3;
import java.util.*;
public class IntervalMerge {
	 
	public void show(int arr[]) {
		System.out.print( "[");

		for(int j=0;j<arr.length;j++) {
			if(j==arr.length-1) {
				System.out.print(arr[j]);

			}
			else {
			System.out.print(arr[j]+ ",");
		}}
		System.out.print( "]");

		System.out.println(" ");

	}
 	IntervalMerge(List<int[]> intervals){
 		int firstElement=0;
 		int secondElement=0;
 		firstElement=intervals.get(0)[0];//1
			int length=intervals.get(0).length;
 
			secondElement=intervals.get(0)[length-1];//6
 
 		for(int i=1;i<intervals.size();i++) {
			  length= (intervals.get(i).length-1);
 
				 
 			 if(intervals.get(i)[0]>=firstElement && intervals.get(i)[0]<=secondElement )
 			 {
 				 
 				 
 				if(i==1) {
 
 					int arr[]=intervals.get(0);
 					int arr2[]=intervals.get(1);
  	 				
 	 				arr[length]=arr2[length];
 	 				 
 	 				intervals.set(0, arr);
 	 				intervals.remove(1);
 	 				i--;
  				}
 				else {
 					int arr[]=intervals.get(i-1);
 					int arr2[]=intervals.get(i); 
 	 				arr[length]=arr2[length];
 	 				intervals.set(i-1, arr);
 	 				intervals.remove(i);
 	 				i--;
 				}
 			 }
 			
 			firstElement=intervals.get(i)[0];
 			secondElement=intervals.get(i)[length];
 
  			
 		}
 		for(int j=0 ;j<intervals.size();j++) {
 			show(intervals.get(j));
 		}
		
	}
}

/*[1, 3],
[2, 6],
[8, 10],
[15, 18]


logic 
->firstelement=1 lastelement=3
-> 2>firstelement && 2<lastelement 
merge first and 2nd interval 
firstelement=2 & lastelement=6
-> 8<firstelement no merging
firstelement=8 lastelement=10
-> 15<8 
no merging */
