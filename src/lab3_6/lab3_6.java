package lab3_6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lab3_6 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Tien;
	private JLabel lblKq;
	private JTextField txt_Kq;
	private JLabel lblDonVi;
	private JComboBox cmb_Donvi;
	private JButton btn_Doi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_6 frame = new lab3_6();
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
	public lab3_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("So tien");
		lblNewLabel.setBounds(28, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_Tien = new JTextField();
		txt_Tien.setBounds(123, 26, 157, 20);
		contentPane.add(txt_Tien);
		txt_Tien.setColumns(10);
		
		lblKq = new JLabel("VND=");
		lblKq.setBounds(28, 144, 46, 14);
		contentPane.add(lblKq);
		
		txt_Kq = new JTextField();
		txt_Kq.setColumns(10);
		txt_Kq.setBounds(123, 141, 157, 20);
		contentPane.add(txt_Kq);
		String [] donvi = {"USD","EURO","JPY"};
		
		lblDonVi = new JLabel("Don Vi");
		lblDonVi.setBounds(28, 84, 46, 14);
		contentPane.add(lblDonVi);
		
		cmb_Donvi = new JComboBox(donvi);
		cmb_Donvi.setBounds(123, 81, 101, 20);
		contentPane.add(cmb_Donvi);
		
		btn_Doi = new JButton("New button");
		btn_Doi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tien = Integer.parseInt(txt_Tien.getText());
				int kq=0;
				if(cmb_Donvi.getSelectedIndex()==0) {
					kq=tien*22800;
				}
				else if(cmb_Donvi.getSelectedIndex()==1) {
					kq=tien*27800;
				}
				else if(cmb_Donvi.getSelectedIndex()==2) {
					kq=tien*200;
				}
				txt_Kq.setText(kq+"");
			}
		});
		btn_Doi.setBounds(234, 81, 46, 23);
		contentPane.add(btn_Doi);
	}

}
