package lab3_2;

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

public class lab3_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_SoTien;
	private JTextField txt_Kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_2 frame = new lab3_2();
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
	public lab3_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("So tien :");
		lblNewLabel.setBounds(49, 62, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_SoTien = new JTextField();
		txt_SoTien.setBounds(112, 59, 214, 20);
		contentPane.add(txt_SoTien);
		txt_SoTien.setColumns(10);
		
		JButton btn_Euro = new JButton("EURO");
		btn_Euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tien =Integer.parseInt(txt_SoTien.getText());
				int kq=tien*27800;
				txt_Kq.setText(kq+"");
			}
		});
		btn_Euro.setBounds(149, 116, 89, 23);
		contentPane.add(btn_Euro);
		
		JButton btn_Usd = new JButton("USD");
		btn_Usd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tien =Integer.parseInt(txt_SoTien.getText());
				int kq=tien*22800;
				txt_Kq.setText(kq+"");
			}
		});
		btn_Usd.setBounds(39, 116, 89, 23);
		contentPane.add(btn_Usd);
		
		JButton btn_Jpy = new JButton("JPY");
		btn_Jpy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tien =Integer.parseInt(txt_SoTien.getText());
				int kq=tien*200;
				txt_Kq.setText(kq+"");
			}
		});
		btn_Jpy.setBounds(267, 116, 89, 23);
		contentPane.add(btn_Jpy);
		
		JLabel lblNewLabel_1 = new JLabel("VND =");
		lblNewLabel_1.setBounds(49, 182, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_Kq = new JTextField();
		txt_Kq.setBounds(112, 179, 214, 20);
		contentPane.add(txt_Kq);
		txt_Kq.setColumns(10);
	}

}
