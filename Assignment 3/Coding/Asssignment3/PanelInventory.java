package Asssignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelInventory extends JPanel {
	
	public static double Order;
	private JTextField SmallUnit;
	private JTextField MediumUnit;
	private JTextField LargeUnit;
	private JTextField txtTotalExpenses;

	/**
	 * Create the panel.
	 */
	public PanelInventory() {

		
		setBounds(0, 0, 890, 521);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(10, 10, 870, 56);
		add(panel);
		
		JLabel lblInventory = new JLabel("INVENTORY");
		lblInventory.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblInventory.setBounds(10, 10, 285, 36);
		panel.add(lblInventory);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 75, 870, 436);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 432, 416);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Small storage price per unit = RM 185");
		lblNewLabel.setBounds(10, 69, 326, 19);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Total order unit:");
		lblNewLabel_1.setBounds(10, 92, 105, 13);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		SmallUnit = new JTextField();
		SmallUnit.setBounds(114, 91, 113, 19);
		panel_2.add(SmallUnit);
		SmallUnit.setColumns(10);
		
		JLabel lblMediumStoragePrice = new JLabel("Medium storage price per unit = RM 207");
		lblMediumStoragePrice.setBounds(10, 128, 326, 19);
		panel_2.add(lblMediumStoragePrice);
		lblMediumStoragePrice.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("Total order unit:");
		lblNewLabel_1_1.setBounds(10, 157, 133, 13);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		MediumUnit = new JTextField();
		MediumUnit.setBounds(114, 156, 113, 19);
		panel_2.add(MediumUnit);
		MediumUnit.setColumns(10);
		
		JLabel lblLargeStoragePrice = new JLabel("Large storage price per unit = RM 270");
		lblLargeStoragePrice.setBounds(10, 192, 326, 27);
		panel_2.add(lblLargeStoragePrice);
		lblLargeStoragePrice.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Total order unit:");
		lblNewLabel_1_1_1.setBounds(10, 222, 105, 13);
		panel_2.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		LargeUnit = new JTextField();
		LargeUnit.setBounds(114, 221, 113, 19);
		panel_2.add(LargeUnit);
		LargeUnit.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(10, 10, 415, 38);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Add Storage:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 10, 187, 18);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total Expenses (RM):");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 322, 192, 19);
		panel_2.add(lblNewLabel_3);
		
		txtTotalExpenses = new JTextField();
		txtTotalExpenses.setFont(new Font("Dialog", Font.BOLD, 18));
		txtTotalExpenses.setBounds(212, 316, 161, 30);
		panel_2.add(txtTotalExpenses);
		txtTotalExpenses.setColumns(10);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Small = 185;
				double Medium = 207;
				double Large =  270;
				
				double su = Double.parseDouble(SmallUnit.getText());
				double mu = Double.parseDouble(MediumUnit.getText());
				double lu = Double.parseDouble(LargeUnit.getText());
				
				double totalSmall = Small*su;
				double totalMedium = Medium*mu;
				double totalLarge = Large*lu;
				
				double order = (totalSmall+totalMedium)+totalLarge;
				
				Order = order;
				
				txtTotalExpenses.setText(Double.toString(order));
				
			}
		});
		btnOrder.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnOrder.setBounds(288, 253, 85, 21);
		panel_2.add(btnOrder);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(452, 10, 408, 416);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(PanelInventory.class.getResource("/image/205120-1600x1200-storageunit.jpg")));
		lblNewLabel_4.setBounds(10, 10, 388, 396);
		panel_4.add(lblNewLabel_4);
		setVisible(true);
	}
}
