package lab3_5;

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

public class lab3_5 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_soa;
	private JTextField txt_sob;
	private JTextField txt_kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_5 frame = new lab3_5();
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
	public lab3_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(10, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_soa = new JTextField();
		txt_soa.setBounds(86, 20, 280, 20);
		contentPane.add(txt_soa);
		txt_soa.setColumns(10);
		
		txt_sob = new JTextField();
		txt_sob.setColumns(10);
		txt_sob.setBounds(86, 66, 280, 20);
		contentPane.add(txt_sob);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(10, 69, 46, 14);
		contentPane.add(lblB);
		
		txt_kq = new JTextField();
		txt_kq.setColumns(10);
		txt_kq.setBounds(86, 215, 280, 20);
		contentPane.add(txt_kq);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kq");
		lblNewLabel_1_1.setBounds(10, 218, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		String[] pheptinh = {"+","-","*","/"};
		JComboBox cmb_Pheptinh = new JComboBox(pheptinh);
		cmb_Pheptinh.setBounds(86, 137, 210, 20);
		contentPane.add(cmb_Pheptinh);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phep Tinh ");
		lblNewLabel_1_1_1.setBounds(10, 140, 66, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btn_Kq = new JButton("Kq");
		btn_Kq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soa= Integer.parseInt(txt_soa.getText());
				int sob = Integer.parseInt(txt_sob.getText());
				int kq=0;
				if(cmb_Pheptinh.getSelectedIndex()==0) {
					kq=soa+sob;
				}
				else if(cmb_Pheptinh.getSelectedIndex()==1) {
					kq=soa-sob;
				}
				else if(cmb_Pheptinh.getSelectedIndex()==2) {
					kq=soa*sob;
				}
				else if(cmb_Pheptinh.getSelectedIndex()==3) {
					kq=soa/sob;
				}
				txt_kq.setText(kq+"");
			}
			
		});
		btn_Kq.setBounds(301, 136, 66, 23);
		contentPane.add(btn_Kq);
	}
}
