import java.util.Random;

public class RandomUtil {
	public static int randomNumber() {
	    Random r = new Random();
	    return r.nextInt((5000 - 0) + 1) + 0;
	}
	
	public static int[] randomVector(int size) {
		int[] vetor = new int[size];
		for(int x=0; x<size; x++) {
			vetor[x] = randomNumber();
		}
	    return vetor;
	}
}
