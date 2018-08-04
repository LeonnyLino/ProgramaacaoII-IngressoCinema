package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SelectArmchair extends JFrame implements ActionListener, WindowListener {

	private SelectSession selectionSession;
	private JPanel contentPane;
	

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
	public SelectArmchair(SelectSession selectSession) {
		setTitle("Select Armchair");
		this.selectionSession = selectSession;
		this.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneSuaPoltrona = new JLabel("Selecione sua poltrona");
		lblSelecioneSuaPoltrona.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSelecioneSuaPoltrona.setBounds(237, 21, 269, 39);
		contentPane.add(lblSelecioneSuaPoltrona);
		
		JButton button = new JButton("H0");
		button.setBounds(27, 71, 51, 27);
		contentPane.add(button);
		
		JButton btnH_1 = new JButton("H1");
		btnH_1.setBounds(88, 71, 51, 27);
		contentPane.add(btnH_1);
		
		JButton btnH = new JButton("H2");
		btnH.setBounds(149, 71, 51, 27);
		contentPane.add(btnH);
		
		JButton btnH_2 = new JButton("H3");
		btnH_2.setBounds(210, 71, 51, 27);
		contentPane.add(btnH_2);
		
		JButton btnH_3 = new JButton("H4");
		btnH_3.setBounds(271, 71, 51, 27);
		contentPane.add(btnH_3);
		
		JButton btnH_4 = new JButton("H5");
		btnH_4.setBounds(332, 71, 51, 27);
		contentPane.add(btnH_4);
		
		JButton btnH_5 = new JButton("H6");
		btnH_5.setBounds(393, 71, 51, 27);
		contentPane.add(btnH_5);
		
		JButton btnH_6 = new JButton("H7");
		btnH_6.setBounds(454, 71, 51, 27);
		contentPane.add(btnH_6);
		
		JButton btnH_7 = new JButton("H8");
		btnH_7.setBounds(515, 71, 51, 27);
		contentPane.add(btnH_7);
		
		JButton btnH_8 = new JButton("H9");
		btnH_8.setBounds(576, 71, 51, 27);
		contentPane.add(btnH_8);
		
		JButton btnH_9 = new JButton("H10");
		btnH_9.setBounds(637, 71, 51, 27);
		contentPane.add(btnH_9);
		
		JButton btnH_10 = new JButton("H11");
		btnH_10.setBounds(698, 73, 51, 27);
		contentPane.add(btnH_10);
		
		JButton btnG = new JButton("G0");
		btnG.setBounds(27, 109, 51, 27);
		contentPane.add(btnG);
		
		JButton btnG_1 = new JButton("G1");
		btnG_1.setBounds(88, 108, 51, 27);
		contentPane.add(btnG_1);
		
		JButton btnG_2 = new JButton("G2");
		btnG_2.setBounds(149, 109, 51, 27);
		contentPane.add(btnG_2);
		
		JButton btnG_3 = new JButton("G3");
		btnG_3.setBounds(210, 109, 51, 27);
		contentPane.add(btnG_3);
		
		JButton btnG_4 = new JButton("G4");
		btnG_4.setBounds(271, 109, 51, 27);
		contentPane.add(btnG_4);
		
		JButton btnG_5 = new JButton("G5");
		btnG_5.setBounds(332, 109, 51, 27);
		contentPane.add(btnG_5);
		
		JButton btnG_6 = new JButton("G6");
		btnG_6.setBounds(393, 109, 51, 27);
		contentPane.add(btnG_6);
		
		JButton btnG_7 = new JButton("G7");
		btnG_7.setBounds(454, 109, 51, 27);
		contentPane.add(btnG_7);
		
		JButton btnG_8 = new JButton("G8");
		btnG_8.setBounds(515, 109, 51, 27);
		contentPane.add(btnG_8);
		
		JButton btnG_9 = new JButton("G9");
		btnG_9.setBounds(576, 109, 51, 27);
		contentPane.add(btnG_9);
		
		JButton btnG_10 = new JButton("G10");
		btnG_10.setBounds(637, 109, 51, 27);
		contentPane.add(btnG_10);
		
		JButton btnG_11 = new JButton("G11");
		btnG_11.setBounds(698, 111, 51, 27);
		contentPane.add(btnG_11);
		
		JButton btnF = new JButton("F1");
		btnF.setBounds(88, 146, 51, 27);
		contentPane.add(btnF);
		
		JButton btnF_1 = new JButton("F2");
		btnF_1.setBounds(149, 147, 51, 27);
		contentPane.add(btnF_1);
		
		JButton btnF_2 = new JButton("F3");
		btnF_2.setBounds(210, 147, 51, 27);
		contentPane.add(btnF_2);
		
		JButton btnF_3 = new JButton("F4");
		btnF_3.setBounds(271, 147, 51, 27);
		contentPane.add(btnF_3);
		
		JButton btnF_4 = new JButton("F5");
		btnF_4.setBounds(332, 147, 51, 27);
		contentPane.add(btnF_4);
		
		JButton btnF_5 = new JButton("F6");
		btnF_5.setBounds(393, 147, 51, 27);
		contentPane.add(btnF_5);
		
		JButton btnF_6 = new JButton("F7");
		btnF_6.setBounds(454, 147, 51, 27);
		contentPane.add(btnF_6);
		
		JButton btnF_7 = new JButton("F8");
		btnF_7.setBounds(515, 147, 51, 27);
		contentPane.add(btnF_7);
		
		JButton btnF_8 = new JButton("F9");
		btnF_8.setBounds(576, 147, 51, 27);
		contentPane.add(btnF_8);
		
		JButton btnF_9 = new JButton("F10");
		btnF_9.setBounds(637, 147, 51, 27);
		contentPane.add(btnF_9);
		
		JButton btnE = new JButton("E1");
		btnE.setBounds(88, 184, 51, 27);
		contentPane.add(btnE);
		
		JButton btnE_1 = new JButton("E2");
		btnE_1.setBounds(149, 185, 51, 27);
		contentPane.add(btnE_1);
		
		JButton btnE_2 = new JButton("E3");
		btnE_2.setBounds(210, 185, 51, 27);
		contentPane.add(btnE_2);
		
		JButton btnE_3 = new JButton("E4");
		btnE_3.setBounds(271, 185, 51, 27);
		contentPane.add(btnE_3);
		
		JButton btnE_4 = new JButton("E5");
		btnE_4.setBounds(332, 185, 51, 27);
		contentPane.add(btnE_4);
		
		JButton btnE_5 = new JButton("E6");
		btnE_5.setBounds(393, 185, 51, 27);
		contentPane.add(btnE_5);
		
		JButton btnE_6 = new JButton("E7");
		btnE_6.setBounds(454, 185, 51, 27);
		contentPane.add(btnE_6);
		
		JButton btnE_7 = new JButton("E8");
		btnE_7.setBounds(515, 185, 51, 27);
		contentPane.add(btnE_7);
		
		JButton btnE_8 = new JButton("E9");
		btnE_8.setBounds(576, 185, 51, 27);
		contentPane.add(btnE_8);
		
		JButton btnE_9 = new JButton("E10");
		btnE_9.setBounds(637, 185, 51, 27);
		contentPane.add(btnE_9);
		
		JButton btnD = new JButton("D1");
		btnD.setBounds(88, 222, 45, 23);
		contentPane.add(btnD);
		
		JButton btnD_1 = new JButton("D2");
		btnD_1.setBounds(149, 223, 45, 23);
		contentPane.add(btnD_1);
		
		JButton btnD_2 = new JButton("D3");
		btnD_2.setBounds(210, 223, 45, 23);
		contentPane.add(btnD_2);
		
		JButton btnD_3 = new JButton("D4");
		btnD_3.setBounds(271, 223, 45, 23);
		contentPane.add(btnD_3);
		
		JButton btnD_4 = new JButton("D5");
		btnD_4.setBounds(332, 223, 45, 23);
		contentPane.add(btnD_4);
		
		JButton btnD_5 = new JButton("D6");
		btnD_5.setBounds(393, 223, 45, 23);
		contentPane.add(btnD_5);
		
		JButton btnD_6 = new JButton("D7");
		btnD_6.setBounds(454, 223, 45, 23);
		contentPane.add(btnD_6);
		
		JButton btnD_7 = new JButton("D8");
		btnD_7.setBounds(515, 223, 45, 23);
		contentPane.add(btnD_7);
		
		JButton btnD_8 = new JButton("D9");
		btnD_8.setBounds(576, 223, 45, 23);
		contentPane.add(btnD_8);
		
		JButton btnD_9 = new JButton("D10");
		btnD_9.setBounds(637, 223, 51, 23);
		contentPane.add(btnD_9);
		
		JButton btnC = new JButton("C1");
		btnC.setBounds(88, 256, 51, 27);
		contentPane.add(btnC);
		
		JButton btnC_1 = new JButton("C2");
		btnC_1.setBounds(149, 257, 51, 27);
		contentPane.add(btnC_1);
		
		JButton btnC_2 = new JButton("C3");
		btnC_2.setBounds(210, 257, 51, 27);
		contentPane.add(btnC_2);
		
		JButton btnC_3 = new JButton("C4");
		btnC_3.setBounds(271, 257, 51, 27);
		contentPane.add(btnC_3);
		
		JButton btnC_4 = new JButton("C5");
		btnC_4.setBounds(332, 257, 51, 27);
		contentPane.add(btnC_4);
		
		JButton btnC_5 = new JButton("C6");
		btnC_5.setBounds(393, 257, 51, 27);
		contentPane.add(btnC_5);
		
		JButton btnC_6 = new JButton("C7");
		btnC_6.setBounds(454, 257, 51, 27);
		contentPane.add(btnC_6);
		
		JButton btnC_7 = new JButton("C8");
		btnC_7.setBounds(515, 257, 51, 27);
		contentPane.add(btnC_7);
		
		JButton btnC_8 = new JButton("C9");
		btnC_8.setBounds(576, 257, 51, 27);
		contentPane.add(btnC_8);
		
		JButton btnC_9 = new JButton("C10");
		btnC_9.setBounds(637, 257, 51, 27);
		contentPane.add(btnC_9);
		
		JButton btnB = new JButton("B1");
		btnB.setBounds(88, 294, 51, 27);
		contentPane.add(btnB);
		
		JButton btnB_1 = new JButton("B2");
		btnB_1.setBounds(149, 295, 51, 27);
		contentPane.add(btnB_1);
		
		JButton btnB_2 = new JButton("B3");
		btnB_2.setBounds(210, 295, 51, 27);
		contentPane.add(btnB_2);
		
		JButton btnB_3 = new JButton("B4");
		btnB_3.setBounds(271, 295, 51, 27);
		contentPane.add(btnB_3);
		
		JButton btnB_4 = new JButton("B5");
		btnB_4.setBounds(332, 295, 51, 27);
		contentPane.add(btnB_4);
		
		JButton btnB_5 = new JButton("B6");
		btnB_5.setBounds(393, 295, 51, 27);
		contentPane.add(btnB_5);
		
		JButton btnB_6 = new JButton("B7");
		btnB_6.setBounds(454, 295, 51, 27);
		contentPane.add(btnB_6);
		
		JButton btnB_7 = new JButton("B8");
		btnB_7.setBounds(515, 295, 51, 27);
		contentPane.add(btnB_7);
		
		JButton btnB_8 = new JButton("B9");
		btnB_8.setBounds(576, 295, 51, 27);
		contentPane.add(btnB_8);
		
		JButton btnB_9 = new JButton("B10");
		btnB_9.setBounds(637, 295, 51, 27);
		contentPane.add(btnB_9);
		
		JButton btnA = new JButton("A1");
		btnA.setBounds(88, 332, 51, 27);
		contentPane.add(btnA);
		
		JButton btnA_1 = new JButton("A2");
		btnA_1.setBounds(149, 333, 51, 27);
		contentPane.add(btnA_1);
		
		JButton btnA_2 = new JButton("A3");
		btnA_2.setBounds(210, 333, 51, 27);
		contentPane.add(btnA_2);
		
		JButton btnA_3 = new JButton("A4");
		btnA_3.setBounds(271, 333, 51, 27);
		contentPane.add(btnA_3);
		
		JButton btnA_4 = new JButton("A5");
		btnA_4.setBounds(332, 333, 51, 27);
		contentPane.add(btnA_4);
		
		JButton btnA_5 = new JButton("A6");
		btnA_5.setBounds(393, 333, 51, 27);
		contentPane.add(btnA_5);
		
		JButton btnA_6 = new JButton("A7");
		btnA_6.setBounds(454, 333, 51, 27);
		contentPane.add(btnA_6);
		
		JButton btnA_7 = new JButton("A8");
		btnA_7.setBounds(515, 333, 51, 27);
		contentPane.add(btnA_7);
		
		JButton btnA_8 = new JButton("A9");
		btnA_8.setBounds(576, 333, 51, 27);
		contentPane.add(btnA_8);
		
		JButton btnA_9 = new JButton("A10");
		btnA_9.setBounds(637, 333, 51, 27);
		contentPane.add(btnA_9);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		

			
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.selectionSession.setEnabled(true);
		
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
