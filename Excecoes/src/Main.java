import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args){
		try {
			new Subprograma01().execute();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é do tipo inteiro.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.out.print(e.getMessage());
		}
	}
	
	

}
