package Asssignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelAds extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelAds() {

		
		setBounds(0, 0, 890, 521);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelAds.class.getResource("/image/Icons.png")));
		lblNewLabel.setBounds(10, 10, 870, 501);
		add(lblNewLabel);
		setVisible(true);
	}

}
