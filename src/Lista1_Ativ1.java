import javax.swing.JOptionPane;

public class Lista1_Ativ1 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		int a = rec(n);
		JOptionPane.showMessageDialog(null, "A somatória é: " + a);
	}
	
	public static int rec(int n) {
		/* Condição de parada é dado quando o número for menor ou igual a zero 
		 * uma vez que preciso da somatória dos valores inteiros, o retorno foi definido no zero. */
		if(n <= 0) {
		return 0;
		} else {
		/*Recebo o valor inicial, e somo ao proximo número anterior a ele, exemplo:
		 3 + rec (3-1); // 2 + rec (2-1); // 1 + rec(1-1);
		 3 +    3       // 2 +     1      // 1 +   0  //aqui como rec(1-1) = 0 ele volta fechando */
		return n + rec(n - 1);
		}
	}
}

