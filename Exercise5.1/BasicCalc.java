package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

public class BasicCalc {

	private JFrame frame;
	private JTextField txtFirstNumber;
	private JTextField txtSecondNumber;
	private JTextField textAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicCalc window = new BasicCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BasicCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 676, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFirstNumber = new JTextField();
		txtFirstNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtFirstNumber.setBounds(43, 36, 259, 59);
		frame.getContentPane().add(txtFirstNumber);
		txtFirstNumber.setColumns(10);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtSecondNumber.setBounds(340, 36, 259, 59);
		frame.getContentPane().add(txtSecondNumber);
		txtSecondNumber.setColumns(10);
		
		JButton btnNewButtonPlus = new JButton("+");
		btnNewButtonPlus.setBackground(Color.YELLOW);
		btnNewButtonPlus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnNewButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1=Double.parseDouble(txtFirstNumber.getText());
					num2=Double.parseDouble(txtSecondNumber.getText());
					
					double ans=num1+num2;
					textAnswer.setText(Double.toString(ans));
				
				}
				catch (Exception e1){
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnNewButtonPlus.setBounds(43, 145, 107, 85);
		frame.getContentPane().add(btnNewButtonPlus);
		
		JButton btnNewButtonMinus = new JButton("-");
		btnNewButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1=Double.parseDouble(txtFirstNumber.getText());
					num2=Double.parseDouble(txtSecondNumber.getText());
					
					double ans=num1-num2;
					textAnswer.setText(Double.toString(ans));
				
				}
				catch (Exception e1){
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnNewButtonMinus.setBackground(Color.GREEN);
		btnNewButtonMinus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnNewButtonMinus.setBounds(195, 145, 107, 85);
		frame.getContentPane().add(btnNewButtonMinus);
		
		JButton btnNewButtonMul = new JButton("x");
		btnNewButtonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1=Double.parseDouble(txtFirstNumber.getText());
					num2=Double.parseDouble(txtSecondNumber.getText());
					
					double ans=num1*num2;
					textAnswer.setText(Double.toString(ans));
				
				}
				catch (Exception e1){
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnNewButtonMul.setBackground(Color.BLUE);
		btnNewButtonMul.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnNewButtonMul.setBounds(340, 145, 107, 85);
		frame.getContentPane().add(btnNewButtonMul);
		
		JButton btnNewButtonDiv = new JButton("\u00F7");
		btnNewButtonDiv.setBackground(Color.CYAN);
		btnNewButtonDiv.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnNewButtonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1=Double.parseDouble(txtFirstNumber.getText());
					num2=Double.parseDouble(txtSecondNumber.getText());
					
					double ans=num1/num2;
					textAnswer.setText(Double.toString(ans));
				
				}
				catch (Exception e1){
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnNewButtonDiv.setBounds(492, 145, 107, 85);
		frame.getContentPane().add(btnNewButtonDiv);
		
		JLabel lblNewLabel = new JLabel("ANSWER:");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(27, 280, 120, 52);
		frame.getContentPane().add(lblNewLabel);
		
		textAnswer = new JTextField();
		textAnswer.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textAnswer.setBounds(151, 280, 259, 52);
		frame.getContentPane().add(textAnswer);
		textAnswer.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" 1st num");
		lblNewLabel_1.setBounds(140, 105, 61, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2nd num");
		lblNewLabel_2.setBounds(456, 105, 61, 13);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
