package Asssignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Register extends JFrame {

	public static String name;
	public static String username;
	public static String password;
	
	private JPanel contentPane;
	private JPasswordField PasswordText;
	private JPasswordField RePasswordText;
	private JTextField NameText;
	private JTextField UsernameText;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 10, 502, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblNewLabel.setBounds(199, 10, 100, 31);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 62, 502, 570);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Fullfill your information:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(26, 60, 216, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel Notpass = new JLabel("");
		Notpass.setFont(new Font("Dialog", Font.PLAIN, 12));
		Notpass.setForeground(new Color(153, 0, 51));
		Notpass.setBounds(129, 360, 255, 19);
		panel_1.add(Notpass);
		
		JButton Register = new JButton("Register");
		Register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Register.setBackground(getForeground());
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Register.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Register.setBackground(Color.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Register.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Register.setBackground(Color.GRAY);
			}
		});
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (RePasswordText.getText().equals(PasswordText.getText())) {
					
				 name = NameText.getText();
				 username = UsernameText.getText();
				 password = RePasswordText.getText();
				 
				 // return to login
				JOptionPane.showMessageDialog(null, "Register Successful");
				Login l = new Login();
				l.setVisible(true);
				l.setLocationRelativeTo(null);
				l.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
				dispose();
				 
				 
				}
				else {
					Notpass.setText("Password not match, try again");
				}
				
			}
		});
		Register.setForeground(Color.WHITE);
		Register.setBorder(new LineBorder(Color.WHITE));
		Register.setBackground(Color.GRAY);
		Register.setFont(new Font("Dialog", Font.PLAIN, 15));
		Register.setBounds(180, 392, 114, 37);
		panel_1.add(Register);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(68, 238, 106, 13);
		panel_1.add(lblNewLabel_1);
		
		PasswordText = new JPasswordField();
		PasswordText.setBorder(new LineBorder(Color.WHITE));
		PasswordText.setBackground(Color.GRAY);
		PasswordText.setBounds(68, 261, 316, 19);
		panel_1.add(PasswordText);
		
		JLabel lblNewLabel_1_1 = new JLabel("Re-type Password:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(68, 306, 154, 21);
		panel_1.add(lblNewLabel_1_1);
		
		RePasswordText = new JPasswordField();
		RePasswordText.setBorder(new LineBorder(Color.WHITE));
		RePasswordText.setBackground(Color.GRAY);
		RePasswordText.setBounds(68, 331, 316, 19);
		panel_1.add(RePasswordText);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(68, 100, 106, 13);
		panel_1.add(lblNewLabel_1_2);
		
		NameText = new JTextField();
		NameText.setBackground(Color.GRAY);
		NameText.setBorder(new LineBorder(Color.WHITE));
		NameText.setFont(new Font("Dialog", Font.PLAIN, 15));
		NameText.setBounds(68, 123, 316, 21);
		panel_1.add(NameText);
		NameText.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Username:");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(68, 160, 106, 13);
		panel_1.add(lblNewLabel_1_2_1);
		
		UsernameText = new JTextField();
		UsernameText.setBackground(Color.GRAY);
		UsernameText.setBorder(new LineBorder(Color.WHITE));
		UsernameText.setFont(new Font("Dialog", Font.PLAIN, 15));
		UsernameText.setColumns(10);
		UsernameText.setBounds(68, 187, 316, 21);
		panel_1.add(UsernameText);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Register.class.getResource("/image/icons8_user_24px_1.png")));
		lblNewLabel_3.setBounds(26, 107, 30, 37);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Register.class.getResource("/image/icons8_user_24px_1.png")));
		lblNewLabel_3_1.setBounds(26, 171, 30, 37);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(Register.class.getResource("/image/icons8_password_32px.png")));
		lblNewLabel_3_1_1.setBounds(20, 238, 45, 37);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(Register.class.getResource("/image/icons8_password_32px.png")));
		lblNewLabel_3_1_1_1.setBounds(20, 312, 51, 37);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		
	}
}
