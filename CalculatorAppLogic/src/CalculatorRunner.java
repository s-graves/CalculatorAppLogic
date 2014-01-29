import java.util.Scanner;


public class CalculatorRunner {
	
	
	public static void main(String[] args){
		Scanner sup = new Scanner(System.in);
		String temp = sup.nextLine();
		Tokenizer token = new Tokenizer(temp);
		token.tokenizeString();
	}
}
