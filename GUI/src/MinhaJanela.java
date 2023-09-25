import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MinhaJanela extends JFrame {
	
	JLabel label;
	JButton button;
	JPanel panel;
	
	public MinhaJanela() {
		this.label = new JLabel("Bem vindo ao label");
		this.label.setLocation(100, 100);
		
		this.setTitle("Minha janela");
		this.setSize(this.getMaximumSize());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		this.getContentPane().add(this.label);
		
		this.setVisible(true);
	}
	public MinhaJanela(String title) {
		this.label = new JLabel("Bem vindo ao label");
		this.label.setLocation(100, 100);

		this.setTitle(title);
		this.setSize(this.getMaximumSize());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.getContentPane().add(this.label);

		this.setVisible(true);
	}
	public MinhaJanela(String title, int width, int height) {
		this.setTitle("Minha janela");
		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.label = new JLabel("Bem vindo ao label");
		this.label.setBounds(10, 10, 200, 80);
		
		this.button = new JButton("Clique aqui");
		this.button.setBounds(10, 140, 200, 80);
		
        this.panel = (JPanel) this.getContentPane();
        this.panel.setLayout(null);
        
        this.panel.add(this.label);
        this.panel.add(this.button);
        
        this.setVisible(true);
	}

}
