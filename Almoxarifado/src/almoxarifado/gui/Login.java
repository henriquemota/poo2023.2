package almoxarifado.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Login extends Base {
	
	JLabel lblTitulo, lblMensagem;
	JTextField txtLogin, txtSenha;
	JButton btnLogin;
	JPanel panPrincipal, panMensagem, panFormulario;
	
	public Login() {
		lblTitulo = new JLabel("Faça Login na sua conta");
		lblMensagem = new JLabel("Preencha seus dados");
		
		txtLogin = new JTextField();
		txtSenha = new JTextField();
		
		btnLogin = new JButton("Entrar");
		
		panPrincipal = (JPanel)this.getContentPane();
		panPrincipal.setLayout(new BorderLayout());
		
		
		panMensagem = new JPanel(new GridLayout(2,1));
		panMensagem.add(lblTitulo);
		panMensagem.add(lblMensagem);
		
		panFormulario = new JPanel(new GridLayout(3,1));
		panFormulario.add(txtLogin);
		panFormulario.add(txtSenha);
		panFormulario.add(btnLogin);
		
		panPrincipal.add(panMensagem, BorderLayout.NORTH);
		panPrincipal.add(panFormulario, BorderLayout.CENTER);
		
		
		this.pack();		
		this.setVisible(true);
		
	}

}
