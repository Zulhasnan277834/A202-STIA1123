package Asssignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Customers extends JFrame {

	
	public static double totalPrice;
	
	private JPanel contentPane;
	private JTextField textRental;
	private JTextField textTotalPrice;
	private JTable table;
	private JTextField textCustID;
	private JTextField textCustName;
	private String Small,Medium,Large;
	private JTextField textGenerate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customers frame = new Customers();
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
	public Customers() {
		setTitle("Ordering Section");
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1014, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(Color.GRAY);
		MainPanel.setBounds(0, 10, 1011, 677);
		contentPane.add(MainPanel);
		MainPanel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 72, 476, 585);
		MainPanel.add(tabbedPane);
		
		JPanel Small = new JPanel();
		Small.setBackground(Color.DARK_GRAY);
		Small.setFont(new Font("Dialog", Font.PLAIN, 10));
		Small.setToolTipText("");
		tabbedPane.addTab("Small", null, Small, null);
		Small.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Customers.class.getResource("/image/ExtraSpace_02-5x10UnitSize.gif")));
		lblNewLabel.setBounds(10, 10, 451, 365);
		Small.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 385, 451, 163);
		Small.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnsmallStorage = new JTextPane();
		txtpnsmallStorage.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		txtpnsmallStorage.setBackground(Color.LIGHT_GRAY);
		txtpnsmallStorage.setText("                        -Small Storage-\r\n1. 5 x 10 (foot) storage unit can hold about a dorm room worth of items\r\n2. Price per month = $ RM 374 $\r\n3. Size: 5 x 10 (foot)\r\n4. Material: Block and Steel\r\n5. Insurent guaranteed");
		txtpnsmallStorage.setBounds(10, 10, 431, 143);
		panel.add(txtpnsmallStorage);
		
		JPanel Medium = new JPanel();
		Medium.setBackground(Color.DARK_GRAY);
		Medium.setFont(new Font("Dialog", Font.PLAIN, 10));
		tabbedPane.addTab("Medium", null, Medium, null);
		Medium.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Customers.class.getResource("/image/ExtraSpace_04-10x10UnitSize.gif")));
		lblNewLabel_1.setBounds(10, 10, 451, 365);
		Medium.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(10, 385, 451, 163);
		Medium.add(panel_4);
		panel_4.setLayout(null);
		
		JTextPane txtpnmediumStorage = new JTextPane();
		txtpnmediumStorage.setText("                        -Medium Storage-\r\n1. 10 x 10 (foot)  storage unit can hold about a 1-2 bedroom apartment worth of items\r\n2. Price per month = $ RM 664 $\r\n3. Size: 10 x 10 (foot)\r\n4. Material: Block and Steel\r\n5. Insurent guaranteed");
		txtpnmediumStorage.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		txtpnmediumStorage.setBackground(Color.LIGHT_GRAY);
		txtpnmediumStorage.setBounds(10, 10, 431, 143);
		panel_4.add(txtpnmediumStorage);
		
		JPanel Large = new JPanel();
		Large.setBackground(Color.DARK_GRAY);
		Large.setFont(new Font("Dialog", Font.PLAIN, 10));
		tabbedPane.addTab("Large", null, Large, null);
		Large.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Customers.class.getResource("/image/ExtraSpace_05-10x15UnitSize.gif")));
		lblNewLabel_1_1.setBounds(10, 10, 451, 365);
		Large.add(lblNewLabel_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(10, 385, 451, 163);
		Large.add(panel_5);
		panel_5.setLayout(null);
		
		JTextPane txtpnlargeStorage = new JTextPane();
		txtpnlargeStorage.setText("                        -Large Storage-\r\n1. 10 x 15 (foot) storage unit can hold about a 2-3 bedroom worth of items\r\n2. Price per month = $ RM 1205 $\r\n3. Size: 10 x 15 (foot)\r\n4. Material: Concrete and Steel\r\n5. Insurent guaranteed");
		txtpnlargeStorage.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		txtpnlargeStorage.setBackground(Color.LIGHT_GRAY);
		txtpnlargeStorage.setBounds(10, 10, 431, 143);
		panel_5.add(txtpnlargeStorage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(10, 10, 979, 51);
		MainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Welcome,");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_6.setBounds(65, 10, 126, 32);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblWUsername = new JLabel("");
		lblWUsername.setForeground(Color.WHITE);
		
		lblWUsername.setText(Register.username);
		
		lblWUsername.setFont(new Font("Dialog", Font.BOLD, 25));
		lblWUsername.setBounds(192, 10, 173, 32);
		panel_1.add(lblWUsername);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Customers.class.getResource("/image/icons8_user_30px.png")));
		lblNewLabel_8.setBounds(10, 10, 45, 32);
		panel_1.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(496, 88, 493, 240);
		MainPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Choose storage size:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 66, 147, 13);
		panel_2.add(lblNewLabel_2);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium(10x10)");
		
		rdbtnMedium.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnMedium.setBounds(143, 85, 130, 21);
		panel_2.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large(10x15)");
		rdbtnLarge.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnLarge.setBounds(275, 85, 103, 21);
		panel_2.add(rdbtnLarge);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small(5x10)");
		
		rdbtnSmall.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnSmall.setBounds(25, 85, 103, 21);
		panel_2.add(rdbtnSmall);
		
		
		//RadioButton Action Event
		rdbtnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnSmall.isSelected()){
					rdbtnMedium.setSelected(false);
					rdbtnLarge.setSelected(false);
				}
			}
		});
		
		
		rdbtnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnMedium.isSelected()){
					rdbtnSmall.setSelected(false);
					rdbtnLarge.setSelected(false);
				}
			}
		});
		
		rdbtnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnLarge.isSelected()){
					rdbtnSmall.setSelected(false);
					rdbtnMedium.setSelected(false);
				}
			}
		});
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Rental duration(month):");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 130, 158, 13);
		panel_2.add(lblNewLabel_3);
		
		textRental = new JTextField();
		textRental.setBounds(178, 129, 20, 19);
		panel_2.add(textRental);
		textRental.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("$Total Price$ (RM):");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(178, 189, 147, 21);
		panel_2.add(lblNewLabel_4);
		
		textTotalPrice = new JTextField();
		textTotalPrice.setFont(new Font("Dialog", Font.PLAIN, 17));
		textTotalPrice.setBounds(343, 190, 118, 19);
		panel_2.add(textTotalPrice);
		textTotalPrice.setColumns(10);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCustID.setText("");
				textCustName.setText("");
				textRental.setText("");
				textTotalPrice.setText("");
				
			}
		});
		btnReset.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnReset.setBounds(130, 158, 97, 21);
		panel_2.add(btnReset);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double total = 0;
				double small = 374;
				double medium = 664;
				double large = 1205;
				
				double rent = Double.parseDouble(textRental.getText());
				
				if (rdbtnSmall.isSelected()) {
					
					total = small*rent;
				}
				else if(rdbtnMedium.isSelected()) {
					
					total = medium*rent;
				}
				else if (rdbtnLarge.isSelected()) {
					
					total = large*rent;
				}
				
				textTotalPrice.setText(Double.toString(total));
				
			}
		});
		btnCalculate.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnCalculate.setBounds(237, 158, 117, 21);
		panel_2.add(btnCalculate);
		
		JLabel lblNewLabel_5 = new JLabel("Order ID:");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 10, 75, 13);
		panel_2.add(lblNewLabel_5);
		
		textCustID = new JTextField();
		textCustID.setBounds(107, 7, 271, 16);
		panel_2.add(textCustID);
		textCustID.setColumns(10);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String size = " ";
				
				if(rdbtnSmall.isSelected()) {
			    size =  rdbtnSmall.getText();
					
				}
				else if (rdbtnMedium.isSelected()) {
				size = rdbtnMedium.getText();

				}
				else if (rdbtnLarge.isSelected()) {
				size = rdbtnLarge.getText();
				
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textCustID.getText(),
						textCustName.getText(),
						size,
						textRental.getText(),
						textTotalPrice.getText(),
						
												
				});
				
			}
		});
		btnOrder.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnOrder.setBounds(364, 159, 97, 21);
		panel_2.add(btnOrder);
		
		JLabel lblNewLabel_5_1 = new JLabel("Name:");
		lblNewLabel_5_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(10, 38, 75, 13);
		panel_2.add(lblNewLabel_5_1);
		
		textCustName = new JTextField();
		textCustName.setColumns(10);
		textCustName.setBounds(107, 38, 271, 16);
		panel_2.add(textCustName);
		
		JButton btnReset_1 = new JButton("CANCEL");
		btnReset_1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No order to cancel",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to cancel",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Order Canceled");
				}
				
			}
		});
		
		btnReset_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnReset_1.setBounds(25, 159, 97, 21);
		panel_2.add(btnReset_1);
		
		JLabel lblNewLabel_7 = new JLabel("E.g (SR0122233321)");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 8));
		lblNewLabel_7.setBounds(382, 10, 94, 13);
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(496, 338, 493, 319);
		MainPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 473, 212);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Order ID:", "Name:", "Storage size:", "Rental duration:", "Total price:"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnPayment = new JButton("PAYMENT");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Proceed to payment");
				Payment p = new Payment();
				p.setVisible(true);
				p.setLocationRelativeTo(null);
				p.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnPayment.setBounds(386, 288, 97, 21);
		panel_3.add(btnPayment);
		btnPayment.setFont(new Font("Dialog", Font.PLAIN, 11));
		
		JButton btnPrint = new JButton("PRINT");
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) { //change e with other variable
					try {
						table.print();
					} catch (java.awt.print.PrinterException e) {
						System.err.format("No printer found", e.getMessage());
					}
				}
			});
		btnPrint.setBounds(279, 288, 97, 21);
		panel_3.add(btnPrint);
		btnPrint.setFont(new Font("Dialog", Font.PLAIN, 11));
		
		textGenerate = new JTextField();
		textGenerate.setFont(new Font("Dialog", Font.PLAIN, 17));
		textGenerate.setColumns(10);
		textGenerate.setBounds(365, 232, 118, 19);
		panel_3.add(textGenerate);
		
		JButton btnGenerate = new JButton("GENERATE");
		btnGenerate.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
				
               int totalP = table.getRowCount();
				
				double total = 0;
				
				for (int i = 0; i < totalP; i++) {
					double value = Double.valueOf(table.getValueAt(i,4).toString());
					total += value;
					
					totalPrice = total;
				
				}
				textGenerate.setText(Double.toString(total));
				JOptionPane.showMessageDialog(null, "Completed");
			}
		});
		
		btnGenerate.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnGenerate.setBounds(252, 232, 97, 21);
		panel_3.add(btnGenerate);
		
		JButton btnSignout = new JButton("SIGN OUT");
		btnSignout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                   if(JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?") == 0 ) {
					
					Login l = new Login();
					l.setVisible(true);
					Customers.this.dispose();
				}
				
				
			}
		});
		btnSignout.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnSignout.setBounds(64, 288, 97, 21);
		panel_3.add(btnSignout);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\JullBZ00\\Documents\\UUM\\SEM 2\\STIA1123 KUMP C PROGRAMMING 2\\Assignment 3\\Customers Order.txt");
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
		btnUpload.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnUpload.setBounds(171, 288, 97, 21);
		panel_3.add(btnUpload);
	}
}
