
public class bubblesort {

	public static void main(String[] args) {
		int a[] = {2,1,8,-3,6,4,12};
		int n = a.length;
//		loop 1
		for(int i =0; i<n-1; i++) {
//		loop 2	
			for(int j =0; j<n-1; j++ ) {
			if(a[j+1] < a[j]) {
			int temp = a[j+1];
			a[j+1]=a[j];
			a[j]= temp;
		   }

     	 }
      }
		
		for (int item: a) {
			System.out.println(item+ " ");
		}
	 }
  }