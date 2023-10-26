package example;

public class Average {
	
	public static void main(String args[]) {
		
		double arr[]= {7.8,23.7,9.3,5.2,4.1,7.8};
		
		double sum=0;
		
		double average=0;
		
		for(int i=0;i<arr.length;i++) {
			
			sum =sum +arr[i];
		}
		
		average=sum / arr.length;
		
		System.out.println("average:"+ average);
	}

}
