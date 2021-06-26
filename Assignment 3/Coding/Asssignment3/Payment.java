package Asssignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField textCardName;
	private JTextField textCardNumber;
	private JTextField textCVV;
	private JTextField textMonth;
	private JTextField textYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setTitle("Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 476, 588);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(10, 20, 456, 39);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PAYMENT SECTION");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_2.setBounds(139, 10, 177, 19);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(10, 84, 456, 110);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Payment.class.getResource("/image/icons8_discover_100px_1.png")));
		lblNewLabel_3.setBounds(297, 10, 100, 60);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Payment.class.getResource("/image/icons8_visa_100px.png")));
		lblNewLabel_3_1.setBounds(166, 10, 100, 60);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(Payment.class.getResource("/image/icons8_mastercard_100px.png")));
		lblNewLabel_3_2.setBounds(35, 10, 100, 60);
		panel_2.add(lblNewLabel_3_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mastercard");
		rdbtnNewRadioButton.setBounds(45, 76, 77, 21);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.setBounds(177, 76, 77, 21);
		panel_2.add(rdbtnVisa);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Discover");
		rdbtnNewRadioButton_1_1.setBounds(307, 76, 77, 21);
		panel_2.add(rdbtnNewRadioButton_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(10, 220, 456, 74);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Name:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 10, 45, 13);
		panel_3.add(lblNewLabel_4);
		
		textCardName = new JTextField();
		textCardName.setFont(new Font("Dialog", Font.PLAIN, 10));
		
		
		textCardName.setBounds(10, 33, 436, 19);
		panel_3.add(textCardName);
		textCardName.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(10, 334, 456, 96);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Card Number:");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(10, 10, 82, 13);
		panel_4.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("CVV Code:");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(226, 11, 82, 13);
		panel_4.add(lblNewLabel_4_2);
		
		textCardNumber = new JTextField();
		textCardNumber.setFont(new Font("Dialog", Font.PLAIN, 10));
		textCardNumber.setBounds(10, 44, 184, 19);
		panel_4.add(textCardNumber);
		textCardNumber.setColumns(10);
		
		textCVV = new JTextField();
		textCVV.setFont(new Font("Dialog", Font.PLAIN, 10));
		textCVV.setColumns(10);
		textCVV.setBounds(226, 44, 184, 19);
		panel_4.add(textCVV);
		
		JLabel lblNewLabel_5 = new JLabel("E.g: 8877657782345552");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setBounds(20, 73, 111, 13);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("E.g: 321");
		lblNewLabel_6.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_6.setBounds(226, 73, 45, 13);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("CARD TYPE");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 69, 79, 13);
		panel.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.DARK_GRAY);
		panel_5.setBounds(10, 463, 456, 84);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4_3 = new JLabel("Month:");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(10, 10, 45, 13);
		panel_5.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Year:");
		lblNewLabel_4_4.setForeground(Color.WHITE);
		lblNewLabel_4_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_4.setBounds(226, 11, 45, 13);
		panel_5.add(lblNewLabel_4_4);
		
		textMonth = new JTextField();
		textMonth.setFont(new Font("Dialog", Font.PLAIN, 10));
		textMonth.setColumns(10);
		textMonth.setBounds(10, 33, 184, 19);
		panel_5.add(textMonth);
		
		textYear = new JTextField();
		textYear.setFont(new Font("Dialog", Font.PLAIN, 10));
		textYear.setColumns(10);
		textYear.setBounds(226, 33, 184, 19);
		panel_5.add(textYear);
		
		JLabel lblNewLabel_5_1 = new JLabel("E.g: 2");
		lblNewLabel_5_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1.setBounds(10, 61, 111, 13);
		panel_5.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("E.g: 2022");
		lblNewLabel_5_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_2.setBounds(226, 61, 111, 13);
		panel_5.add(lblNewLabel_5_2);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String card = textCardNumber.getText();
				
				int cardlength = card.length();
				
				if(cardlength == 16) {
					JOptionPane.showMessageDialog(null, "Payment Successful, Thank you for using our services. We will email you the detail");
					JOptionPane.showMessageDialog(null, "Forwarding to log in page..............");
					Login l = new Login();
					l.setVisible(true);
					l.setLocationRelativeTo(null);
					l.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
					
					dispose();
					
				}
				else if (cardlength < 16) {
					JOptionPane.showMessageDialog(null, "Card number must be 16 digit, check again");
				}
				
				else {
					
				}
			}
		});
		btnNewButton.setBounds(169, 557, 108, 21);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("OWNER");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 204, 79, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNumbers = new JLabel("NUMBERS");
		lblNumbers.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNumbers.setBackground(Color.WHITE);
		lblNumbers.setBounds(10, 321, 79, 13);
		panel.add(lblNumbers);
		
		JLabel lblExpiration = new JLabel("EXPIRATION");
		lblExpiration.setFont(new Font("Dialog", Font.BOLD, 13));
		lblExpiration.setBackground(Color.WHITE);
		lblExpiration.setBounds(10, 450, 79, 13);
		panel.add(lblExpiration);
	}
}
