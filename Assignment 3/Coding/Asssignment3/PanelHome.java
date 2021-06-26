package Asssignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {

		setBounds(0, 0, 890, 521);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelHome.class.getResource("/image/Black and White Corporate Business Proposal Presentation.png")));
		lblNewLabel.setBounds(0, 0, 890, 521);
		add(lblNewLabel);
		setVisible(true);
	}
}
