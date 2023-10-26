package example;

public class SumArray {

	public static void main(String[] args) {
		
		double [] myarray= {3.8,5.6,3.2,17.8};
		
		double sum=0;
		
		for(int i=0;i<myarray.length;i++) {
			
			sum= sum + myarray[i];
			
		}
		
		System.out.println("Sum of array:"+sum);

	}

}
