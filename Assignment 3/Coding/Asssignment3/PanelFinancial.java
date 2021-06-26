package Asssignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class PanelFinancial extends JPanel{
	
	public static double Profit;
	private JTextField textRevenue;
	private JTextField textExpenses;
	private JTextField textSalary;
	private JTextField textProfit;
	

	/**
	 * Create the panel.
	 */
	public PanelFinancial() {

		
		setBounds(0, 0, 890, 521);
		setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(10, 10, 870, 56);
		add(panel);
		
		JLabel lblFinancial = new JLabel("COMPANY FINANCIAL");
		lblFinancial.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblFinancial.setBounds(10, 10, 285, 36);
		panel.add(lblFinancial);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 73, 870, 438);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(538, 10, 322, 418);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane Receipt = new JTextPane();
		Receipt.setFont(new Font("Dialog", Font.BOLD, 15));
		Receipt.setBounds(10, 10, 302, 367);
		panel_2.add(Receipt);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					Receipt.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnPrint.setBounds(210, 382, 89, 26);
		panel_2.add(btnPrint);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 10, 520, 418);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblRevenue = new JLabel("Total Revenue(RM):");
		lblRevenue.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblRevenue.setBounds(10, 21, 142, 13);
		panel_3.add(lblRevenue);
		
		textRevenue = new JTextField();
		textRevenue.setFont(new Font("Dialog", Font.PLAIN, 15));
		textRevenue.setBounds(180, 20, 244, 19);
		panel_3.add(textRevenue);
		textRevenue.setColumns(10);
		
		JLabel lblExpenses = new JLabel("Total Expenses(RM):");
		lblExpenses.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblExpenses.setBounds(10, 80, 142, 13);
		panel_3.add(lblExpenses);
		
		textExpenses = new JTextField();
		textExpenses.setFont(new Font("Dialog", Font.PLAIN, 15));
		textExpenses.setBounds(180, 79, 244, 19);
		panel_3.add(textExpenses);
		textExpenses.setColumns(10);
		
		JLabel lblSalary = new JLabel("Employee Salary(RM):");
		lblSalary.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblSalary.setBounds(10, 136, 160, 13);
		panel_3.add(lblSalary);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		
		
		textSalary.setBounds(180, 135, 244, 19);
		panel_3.add(textSalary);
		textSalary.setColumns(10);
		
		JLabel lblProfit = new JLabel("Total Profit(RM):");
		lblProfit.setFont(new Font("Dialog", Font.BOLD, 18));
		lblProfit.setBounds(10, 202, 160, 26);
		panel_3.add(lblProfit);
		
		textProfit = new JTextField();
		textProfit.setFont(new Font("Dialog", Font.BOLD, 18));
		textProfit.setBounds(180, 195, 244, 33);
		panel_3.add(textProfit);
		textProfit.setColumns(10);
		
		JButton btnGSalary = new JButton("+");
		btnGSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textSalary.setText(Double.toString(PanelEmployee.totalS));
				
			}
		});
		btnGSalary.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGSalary.setBounds(442, 134, 57, 21);
		panel_3.add(btnGSalary);
		
		JButton btnGRevenue = new JButton("+");
		btnGRevenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textRevenue.setText(Double.toString(Customers.totalPrice));
				
			}
		});
		btnGRevenue.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGRevenue.setBounds(442, 19, 57, 21);
		panel_3.add(btnGRevenue);
		
		JButton btnNewButton = new JButton("PROFIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double revenue = Customers.totalPrice;
				double expenses = Double.parseDouble(textExpenses.getText());
				double salary = PanelEmployee.totalS;
				
				
				double profit = (expenses-salary)-revenue;
				
				Profit = profit;
				
				
				textProfit.setText(Double.toString(profit));
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnNewButton.setBounds(44, 309, 143, 44);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textRevenue.setText("");
				textExpenses.setText("");
				textSalary.setText("");
				textProfit.setText("");
				Receipt.setText("");
				
				
			}
		});
		btnReset.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnReset.setBounds(197, 309, 143, 44);
		panel_3.add(btnReset);
		
		JButton btnReceipt = new JButton("RECEIPT");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Receipt.setText("  **************************************************\n");
				Receipt.setText(Receipt.getText()  + "  *              FINANCIAL RECEIPT              *\n");
				Receipt.setText(Receipt.getText()  + "  **************************************************\n\n\n");
				
				
				Receipt.setText(Receipt.getText() + "Total Revenue \t:RM" + Double.toString(Customers.totalPrice)+"\n\n");
				Receipt.setText(Receipt.getText() + "Total Expenses \t:RM" +  textExpenses.getText() + "\n\n");
				Receipt.setText(Receipt.getText() + "Employee Salary \t:RM" + Double.toString(PanelEmployee.totalS) + "\n\n");
				Receipt.setText(Receipt.getText() + "Total profit \t:RM" + Profit + "\n\n");
				Receipt.setText(Receipt.getText() + "\n\t\t               -Signature-");
				Receipt.setText(Receipt.getText() + "\n\t\t                 Manager");
			}
		});
		btnReceipt.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnReceipt.setBounds(350, 309, 143, 44);
		panel_3.add(btnReceipt);
		
		JButton btnGExpenses = new JButton("+");
		btnGExpenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textExpenses.setText(Double.toString(PanelInventory.Order));
			}
		});
		btnGExpenses.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGExpenses.setBounds(442, 78, 57, 21);
		panel_3.add(btnGExpenses);
		setVisible(true);
		
		
	}	
}
