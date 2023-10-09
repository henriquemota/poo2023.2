import javax.swing.JOptionPane;

public class Subprograma02 {
	
	Subprograma03 p03 = new Subprograma03();
	
	public void execute(int valor) throws Exception {
		float valorfloat = (float)valor;
		p03.execute(valorfloat);
		JOptionPane.showMessageDialog(null, "Passou pelo subprograma2");
	}

}
