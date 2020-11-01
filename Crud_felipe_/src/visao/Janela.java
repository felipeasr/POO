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

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField FieldNome;
	private JTextField FieldSenha;
	private JButton btnLimpar;
	private JButton btnLogar;

	public JTextField getFieldNome() {
		return FieldNome;
	}

	public void setFieldNome(JTextField textField) {
		this.FieldNome = textField;
	}

	public JTextField getFieldSenha() {
		return FieldSenha;
	}

	public void setFieldSenha(JTextField textField_1) {
		this.FieldSenha = textField_1;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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
		
		FieldSenha = new JTextField();
		FieldSenha.setColumns(10);
		FieldSenha.setBounds(369, 270, 289, 26);
		contentPane.add(FieldSenha);
		
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
	}
}
