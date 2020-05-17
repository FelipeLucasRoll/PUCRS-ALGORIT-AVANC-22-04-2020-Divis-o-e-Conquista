
public class Main {

	

	public static final int[] size     = {32, 2048, 1_048_576};
	public static final int[] sizeLong = {4 , 16  , 64};
	
	public static int[] vetor1 = RandomUtil.randomVector(size[1]); 
	public static int[] vetor2 = RandomUtil.randomVector(size[0]); 
	
	public static void main(String[] args) {
		MainService service = new MainService();
		service.mergeSort(vetor1, size[1]);
		int maxVal1 = service.maxVal1(vetor2, vetor2.length);
		int maxVal2 = service.maxVal2(vetor2, 0, vetor2.length-1);
		long multiply = service.multiply(RandomUtil.randomLong(), RandomUtil.randomLong(), sizeLong[2]);
		
		long tempoInicio;
		long tempoFinal; 

		System.out.println("Merge Sort" + "\n");
		tempoInicio = System.currentTimeMillis();
		System.out.println("TAMANHO: " + size[0]);
		System.out.println("RESULT: " + printVector(vetor1));
		tempoFinal = System.currentTimeMillis();
		System.out.printf("Tempo de execucao: " + "%.3f ms%n", (tempoFinal - tempoInicio) / 1000d);
		System.out.println("Numero de iteracoes MergeSort :" + service.getIteracoesMergeSort());
		System.out.println("---------------------------------------------------------------------------------------------------------------------");

		System.out.println("MaxVal1" + "\n");
		tempoInicio = System.currentTimeMillis();
		System.out.println("RESULT : " + maxVal1);
		tempoFinal = System.currentTimeMillis();
		System.out.printf("Tempo de execucao: " + "%.3f ms%n", (tempoFinal - tempoInicio) / 1000d);
		System.out.println("Numero de iteracoes maxVal1 :" + service.getIteracoesMaxVal1());
		System.out.println("---------------------------------------------------------------------------------------------------------------------");

		System.out.println("MaxVal2" + "\n");
		tempoInicio = System.currentTimeMillis();
		System.out.println("RESULT : " + maxVal2);
		tempoFinal = System.currentTimeMillis();
		System.out.printf("Tempo de execucao: " + "%.3f ms%n", (tempoFinal - tempoInicio) / 1000d);
		System.out.println("Numero de iteracoes maxVal2 :" + service.getIteracoesMaxVal2());
		System.out.println("---------------------------------------------------------------------------------------------------------------------");


		System.out.println("Multiply" + "\n");
		tempoInicio = System.currentTimeMillis();
		System.out.println("RESULT: " + multiply);
		tempoFinal = System.currentTimeMillis();
		System.out.printf("Tempo de execucao: " + "%.3f ms%n", (tempoFinal - tempoInicio) / 1000d);
		System.out.println("Numero de iteracoes multiply :" + service.getIteracoesMultiply());
		
	}
	
	public static String printVector(int[] vector) {
		StringBuilder retorno = new StringBuilder("");
		for(int x=0;x<vector.length-1; x++) 
			retorno.append(vector[x] + " - ");
		retorno.append(vector[vector.length-1]);
		return retorno.toString();
	}

}
