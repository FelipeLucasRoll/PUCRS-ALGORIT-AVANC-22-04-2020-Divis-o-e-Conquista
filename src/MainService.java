
public class MainService {

	public long multiply(long x, long y, long n) { 
	   if(n == 1)
	      return x * y;
	   else {
		  long m, a, b, c, d, e, f, g, h;
		  
	      m = n/2;
	      a = (long)(x/Math.pow(2, m));
	      b = (long)(x%Math.pow(2, m));
	      c = (long)(Math.abs(y/Math.pow(2, m))); 
	      d = (long)(y%Math.pow(2, m));
	      e = multiply(a, c, m);
	      f = multiply(b, d, m);
	      g = multiply(b, c, m);
	      h = multiply(a, d, m);
	      return (long)(Math.pow(2,2*m)*e + Math.pow(2, m*(g + h)) + f);
	   }
	}
	
	public int maxVal1(int A[], int n) {  
		int max = A[0];
		for (int i = 1; i < n; i++) {  
			if( A[i] > max ) 
			   max = A[i];
		}
		return max;
	}

	public int maxVal2(int A[], int init, int end) {
		if (end - init <= 1)
			return Math.max(A[init], A[end]);
		else {
			int m = (init + end) / 2;
			int v1 = maxVal2(A, init, m);
			int v2 = maxVal2(A, m + 1, end);
			return Math.max(v1, v2);
		}
	}

	public void mergeSort(int[] vetor, int size) {
		if (size < 2)
			return;

		int metade = size / 2;
		int[] vetorA = new int[metade];
		int[] vetorB = new int[size - metade];

		for (int i = 0; i < metade; i++)
			vetorA[i] = vetor[i];

		for (int i = metade; i < size; i++)
			vetorB[i - metade] = vetor[i];

		mergeSort(vetorA, metade);
		mergeSort(vetorB, size - metade);

		merge(vetor, vetorA, vetorB, metade, size - metade);
	}

	public void merge(int[] vetor, int[] vetorA, int[] vetorB, int sizeA, int sizeB) {
		int i = 0, j = 0, k = 0;

		while (i < sizeA && j < sizeB) {
			if (vetorA[i] <= vetorB[j])
				vetor[k++] = vetorA[i++];
			else
				vetor[k++] = vetorB[j++];
		}

		while (i < sizeA)
			vetor[k++] = vetorA[i++];
		while (j < sizeB)
			vetor[k++] = vetorB[j++];
	}
}
