package gui;

import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormCalculadora extends BaseFrame {
	
	public FormCalculadora() {
		super("Calculadora");
		// informa o painel
		JPanel panel = (JPanel)this.getContentPane();
		
		// instancia uma caixa de texto
		JTextField text1 = new JTextField("text1");
		JTextField text2 = new JTextField("text2");
		JTextField text3 = new JTextField("text3");
		
		// dimensiona as caixas de texto
		text1.setSize(150, 30);
		text2.setSize(150, 30);
		text3.setSize(150, 30);		
		
		/*
		// exclui o layout padrao
		panel.setLayout(null);
		// define o tamanho da caixa de texto
		text.setBounds(10,10, 200, 30);
		*/
		
		// definindo o layout do painel
		panel.setLayout(new FlowLayout());
		
		// inclui os text's no painel
		panel.add(text3);
		panel.add(text1);
		panel.add(text2);
		
		JTextField x;
		for (int i=0; i<100; i++) {
			x = new JTextField("Texto " + i);
			x.setSize(300, 30);
			panel.add(x);
		}
		
		this.setVisible(true);
		
	}

}
