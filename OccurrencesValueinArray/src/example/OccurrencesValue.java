package example;

public class OccurrencesValue {

	public static void main(String[] args) {
		
	
		int [] myarray= {4,9,7,6,5,3,2,1,5,9};
		
		int count=0;
		int to_find=9;
		
		for(int i=0;i<myarray.length;i++) {
			
			if(myarray[i]==to_find) {
				count++;
			}
		}
		
		System.out.println("found:"+count);
	}

}
