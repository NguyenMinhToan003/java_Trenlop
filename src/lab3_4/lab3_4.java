package lab3_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lab3_4 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Tien;
	private JTextField txt_Kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_4 frame = new lab3_4();
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
	public lab3_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tien");
		lblNewLabel.setBounds(44, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_Tien = new JTextField();
		txt_Tien.setBounds(116, 37, 201, 20);
		contentPane.add(txt_Tien);
		txt_Tien.setColumns(10);
		
		JRadioButton rdo_Usd = new JRadioButton("USD");
		rdo_Usd.setBounds(44, 84, 59, 23);
		contentPane.add(rdo_Usd);
		
		JRadioButton rdo_Euro = new JRadioButton("EURO");
		rdo_Euro.setBounds(116, 84, 59, 23);
		contentPane.add(rdo_Euro);
		
		JRadioButton rdo_Jpy = new JRadioButton("JPY");
		rdo_Jpy.setBounds(177, 84, 64, 23);
		contentPane.add(rdo_Jpy);
		ButtonGroup group = new ButtonGroup();
		group.add(rdo_Euro);
		group.add(rdo_Jpy);
		group.add(rdo_Usd);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tien = Integer.parseInt(txt_Tien.getText());
				int kq=0;
				
				if(rdo_Usd.isSelected()==true) {
					kq=tien*22800;
				}
				else if(rdo_Jpy.isSelected()==true) {
					kq=tien*200;
				}
				else if(rdo_Euro.isSelected()==true) {
					kq=tien*27800;
				}
				txt_Kq.setText(kq+"");
			}
		});
		btnNewButton.setBounds(247, 84, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblKq = new JLabel("Kq");
		lblKq.setBounds(44, 184, 46, 14);
		contentPane.add(lblKq);
		
		txt_Kq = new JTextField();
		txt_Kq.setColumns(10);
		txt_Kq.setBounds(116, 181, 201, 20);
		contentPane.add(txt_Kq);
	}

}
