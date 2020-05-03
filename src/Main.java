
public class Main {

	public static final int[] size     = {32, 2048, 1_048_576};
	public static final int[] sizeLong = {4 , 16  , 64};
	
	public static int[] vetor1 = RandomUtil.randomVector(size[0]); 
	public static int[] vetor2 = RandomUtil.randomVector(size[0]); 
	
	public static void main(String[] args) {
		MainService service = new MainService();
		service.mergeSort(vetor1, size[0]);
		int maxVal1 = service.maxVal1(vetor2, vetor2.length);
		int maxVal2 = service.maxVal2(vetor2, 0, vetor2.length-1);
		long multiply = service.multiply(RandomUtil.randomLong(), RandomUtil.randomLong(), sizeLong[2]);
		
		System.out.println("TAMANHO: " + size[0]);
		System.out.println("RESULT MergeSort: " + printVector(vetor1));
		System.out.println("RESULT MaxVal1  : " + maxVal1);
		System.out.println("RESULT MaxVal2  : " + maxVal2);
		System.out.println("RESULT multiply : " + multiply);
		
	}
	
	public static String printVector(int[] vector) {
		StringBuilder retorno = new StringBuilder("");
		for(int x=0;x<vector.length-1; x++) 
			retorno.append(vector[x] + " - ");
		retorno.append(vector[vector.length-1]);
		return retorno.toString();
	}

}
