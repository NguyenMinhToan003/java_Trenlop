package lab3_7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class lab3_7 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_7 frame = new lab3_7();
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
	public lab3_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		DefaultListModel listModel = new DefaultListModel();
		JLabel lblNewLabel = new JLabel("R");
		lblNewLabel.setBounds(55, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_r = new JTextField();
		txt_r.setBounds(111, 26, 281, 20);
		contentPane.add(txt_r);
		txt_r.setColumns(10);
		
		
		
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 97, 375, 153);
		contentPane.add(scrollPane);
		
		JList list = new JList(listModel);
		scrollPane.setViewportView(list);
		JButton btn_Them = new JButton("Them");
		btn_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double r = Double.parseDouble(txt_r.getText());
				Double CV = r*2*Math.PI;
				Double DT = r*r*Math.PI;
				listModel.addElement(("R="+r+" ; CV="+CV+" : DT="+DT));
				txt_r.setText("");
			}
		});
		btn_Them.setBounds(75, 57, 79, 23);
		contentPane.add(btn_Them);
		JButton btn_Xoa = new JButton("Xoa");
		btn_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				if(index>=0 && index<listModel.getSize())
					listModel.remove(index);				
				
			}
		});
		btn_Xoa.setBounds(170, 57, 71, 23);
		contentPane.add(btn_Xoa);
	}
}
