package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;

public class SelectSession extends JFrame implements ActionListener, WindowListener {
	
	private Notification jNotification;
	private JPanel contentPane;
	private JButton btnSessao1445, btnSessao1645, btnSessao1845, btnSessao2045;
	private JRadioButton rbtn1, rbtn2;
	private ButtonGroup rbtngroup;
	private JLabel lblMae;
	private JLabel lblSessees;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SelectArmchair frame = new SelectArmchair();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SelectSession(Notification jNotification) {
		this.jNotification = jNotification;
		this.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFilme = new JLabel("");
		lblFilme.setBounds(45, 67, 188, 237);
		contentPane.add(lblFilme);
		
		ImageIcon imagem1 = new ImageIcon(this.getClass().getResource("../imagens/AVoltaDasQueNaoForam.jpg"));
		Image imag1 = imagem1.getImage().getScaledInstance(lblFilme.getWidth(), lblFilme.getHeight(), Image.SCALE_SMOOTH);
		lblFilme.setIcon(new ImageIcon(imag1));
		
		btnSessao1445 = new JButton("14:45");
		btnSessao1445.setBounds(45, 358, 89, 23);
		contentPane.add(btnSessao1445);
		
		btnSessao1645 = new JButton("16:45");
		btnSessao1645.setBounds(144, 358, 89, 23);
		contentPane.add(btnSessao1645);
		
		btnSessao1845 = new JButton("18:45");
		btnSessao1845.setBounds(243, 358, 89, 23);
		contentPane.add(btnSessao1845);
		
		btnSessao2045 = new JButton("20:45");
		btnSessao2045.setBounds(342, 358, 89, 23);
		contentPane.add(btnSessao2045);
		
		JLabel lblFilme2 = new JLabel("");
		lblFilme2.setBounds(243, 67, 188, 237);
		contentPane.add(lblFilme2);
		
		ImageIcon imagem2 = new ImageIcon(this.getClass().getResource("../imagens/filmemineiros.jpg"));
		Image imag2 = imagem2.getImage().getScaledInstance(lblFilme2.getWidth(), lblFilme2.getHeight(), Image.SCALE_SMOOTH);
		lblFilme2.setIcon(new ImageIcon(imag2));
		
		rbtn1 = new JRadioButton("");
		rbtn1.setBounds(123, 311, 21, 23);
		contentPane.add(rbtn1);
		
		rbtn2 = new JRadioButton("");
		rbtn2.setBounds(328, 311, 21, 23);
		contentPane.add(rbtn2);
		
		rbtngroup = new ButtonGroup();
		rbtngroup.add(rbtn1);
		rbtngroup.add(rbtn2);
		
		lblMae = new JLabel("Selecione o filme de sua prefer\u00EAncia.");
		lblMae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMae.setBounds(116, 26, 269, 29);
		contentPane.add(lblMae);
		
		lblSessees = new JLabel("Sess\u00F5es:");
		lblSessees.setBounds(220, 325, 73, 23);
		contentPane.add(lblSessees);
		
		btnSessao1445.addActionListener(this);
		btnSessao1645.addActionListener(this);
		btnSessao1845.addActionListener(this);
		btnSessao2045.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(rbtn1.isSelected() || rbtn2.isSelected()) {
			new SelectArmchair(this);	
		}else {
			JOptionPane.showMessageDialog(this, "Nenhum filme selecionado!");
		}
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.jNotification.setEnabled(true);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
