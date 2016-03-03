package projectThirteen;

public class CentigradeToFahrenheit {
private static double centigrade = 0;
private static double fahrenheit;
	public static void main(String[] args) {
		for(int i = 0; i <=20; i++){ //loops 20 times
			System.out.print("C: "+centigrade );
			fahrenheit = ((9.0/5.0)*centigrade +32);
			System.out.println(" F: "+fahrenheit);
			centigrade+= 1;
		}

	}

}
