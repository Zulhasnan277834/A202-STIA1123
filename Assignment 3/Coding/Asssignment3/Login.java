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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Log In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 952, 527);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(525, 26, 405, 476);
		panel.add(panel_1);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.GRAY);
		panel_1.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("");
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setSelectedTextColor(new Color(255, 255, 255));
		txtUsername.setBackground(Color.GRAY);
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtUsername.setBounds(84, 95, 318, 29);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(84, 134, 265, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(84, 220, 265, 2);
		panel_1.add(separator_1);
		
		JLabel WrongPass = new JLabel("");
		WrongPass.setForeground(Color.RED);
		WrongPass.setBackground(new Color(0, 0, 0));
		WrongPass.setFont(new Font("Dialog", Font.PLAIN, 13));
		WrongPass.setBounds(94, 237, 232, 29);
		panel_1.add(WrongPass);
		
		JButton btnUser = new JButton("User");
		btnUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnUser.setBackground(getForeground());
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUser.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUser.setBackground(Color.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnUser.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnUser.setBackground(Color.GRAY);
			}
		});
		btnUser.setForeground(new Color(255, 255, 255));
		btnUser.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnUser.setBackground(Color.GRAY);
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtUsername.getText().equals(Register.username) && (txtPassword.getText().equals(Register.password))) {
					
					JOptionPane.showMessageDialog(null, "Log in Successful");
					Customers c = new Customers();
					c.setVisible(true);
					c.setLocationRelativeTo(null);
					c.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
					dispose();
				}
				else {
					WrongPass.setText("Wrong username or password, try again");
				}
				
			}
		});
		btnUser.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnUser.setBounds(68, 288, 118, 47);
		panel_1.add(btnUser);
		
		JLabel AdminPass = new JLabel("");
		AdminPass.setForeground(Color.RED);
		AdminPass.setFont(new Font("Dialog", Font.PLAIN, 13));
		AdminPass.setBounds(94, 265, 232, 13);
		panel_1.add(AdminPass);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnAdmin.setBackground(getForeground());
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAdmin.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAdmin.setBackground(Color.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnAdmin.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnAdmin.setBackground(Color.GRAY);
			}
		});
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
if (txtUsername.getText().equals("Admin") && (txtPassword.getText().equals("1234"))) {
	
					JOptionPane.showMessageDialog(null, "Log in Successful");
					Administration m = new Administration();
					m.setVisible(true);
					m.setLocationRelativeTo(null);
					m.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
					
					dispose();
				}
				else {
					WrongPass.setText("Wrong username or password, try again");
					AdminPass.setText("Username: Admin  Pass: 1234");
				}
				
			}
		});
		btnAdmin.setForeground(new Color(255, 255, 255));
		btnAdmin.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnAdmin.setBackground(Color.GRAY);
		btnAdmin.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdmin.setBounds(231, 288, 118, 47);
		panel_1.add(btnAdmin);
		
		JButton btnCreateAcc = new JButton("Create a new account. ");
		btnCreateAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnCreateAcc.setBackground(getForeground());
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCreateAcc.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCreateAcc.setBackground(Color.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnCreateAcc.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnCreateAcc.setBackground(Color.GRAY);
			}
		});
		btnCreateAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Register r = new Register();
				r.setVisible(true);
				r.setLocationRelativeTo(null);
				r.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
				dispose();
				
			}
		});
		btnCreateAcc.setBorder(null);
		btnCreateAcc.setBackground(Color.GRAY);
		btnCreateAcc.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnCreateAcc.setBounds(124, 411, 176, 21);
		panel_1.add(btnCreateAcc);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/image/icons8_user_24px.png")));
		lblNewLabel_2.setBounds(44, 95, 30, 34);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/image/icons8_password_24px.png")));
		lblNewLabel_3.setBounds(44, 181, 30, 34);
		panel_1.add(lblNewLabel_3);
		
		txtPassword = new JPasswordField();
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.GRAY);
		txtPassword.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtPassword.setBounds(84, 190, 265, 21);
		panel_1.add(txtPassword);
		
		JButton btnReset = new JButton("");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnReset.setBackground(getForeground());
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReset.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReset.setBackground(Color.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnReset.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnReset.setBackground(Color.GRAY);
			}
			
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText("");
				txtPassword.setText("");
				
				
			}
		});
		btnReset.setIcon(new ImageIcon(Login.class.getResource("/image/icons8_reset_24px.png")));
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnReset.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnReset.setBackground(Color.GRAY);
		btnReset.setBounds(186, 353, 45, 34);
		panel_1.add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to MyStorage");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Elephant", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(68, 30, 329, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/image/offset_860897 (1).jpg")));
		lblNewLabel.setBounds(10, 42, 505, 450);
		panel.add(lblNewLabel);
		
		
		
		
	}
}
