import java.util.Scanner;
import java.util.Stack;

public class Main 
{
	public static void main(String[] args)   
	{
		Scanner sc = new Scanner(System. in ); // создание сканера
		Stack<String> numbers = new Stack<String>(); // создание стека
		System.out.println("---Введите число---"); 
		String txt = "" ; 
		txt = sc.nextLine(); // чтение из консоли
		
		
		for (int i = 0; i < txt.length() ; ++i) { 
			char c = txt.charAt(i); // внесение символа под номером "i" во временную переменную
			numbers.push(Character.toString(c)); // внесение цифры в стек

		}
		
		
		while (!numbers.empty()) {
			System.out.print(numbers.pop());// вывод цифр из стека
		}
	}
}






