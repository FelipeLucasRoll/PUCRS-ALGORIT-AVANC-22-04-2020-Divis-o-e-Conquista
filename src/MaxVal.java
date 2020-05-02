public class MaxVal {
    
	public int maxVal1(int A[], int n) {  
		int max = A[0];
		for (int i = 1; i < n; i++) {  
			if( A[i] > max ) 
			   max = A[i];
		}
		return max;
	}
}