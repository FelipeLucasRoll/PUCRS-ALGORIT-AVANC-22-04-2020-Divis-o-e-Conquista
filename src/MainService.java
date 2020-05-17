
public class MainService {

	public static int iteracoesMultiply;
	public static int iteracoesMaxVal1;
	public static int iteracoesMaxVal2;
	public static int iteracoesMergeSort;

	
	public int getIteracoesMaxVal1(){
		return iteracoesMaxVal1;
	}


	public void adicionaIteracaoMaxVal1(int i){
		iteracoesMaxVal1 = iteracoesMaxVal1 + i;
		
	}

	
	public int getIteracoesMaxVal2(){
		return iteracoesMaxVal2;
	}


	public void adicionaIteracaoMaxVal2(int i){
		iteracoesMaxVal2 = iteracoesMaxVal2 + i;
		
	}

	public int getIteracoesMergeSort(){
		return iteracoesMergeSort;
	}


	public void adicionaIteracaoMergeSort(int i){
		iteracoesMergeSort = iteracoesMergeSort + i;
		
	}



	public int getIteracoesMultiply(){
		return iteracoesMultiply;
	}

	public void adicionaIteracaoMultiply(int i){
		iteracoesMultiply = iteracoesMultiply + i;
		
	}


	public long multiply(long x, long y, long n) { 


	   if(n == 1){
		adicionaIteracaoMultiply(3);
	     return  x * y;
	}else {
		
		  long m, a, b, c, d, e, f, g, h;
		 adicionaIteracaoMultiply(9);
		  
		  m = n/2;
		  adicionaIteracaoMultiply(2);

		  a = (long)(x/Math.pow(2, m));
		  adicionaIteracaoMultiply(3);

		  b = (long)(x%Math.pow(2, m));
		  adicionaIteracaoMultiply(3);

		  c = (long)(Math.abs(y/Math.pow(2, m))); 
		  adicionaIteracaoMultiply(3);

		  d = (long)(y%Math.pow(2, m));
		  adicionaIteracaoMultiply(3);

		  e = multiply(a, c, m);
		  adicionaIteracaoMultiply(2);
		  
		  f = multiply(b, d, m);
		  adicionaIteracaoMultiply(2);

		  g = multiply(b, c, m);
		  adicionaIteracaoMultiply(2);

		  h = multiply(a, d, m);
		  adicionaIteracaoMultiply(11);
		 
		 
		  return  (long)(Math.pow(2,2*m)*e + Math.pow(2, m*(g + h)) + f);
	   }
	}
	
	public int maxVal1(int A[], int n) {  

		int max = A[0];
		adicionaIteracaoMaxVal1(2);
		for (int i = 1; i < n; i++) {  
			adicionaIteracaoMaxVal1(3);
			if( A[i] > max ) 
			   max = A[i];
			   adicionaIteracaoMaxVal1(4);
	
		}
		adicionaIteracaoMaxVal1(1);
		
		return max;
	}

	public int maxVal2(int A[], int init, int end) {

		if (end - init <= 1){
			adicionaIteracaoMaxVal2(3);
			return Math.max(A[init], A[end]);	
		}else {
			int m = (init + end) / 2;
			int v1 = maxVal2(A, init, m);
			int v2 = maxVal2(A, m + 1, end);
			adicionaIteracaoMaxVal2(7);
			
			return  Math.max(v1, v2);
		}
			
	
	}

	public void mergeSort(int[] vetor, int size) {
	
		if (size < 2){
			adicionaIteracaoMergeSort(3);
			return;
		}
		int metade = size / 2;
		int[] vetorA = new int[metade];
		int[] vetorB = new int[size - metade];
		adicionaIteracaoMergeSort(8);

		for (int i = 0; i < metade; i++){
			vetorA[i] = vetor[i];
			adicionaIteracaoMergeSort(i + 3);
		}

		for (int i = metade; i < size; i++){
			vetorB[i - metade] = vetor[i];
			adicionaIteracaoMergeSort(i+4);
		}
		mergeSort(vetorA, metade);
		mergeSort(vetorB, size - metade);

		merge(vetor, vetorA, vetorB, metade, size - metade);
		adicionaIteracaoMergeSort(5);
		
	}

	public void merge(int[] vetor, int[] vetorA, int[] vetorB, int sizeA, int sizeB) {
		int i = 0, j = 0, k = 0;
		adicionaIteracaoMergeSort(3);

		while (i < sizeA && j < sizeB) {
			adicionaIteracaoMergeSort(i);
			if (vetorA[i] <= vetorB[j]){
				vetor[k++] = vetorA[i++];
				adicionaIteracaoMergeSort(6);
			}else{
				vetor[k++] = vetorB[j++];
				adicionaIteracaoMergeSort(3);
			}
		}

		while (i < sizeA){
			vetor[k++] = vetorA[i++];
			adicionaIteracaoMergeSort(i + 3);
		}
		while (j < sizeB){
			vetor[k++] = vetorB[j++];
			adicionaIteracaoMergeSort(j + 3);
		}
	}
}
