package example;

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] myarray= {1,2,3,4,5,6,7,8,9};
		
		int length=myarray.length;
		
		int temp=0;
		
		for(int i=0; i<(length/2); i++) {
			
			temp=myarray[i];
			
			myarray[i]=myarray[length-i-1];
			
			myarray[length-i-1]=temp;
			
		}
		
		
		for (int i=0;i<length;i++) {
			
			System.out.println("myarray["+i+"] = "+myarray[i]);
		}
		
		
		
		

	}

}
