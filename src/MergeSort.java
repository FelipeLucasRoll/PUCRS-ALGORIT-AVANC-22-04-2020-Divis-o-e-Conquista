
public class MergeSort {
	public void mergeSort(int[] vetor, int size) {
		if (size < 2) return;
		
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
