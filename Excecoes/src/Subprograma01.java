import javax.swing.JOptionPane;

public class Subprograma01 {
	
	Subprograma02 p02 = new Subprograma02();
	
	public void execute() throws Exception {
		String valor = JOptionPane.showInputDialog("Informe um valor");
		int valorint = Integer.parseInt(valor);
		p02.execute(valorint);
		JOptionPane.showMessageDialog(null, "Passou pelo subprograma1");
	}

}
