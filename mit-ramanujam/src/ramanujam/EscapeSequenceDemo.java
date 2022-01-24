package ramanujam;

public class EscapeSequenceDemo {
	public static void main(String[] args) {
		System.out.println("Hello \"Ramanujam\" world.");
		System.out.println("Hello \'Ramanujam\' world.");
		System.out.println("Hello \nRamanujam \nworld.");
		System.out.println("Hello \tRamanujam\t world.");
		System.out.println("Hello \n\tRamanujam\n\t\t world.");
		
		System.out.println("Hello \b\b\bworld");
		
		System.out.println("Hello ramanujam\rWorld");
		
		System.out.println("Hello \f World");
	}
}
