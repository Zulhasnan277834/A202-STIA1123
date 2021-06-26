package Asssignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class PanelEmployee extends JPanel {
	
	public static double totalS;
	
	private JTable table;
	private JTextField EmployeeIDF;
	private JTextField NameF;
	private JTextField ContactF;
	private JTextField EmailF;
	private JTextField SalaryF;
	public static JTextField SalaryText;
	
	
	

	/**
	 * Create the panel.
	 */
	public PanelEmployee() {

		
		setBounds(0, 0, 890, 521);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(10, 10, 870, 56);
		add(panel);
		
		JLabel lblEmployeeInformation = new JLabel("EMPLOYEE INFORMATION");
		lblEmployeeInformation.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblEmployeeInformation.setBounds(10, 10, 285, 36);
		panel.add(lblEmployeeInformation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 76, 870, 435);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(138, 10, 722, 415);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 702, 293);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Dialog", Font.PLAIN, 10));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"KM0001", "KASIM", "MALE", "0121123345", "MANAGER", "4500"},
				{"KM0002", "SITI SURYATI", "FEMALE", "0134433321", "ADS MANAGER", "3500"},
				{"KM0003", "ADNAN", "MALE", "0116677745", "STAFF", "2400"},
				{"KM0004", "BADRUL", "MALE", "0123334442", "STAFF", "2400"},
				{"KM0005", "LEE THONG MAN", "MALE", "0145567776", "STAFF", "2400"},
			},
			new String[] {
				"Employee ID", "Name", "Gender", "Contact", "Position", "Salary(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton ButtonUpload = new JButton("UPLOAD");
		ButtonUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\JullBZ00\\Documents\\UUM\\SEM 2\\STIA1123 KUMP C PROGRAMMING 2\\Assignment 3\\Employee Information.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		ButtonUpload.setBounds(623, 384, 89, 21);
		panel_2.add(ButtonUpload);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.controlShadow);
		panel_4.setBounds(10, 313, 702, 61);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		SalaryText = new JTextField();
		SalaryText.setFont(new Font("Dialog", Font.PLAIN, 20));
		SalaryText.setBounds(533, 10, 146, 41);
		panel_4.add(SalaryText);
		SalaryText.setColumns(10);
		
		JButton SalaryButton = new JButton("GENERATE SALARY");
		SalaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int salary = table.getRowCount();
				
				double total = 0;
				
				for (int i = 0; i < salary; i++) {
					double value = Double.valueOf(table.getValueAt(i,5).toString());
					total += value;
					
					totalS = total;
				
				}
				
				SalaryText.setText(Double.toString(total));
				JOptionPane.showMessageDialog(null, "Completed");
				
			}
		});
		SalaryButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		SalaryButton.setBounds(35, 10, 202, 41);
		panel_4.add(SalaryButton);
		
		JLabel lblNewLabel_2 = new JLabel("Total Salary(RM):");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(363, 12, 176, 41);
		panel_4.add(lblNewLabel_2);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 10, 118, 415);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setBounds(10, 10, 96, 13);
		panel_3.add(lblNewLabel);
		
		EmployeeIDF = new JTextField();
		EmployeeIDF.setBounds(10, 33, 96, 19);
		panel_3.add(EmployeeIDF);
		EmployeeIDF.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 62, 96, 13);
		panel_3.add(lblName);
		
		NameF = new JTextField();
		NameF.setColumns(10);
		NameF.setBounds(10, 83, 96, 19);
		panel_3.add(NameF);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contact:");
		lblNewLabel_1_1_1.setBounds(10, 166, 96, 13);
		panel_3.add(lblNewLabel_1_1_1);
		
		ContactF = new JTextField();
		ContactF.setColumns(10);
		ContactF.setBounds(10, 189, 96, 19);
		panel_3.add(ContactF);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Position:");
		lblNewLabel_1_1_1_1.setBounds(10, 218, 96, 13);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		EmailF = new JTextField();
		EmailF.setColumns(10);
		EmailF.setBounds(10, 241, 96, 19);
		panel_3.add(EmailF);
		
		JComboBox GenderBox = new JComboBox();
		GenderBox.setModel(new DefaultComboBoxModel(new String[] {"Select gender:", "MALE", "FEMALE"}));
		GenderBox.setBounds(10, 135, 96, 21);
		panel_3.add(GenderBox);
		setVisible(true);
		
		JButton ButtonUpdate = new JButton("UPDATE");
		ButtonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						EmployeeIDF.getText(),
						NameF.getText(),
						GenderBox.getSelectedItem(),
						ContactF.getText(),
						EmailF.getText(),
						SalaryF.getText(),
				});
				JOptionPane.showMessageDialog(null, "Employee Status Updated");
				}
			}
		);
				
		ButtonUpdate.setBounds(10, 322, 89, 21);
		panel_3.add(ButtonUpdate);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Salary:");
		lblNewLabel_1_1_1_1_1.setBounds(10, 270, 96, 13);
		panel_3.add(lblNewLabel_1_1_1_1_1);
		
		SalaryF = new JTextField();
		SalaryF.setColumns(10);
		SalaryF.setBounds(10, 293, 96, 19);
		panel_3.add(SalaryF);
		
		JButton ButtonReset = new JButton("RESET");
		ButtonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				EmployeeIDF.setText("");
				NameF.setText("");
				GenderBox.setSelectedItem("");
				ContactF.setText("");
				EmailF.setText("");
				SalaryF.setText("");
				
			}
		});
		
		ButtonReset.setBounds(10, 353, 89, 21);
		panel_3.add(ButtonReset);
		
		JButton ButtonDelete = new JButton("DELETE");
		ButtonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Delete Completed");
				}
				
			}
		});
		ButtonDelete.setBounds(10, 384, 89, 21);
		panel_3.add(ButtonDelete);
		
		JLabel lblNewLabel_1 = new JLabel("Gender:");
		lblNewLabel_1.setBounds(10, 112, 45, 13);
		panel_3.add(lblNewLabel_1);
		
		
	}

}

