package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField FieldNome;
	private JButton btnLimpar;
	private JButton btnLogar;
	private JPasswordField pass_Senha;

	

	

	public JTextField getFieldNome() {
		return FieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		FieldNome = fieldNome;
	}

	public JPasswordField getPass_Senha() {
		return pass_Senha;
	}

	public void setPass_Senha(JPasswordField pass_Senha) {
		this.pass_Senha = pass_Senha;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnLogar() {
		return btnLogar;
	}

	public void setBtnLogar(JButton btnLogar) {
		this.btnLogar = btnLogar;
	}


	public Janela() {
		setTitle("Janela Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemberLogin = new JLabel("");
		lblMemberLogin.setIcon(new ImageIcon(Janela.class.getResource("/imagens/Login-icon.png")));
		lblMemberLogin.setBounds(70, 110, 289, 279);
		contentPane.add(lblMemberLogin);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setForeground(SystemColor.textHighlightText);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsuario.setBounds(446, 155, 150, 37);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(SystemColor.textHighlightText);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSenha.setBounds(466, 232, 109, 37);
		contentPane.add(lblSenha);
		
		FieldNome = new JTextField();
		FieldNome.setBounds(369, 195, 289, 26);
		contentPane.add(FieldNome);
		FieldNome.setColumns(10);
		
		btnLogar = new JButton("Logar");
		btnLogar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogar.setIcon(new ImageIcon(Janela.class.getResource("/imagens/ok1.png")));
		btnLogar.setBounds(369, 320, 126, 37);
		contentPane.add(btnLogar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLimpar.setIcon(new ImageIcon(Janela.class.getResource("/imagens/clean.png")));
		//btnLimpar.setI
		btnLimpar.setBounds(532, 320, 126, 37);
		contentPane.add(btnLimpar);
		
		pass_Senha = new JPasswordField();
		pass_Senha.setBounds(369, 280, 289, 26);
		contentPane.add(pass_Senha);
	}
}
