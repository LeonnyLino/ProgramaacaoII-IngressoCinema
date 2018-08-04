package telas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.FuncionarioDao;
import model.Funcionario;

public class Notification extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfLogin;
	private JTextField tfSenha;
	private JButton btnLogin;
	private FuncionarioDao fDao = new FuncionarioDao();
	private Funcionario func;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notification frame = new Notification();
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
	public Notification() {
		setTitle("Notification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCinemaVendas = new JLabel("Cinema - Vendas de Ingressos");
		lblCinemaVendas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCinemaVendas.setBounds(57, 11, 250, 36);
		contentPane.add(lblCinemaVendas);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(68, 68, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(68, 111, 46, 14);
		contentPane.add(lblSenha);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(124, 68, 114, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setBounds(124, 108, 114, 20);
		contentPane.add(tfSenha);
		tfSenha.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(254, 158, 89, 23);
		contentPane.add(btnLogin);
		
		btnLogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		for(Funcionario f:fDao.listar()) {
			if(tfLogin.getText().equals(f.getLogin()) && tfSenha.getText().equals(f.getSenha())) {
				new SelectSession(this);				
			}else if(!tfLogin.getText().equals(f.getLogin()) || !tfSenha.getText().equals(f.getSenha())) {
				JOptionPane.showMessageDialog(this, "Login ou senha estão incorretos");
				tfLogin.setText("");
				tfSenha.setText("");
			}
		}
		
		
			
			
		}
		
	}
