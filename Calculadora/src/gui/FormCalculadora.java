package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormCalculadora extends BaseFrame {
	
	private float memoria = 0;
	private String operacao = "";
	private String operador = "";
	
	JTextField text; 
	JButton btn;
	JPanel panel, panelButtons;
	
	
	public FormCalculadora() {
		// invoca o método construtor da classe base
		super("Calculadora");
		
		// informa o painel
		panel = (JPanel)this.getContentPane();
		
		// define os botoes
		String buttons[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","CE",",","/","="};
		
		
		text = new JTextField();
		text.setEnabled(false);
		panel.add(text, BorderLayout.NORTH);

		panelButtons = new JPanel(new GridLayout(0, 4));
		for (String botao : buttons) {
			btn = new JButton(botao);
			panelButtons.add(btn);	
		}
		
		panel.add(panelButtons, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
		
	}

}
