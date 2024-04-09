package lab3_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.jface.preference.RadioGroupFieldEditor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lab3_3 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Soa;
	private JTextField txt_Sob;
	private JTextField txt_Kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_3 frame = new lab3_3();
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
	public lab3_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(23, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_Soa = new JTextField();
		txt_Soa.setBounds(79, 27, 310, 20);
		contentPane.add(txt_Soa);
		txt_Soa.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("B");
		lblNewLabel_1.setBounds(23, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_Sob = new JTextField();
		txt_Sob.setColumns(10);
		txt_Sob.setBounds(79, 58, 310, 20);
		contentPane.add(txt_Sob);
		
		JLabel lblNewLabel_2 = new JLabel("Kq");
		lblNewLabel_2.setBounds(23, 208, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txt_Kq = new JTextField();
		txt_Kq.setColumns(10);
		txt_Kq.setBounds(79, 205, 310, 20);
		contentPane.add(txt_Kq);
		
		JRadioButton rdo_Cong = new JRadioButton("+");
		rdo_Cong.setBounds(23, 117, 51, 23);
		contentPane.add(rdo_Cong);
		
		JRadioButton rdo_Tru = new JRadioButton("-");
		rdo_Tru.setBounds(85, 117, 51, 23);
		contentPane.add(rdo_Tru);
		
		JRadioButton rdo_Nhan = new JRadioButton("*");
		rdo_Nhan.setBounds(138, 117, 51, 23);
		contentPane.add(rdo_Nhan);
		
		
		JRadioButton rdo_Chia = new JRadioButton("/");
		rdo_Chia.setBounds(214, 117, 51, 23);
		contentPane.add(rdo_Chia);
		ButtonGroup group = new ButtonGroup();
		group.add(rdo_Cong);
		group.add(rdo_Tru);
		group.add(rdo_Nhan);
		group.add(rdo_Chia);
		JButton btn_Kq = new JButton("Ket Qua");
		btn_Kq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int soa = Integer.parseInt(txt_Soa.getText());
				int sob = Integer.parseInt(txt_Sob.getText());
				int kq=0;
				if(rdo_Cong.isSelected()==true) {
					kq=soa+sob;
				}
				else if(rdo_Tru.isSelected()==true) {
					kq=soa-sob;
				}
				else if(rdo_Nhan.isSelected()==true) {
					kq=soa*sob;
				}
				else if(rdo_Chia.isSelected()==true) {
					kq=soa/sob;
				}
				txt_Kq.setText(kq+"");
					
			}
		});
		btn_Kq.setBounds(283, 117, 89, 23);
		contentPane.add(btn_Kq);
	}
}
