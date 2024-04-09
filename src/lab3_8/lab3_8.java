package lab3_8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lab3_8 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Dai;
	private JTextField txt_Rong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_8 frame = new lab3_8();
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
	public lab3_8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dai");
		lblNewLabel.setBounds(30, 29, 46, 14);
		contentPane.add(lblNewLabel);
		DefaultListModel model = new DefaultListModel();
		txt_Dai = new JTextField();
		txt_Dai.setBounds(107, 26, 86, 20);
		contentPane.add(txt_Dai);
		txt_Dai.setColumns(10);
		
		txt_Rong = new JTextField();
		txt_Rong.setColumns(10);
		txt_Rong.setBounds(107, 57, 86, 20);
		contentPane.add(txt_Rong);
		
		JLabel lblRong = new JLabel("Rong");
		lblRong.setBounds(30, 60, 46, 14);
		contentPane.add(lblRong);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 145, 369, 105);
		contentPane.add(scrollPane);
		
		JList list = new JList(model);
		scrollPane.setViewportView(list);
		
		JButton btn_Them = new JButton("Them");
		btn_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dai = Double.parseDouble(txt_Dai.getText());
				double rong =Double.parseDouble(txt_Rong.getText());
				double CV= dai*2+rong*2;
				double DT =dai * rong;
				model.addElement("Dai= " +dai+" Rong= "+ rong + " CV= "+ CV + " DT=" +DT);
			}
			
			
		});
		btn_Them.setBounds(22, 88, 89, 23);
		contentPane.add(btn_Them);
		
		JButton btn_Xoa = new JButton("Xoa");
		btn_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				if(index >=0 && index< model.getSize()) {
					model.remove(index);
				}
			}
		});
		btn_Xoa.setBounds(117, 88, 89, 23);
		contentPane.add(btn_Xoa);
		
	}

}
