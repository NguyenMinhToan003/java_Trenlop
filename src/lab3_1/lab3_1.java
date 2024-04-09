package lab3_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lab3_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Soa;
	private JTextField txt_Sob;
	private JLabel lblSoB;
	private JTextField txt_Kq;
	private JLabel lblKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_1 frame = new lab3_1();
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
	public lab3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("so a");
		lblNewLabel.setBounds(47, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_Soa = new JTextField();
		txt_Soa.setBounds(103, 31, 154, 20);
		contentPane.add(txt_Soa);
		txt_Soa.setColumns(10);
		
		txt_Sob = new JTextField();
		txt_Sob.setColumns(10);
		txt_Sob.setBounds(103, 85, 154, 20);
		contentPane.add(txt_Sob);
		
		lblSoB = new JLabel("so b");
		lblSoB.setBounds(47, 88, 46, 14);
		contentPane.add(lblSoB);
		
		txt_Kq = new JTextField();
		txt_Kq.setColumns(10);
		txt_Kq.setBounds(103, 144, 154, 20);
		contentPane.add(txt_Kq);
		
		lblKetQua = new JLabel("Ket qua ");
		lblKetQua.setBounds(47, 147, 46, 14);
		contentPane.add(lblKetQua);
		
		JButton btn_Cong = new JButton("+");
		btn_Cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soa = Integer.parseInt(txt_Soa.getText());
				int sob =  Integer.parseInt(txt_Sob.getText());
				int kq=soa+sob;
				txt_Kq.setText(kq+"");
			}
		});
		btn_Cong.setBounds(42, 194, 89, 23);
		contentPane.add(btn_Cong);
	}
}
