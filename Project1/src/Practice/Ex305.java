package Practice;
// C = 5/9 * (F-32)
public class Ex305 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5/9f)*(fahrenheit-32)*100+0.5)/100f;
		
		System.out.println("Fahrenheit:" +fahrenheit);
		System.out.println("Celcius:" +celcius);
	}
}
