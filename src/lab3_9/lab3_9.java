package lab3_9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class lab3_9 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_r;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3_9 frame = new lab3_9();
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
	public lab3_9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("R=");
		lblNewLabel.setBounds(25, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_r = new JTextField();
		txt_r.setBounds(95, 21, 86, 20);
		contentPane.add(txt_r);
		txt_r.setColumns(10);
		
		JButton btn_Them = new JButton("Them");
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 94, 382, 145);
		contentPane.add(scrollPane);
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("R");
		model.addColumn("Dien Tich");
		table = new JTable(model);
		scrollPane.setViewportView(table);
		btn_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double r= Double.parseDouble(txt_r.getText());
				double DT = r*r*Math.PI;
				Object[] row = {r,DT};
				model.addRow(row);
			}
		});
		btn_Them.setBounds(10, 49, 89, 23);
		contentPane.add(btn_Them);
		
		JButton btn_Xoa = new JButton("Xoa");
		btn_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = table.getSelectedRow();
				if(index>=0 && index < model.getRowCount()) {
					model.removeRow(index);
				}
			}
		});
		btn_Xoa.setBounds(126, 52, 89, 23);
		contentPane.add(btn_Xoa);
	}
}
