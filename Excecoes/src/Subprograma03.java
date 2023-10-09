import javax.swing.JOptionPane;

public class Subprograma03 {
	
	public void execute(float valor) throws Exception {
		JOptionPane.showMessageDialog(null, "Passou pelo subprograma3 com valor " + valor);
		throw new Exception("Erro no subprograma03");
	}

}
