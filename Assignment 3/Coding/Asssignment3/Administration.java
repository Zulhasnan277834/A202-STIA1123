package Asssignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Administration extends JFrame {

	private JPanel contentPane;
	private PanelHome panelHome;
	private PanelEmployee panelEmployee;
	private PanelFinancial panelFinancial;
	private PanelInventory panelInventory;
	private PanelAds panelAds;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administration frame = new Administration();
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
	public Administration() {
		setTitle("Administration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1175, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Panel object call
		panelHome = new PanelHome();
		panelHome.setBounds(0, -19, 893, 534);
		panelEmployee = new PanelEmployee();
		panelFinancial = new PanelFinancial();
		panelInventory = new PanelInventory();
		panelAds = new PanelAds();
		
		
		
		
		JPanel LeftPanel = new JPanel();
		LeftPanel.setBackground(Color.DARK_GRAY);
		LeftPanel.setBounds(0, 0, 255, 553);
		contentPane.add(LeftPanel);
		LeftPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 130, 220, 2);
		LeftPanel.add(separator);
		
		JPanel pHome = new JPanel();
		pHome.addMouseListener(new PanelButtonMouseAdapter (panelHome) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
				pHome.setBackground(Color.GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pHome.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pHome.setBackground(SystemColor.windowBorder);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pHome.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pHome.setBackground(Color.GRAY);
			}
		});
		pHome.setBorder(null);
		pHome.setBackground(SystemColor.windowBorder);
		pHome.setBounds(0, 190, 255, 41);
		LeftPanel.add(pHome);
		pHome.setLayout(null);
		
		JLabel LabelHome = new JLabel("HOME");
		LabelHome.setForeground(Color.WHITE);
		LabelHome.setFont(new Font("Segoe UI", Font.BOLD, 15));
		LabelHome.setBounds(65, 10, 110, 21);
		pHome.add(LabelHome);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Administration.class.getResource("/image/icons8_home_32px.png")));
		lblNewLabel_2.setBounds(10, 0, 35, 41);
		pHome.add(lblNewLabel_2);
		
		
		JPanel pEmployee = new JPanel();
		pEmployee.addMouseListener(new PanelButtonMouseAdapter(panelEmployee) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelEmployee);
				pEmployee.setBackground(Color.GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pEmployee.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pEmployee.setBackground(SystemColor.windowBorder);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pEmployee.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pEmployee.setBackground(Color.GRAY);
			}
		});
		pEmployee.setBorder(null);
		pEmployee.setBackground(SystemColor.windowBorder);
		pEmployee.setBounds(0, 230, 255, 41);
		LeftPanel.add(pEmployee);
		pEmployee.setLayout(null);
		
		JLabel LabelEmployee = new JLabel("EMPLOYEE INFO");
		LabelEmployee.setForeground(Color.WHITE);
		LabelEmployee.setFont(new Font("Segoe UI", Font.BOLD, 15));
		LabelEmployee.setBounds(65, 10, 123, 21);
		pEmployee.add(LabelEmployee);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Administration.class.getResource("/image/icons8_employee_32px.png")));
		lblNewLabel_2_1.setBounds(10, 0, 35, 41);
		pEmployee.add(lblNewLabel_2_1);
		
		JPanel pFinancial = new JPanel();
		pFinancial.addMouseListener(new PanelButtonMouseAdapter(panelFinancial) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelFinancial);
				pFinancial.setBackground(Color.GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pFinancial.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pFinancial.setBackground(SystemColor.windowBorder);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pFinancial.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pFinancial.setBackground(Color.GRAY);
			}
		});
		pFinancial.setBorder(null);
		pFinancial.setBackground(SystemColor.windowBorder);
		pFinancial.setBounds(0, 270, 255, 41);
		LeftPanel.add(pFinancial);
		pFinancial.setLayout(null);
		
		JLabel LabelFinancial = new JLabel("FINANCIAL");
		LabelFinancial.setForeground(Color.WHITE);
		LabelFinancial.setFont(new Font("Segoe UI", Font.BOLD, 15));
		LabelFinancial.setBounds(65, 10, 110, 21);
		pFinancial.add(LabelFinancial);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Administration.class.getResource("/image/icons8_financial_growth_analysis_32px.png")));
		lblNewLabel_2_1_1.setBounds(13, 0, 42, 41);
		pFinancial.add(lblNewLabel_2_1_1);
		
		JPanel pInventory = new JPanel();
		pInventory.addMouseListener(new PanelButtonMouseAdapter (panelInventory) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelInventory);
				pInventory.setBackground(Color.GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pInventory.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pInventory.setBackground(SystemColor.windowBorder);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pInventory.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pInventory.setBackground(Color.GRAY);
			}
		});
		pInventory.setBorder(null);
		pInventory.setBackground(SystemColor.windowBorder);
		pInventory.setBounds(0, 310, 255, 41);
		LeftPanel.add(pInventory);
		pInventory.setLayout(null);
		
		JLabel LabelInventory = new JLabel("INVENTORY");
		LabelInventory.setForeground(Color.WHITE);
		LabelInventory.setFont(new Font("Segoe UI", Font.BOLD, 15));
		LabelInventory.setBounds(65, 10, 95, 21);
		pInventory.add(LabelInventory);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(Administration.class.getResource("/image/icons8_warehouse_32px.png")));
		lblNewLabel_2_2.setBounds(10, 0, 35, 41);
		pInventory.add(lblNewLabel_2_2);
		
		JPanel pAds = new JPanel();
		pAds.addMouseListener(new PanelButtonMouseAdapter (panelAds) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAds);
				pAds.setBackground(Color.GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pAds.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pAds.setBackground(SystemColor.windowBorder);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pAds.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pAds.setBackground(Color.GRAY);
			}
		});
		pAds.setBorder(null);
		pAds.setBackground(SystemColor.windowBorder);
		pAds.setBounds(0, 350, 255, 41);
		LeftPanel.add(pAds);
		pAds.setLayout(null);
		
		JLabel LabelSales = new JLabel("ADVERTISMENT");
		LabelSales.setForeground(Color.WHITE);
		LabelSales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		LabelSales.setBounds(65, 10, 129, 21);
		pAds.add(LabelSales);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setIcon(new ImageIcon(Administration.class.getResource("/image/icons8_youtube_advertising_25px.png")));
		lblNewLabel_2_2_1.setBounds(10, 0, 35, 41);
		pAds.add(lblNewLabel_2_2_1);
		
		JPanel pSignOut = new JPanel();
		pSignOut.addMouseListener(new PanelButtonMouseAdapter (pSignOut) {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?") == 0 ) {
					
					Login l = new Login();
					l.setVisible(true);
					l.setLocationRelativeTo(null);
					l.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
					Administration.this.dispose();
					pSignOut.setBackground(Color.GRAY);
				}
					
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pSignOut.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pSignOut.setBackground(SystemColor.windowBorder);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pSignOut.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pSignOut.setBackground(Color.GRAY);
			}
		});
		pSignOut.setBorder(null);
		pSignOut.setLayout(null);
		pSignOut.setBackground(SystemColor.windowBorder);
		pSignOut.setBounds(0, 390, 255, 41);
		LeftPanel.add(pSignOut);
		
		JLabel LabelSignOut = new JLabel("SIGN OUT");
		LabelSignOut.setForeground(Color.WHITE);
		LabelSignOut.setFont(new Font("Segoe UI", Font.BOLD, 15));
		LabelSignOut.setBounds(65, 10, 110, 21);
		pSignOut.add(LabelSignOut);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("");
		lblNewLabel_2_2_2.setIcon(new ImageIcon(Administration.class.getResource("/image/icons8_exit_sign_32px.png")));
		lblNewLabel_2_2_2.setBounds(10, 0, 35, 41);
		pSignOut.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Administration.class.getResource("/image/icons8_admin_settings_male_100px_1.png")));
		lblNewLabel.setBounds(0, 10, 99, 99);
		LeftPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome,");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(96, 46, 110, 13);
		LeftPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Administration");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(96, 69, 149, 34);
		LeftPanel.add(lblNewLabel_1_1);
		
		JPanel RightPanel = new JPanel();
		RightPanel.setBackground(Color.DARK_GRAY);
		RightPanel.setBounds(256, 0, 910, 553);
		contentPane.add(RightPanel);
		RightPanel.setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(10, 10, 890, 521);
		RightPanel.add(MainPanel);
		MainPanel.setLayout(null);
		
		
		//Mainpanel add new panel
		MainPanel.add(panelHome);
		MainPanel.add(panelEmployee);
		MainPanel.add(panelFinancial);
		MainPanel.add(panelInventory);
		MainPanel.add(panelAds);
		
		menuClicked(panelHome);
		
	}
	public void menuClicked(JPanel panel) {
		
		panelHome.setVisible(false);
		panelEmployee.setVisible(false);
		panelFinancial.setVisible(false);
		panelInventory.setVisible(false);
		panelAds.setVisible(false);
		
		
		panel.setVisible(true);
	}
	public class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel; 
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color (255,255,255));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color (255,255,255));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color (255,255,255));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color (255,255,255));
		}
	}
}
