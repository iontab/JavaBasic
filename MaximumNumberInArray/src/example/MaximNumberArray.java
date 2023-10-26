package example;

public class MaximNumberArray {

	public static void main(String[] args) {
		
		int []myarray= {18,87,5,3,9,12,54,39};
		
		int max=myarray[0];
		
		for(int i=0;i<myarray.length;i++) {
			
			if(myarray[i]>max) {
				
				max=myarray[i];
			}
		}
		
		System.out.println("Max:"+max);

	}

}
