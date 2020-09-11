package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class janelaP extends JFrame {

	private JPanel contentPane;
	private JTextField cpf;
	private JTextField nome;
	private JTextField end;
	private JTextField sal;
	private JButton buscar;

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getEnd() {
		return end;
	}

	public void setEnd(JTextField end) {
		this.end = end;
	}

	public JTextField getSal() {
		return sal;
	}

	public void setSal(JTextField sal) {
		this.sal = sal;
	}

	public JTextField getCpf() {
		return cpf;
	}

	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaP frame = new janelaP();
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
	public janelaP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("CPF:");
		contentPane.add(lblNewLabel, "cell 0 1,alignx left");
		
		cpf = new JTextField();
		contentPane.add(cpf, "flowx,cell 1 1,growx");
		cpf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		contentPane.add(lblNewLabel_1, "cell 2 1");
		
		nome = new JTextField();
		contentPane.add(nome, "cell 2 1,growx");
		nome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o:");
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		end = new JTextField();
		contentPane.add(end, "cell 1 2 2 1,growx");
		end.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Salario:");
		contentPane.add(lblNewLabel_3, "cell 0 3,alignx trailing");
		
		sal = new JTextField();
		contentPane.add(sal, "cell 1 3,growx");
		sal.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		contentPane.add(btnNewButton, "flowx,cell 2 6");
		
		JButton btnNewButton_1 = new JButton("Atualizar");
		contentPane.add(btnNewButton_1, "cell 2 6");
		
		JButton btnNewButton_2 = new JButton("Remover");
		contentPane.add(btnNewButton_2, "cell 2 6");
		
		buscar = new JButton("Consultar");
		contentPane.add(buscar, "cell 2 6");
	}

}
