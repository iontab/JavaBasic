package example;

public class MinimumNumberArray {

	public static void main(String[] args) {
	
		
		int [] myarray= {11,55,8,98,6,77,17};
		
		int min;
		
		min=myarray[0];
		
		for(int i=0;i<myarray.length;i++) {
			
			if(myarray[i]<min) {
				
				min=myarray[i];
				
			}
		}
		
		System.out.println("Minimum:"+min);

	}

}
