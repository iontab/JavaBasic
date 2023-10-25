package example;

public class MinimumNumberArray {

	public static void main(String[] args) {
	
			int[] myarray= {12,54,13,52,35,6,7,8};
			
			int min;
			
			min = myarray[0];
			
			for(int i=0;i<myarray.length;i++) {
				
				if(myarray[i]<min) {
					
					min=myarray[i];
				}
				
			}
			
			System.out.println("Minimum:"+min);
		}
		
		

	}


