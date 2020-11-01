

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
	private JTextField FieldText;
	private JTextField Fieldtext_1;
	private JButton btn1;
	private JButton btn;

	
	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getFieldText() {
		return FieldText;
	}

	public void setFieldText(JTextField fieldText) {
		FieldText = fieldText;
	}

	public JTextField getFieldtext_1() {
		return Fieldtext_1;
	}

	public void setFieldtext_1(JTextField fieldtext_1) {
		Fieldtext_1 = fieldtext_1;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn() {
		return btn;
	}

	public void setBtn(JButton btn) {
		this.btn = btn;
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
		lblMemberLogin.setIcon(new ImageIcon(Janela.class.getResource("/Login-icon.png")));
		lblMemberLogin.setBounds(70, 110, 289, 279);
		contentPane.add(lblMemberLogin);
		
		JLabel lbl = new JLabel("USUARIO");
		lbl.setForeground(SystemColor.textHighlightText);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl.setBounds(446, 155, 150, 37);
		contentPane.add(lbl);
		
		JLabel lbl1 = new JLabel("SENHA");
		lbl1.setForeground(SystemColor.textHighlightText);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl1.setBounds(466, 232, 109, 37);
		contentPane.add(lbl1);
		
		FieldText = new JTextField();
		FieldText.setBounds(369, 195, 289, 26);
		contentPane.add(FieldText);
		FieldText.setColumns(10);
		
		Fieldtext_1 = new JTextField();
		Fieldtext_1.setColumns(10);
		Fieldtext_1.setBounds(369, 270, 289, 26);
		contentPane.add(Fieldtext_1);
		
		btn = new JButton("Logar");
		btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn.setIcon(new ImageIcon(Janela.class.getResource("/ok1.png")));
		btn.setBounds(369, 320, 126, 37);
		contentPane.add(btn);
		
		btn1 = new JButton("Limpar");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn1.setIcon(new ImageIcon(Janela.class.getResource("/clean.png")));
		//btnLimpar.setI
		btn1.setBounds(532, 320, 126, 37);
		contentPane.add(btn1);
	}
}
