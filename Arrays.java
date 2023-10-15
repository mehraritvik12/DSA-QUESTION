import java.util.Scanner;

public class Arrays {

public static int Largest(int arr[]) {
	
	int largest = arr[0];
	for(int i=0;i<=arr.length;i++) {
		for(int j=1;i<=arr.length;i++) {
		
	if(arr[i]<arr[j]) {
		largest = arr[j];
	}
		}
		
	}
	
	return largest;
	
	
}
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int arr[]= {1,2,3,4};
		System.out.println(arr);
		System.out.println(Largest(arr));
			
   

	}

}
