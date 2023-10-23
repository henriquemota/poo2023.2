import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args){
		/*
		try {
			new Subprograma01().execute();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é do tipo inteiro.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.out.print(e.getMessage());
		}
		*/
		
		int dividendo, divisor, resultado;
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("informe o didivendo ");
			dividendo = s.nextInt();
			System.out.print("informe o divisor ");
			divisor = s.nextInt();
			resultado = dividendo / divisor;
			System.out.println(resultado);	
			throw new Exception("");
		} catch (Exception e) {
			System.out.print(e.getClass());
		} finally {
			s.close();
		}
		
		
		try {
			System.out.println("Executei a primeira linha");
			//throw new MinhaExcecao();
			int x [] = new int[2];
			x[0] = 10;
			x[1] = 20;
			x[2] = 30;
			//System.out.println("Executei a segunda linha");
		} catch(RuntimeException e) {
			System.out.println("tratamento de excecao do array");
		} catch (Exception e) {
			System.out.println(e.getClass());
		} finally {
			System.out.println("Executei a linha do finally");
		}
	}
	
	

}
