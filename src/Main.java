
public class Main {

	public static final int[] size = {32, 2048, 1_048_576};
	
	public static int[] vetor1 = RandomUtil.randomVector(size[0]); 
	public static int[] vetor2 = RandomUtil.randomVector(size[0]); 


	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		MaxVal mv = new MaxVal();
		ms.mergeSort(vetor1, size[0]);
		System.out.println("TAMANHO: " + size[0]);
		System.out.println("RESULT: " + printVector(vetor1));
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("TAMANHO: " + size[0]);
		System.out.println("RESULT: " + printVector(vetor2) + " Maior: " + mv.maxVal1(vetor2, vetor2.length ));
		
	}
	
	public static String printVector(int[] vector) {
		StringBuilder retorno = new StringBuilder("");
		for(int x=0;x<vector.length-1; x++) 
			retorno.append(vector[x] + " - ");
		retorno.append(vector[vector.length-1]);
		return retorno.toString();
	}

}
