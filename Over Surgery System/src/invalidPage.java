import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class invalidPage {

	/**
	 * Create the panel.
	 */
	public static void show()
	{
		JPanel panel = Window.getCleanContentPane();
		
        panel.setBounds(0, 0, 10000, 10000);
        panel.setBackground(new Color(176, 224, 230));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setBounds(255, 120, 761, 179);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel InvalidIcon = new JLabel();
		InvalidIcon.setBounds(38, 38, 107, 95);
		InvalidIcon.setIcon(new ImageIcon("C:\\Users\\Haston Ng\\eclipse-workspace\\Over Surgery System\\src\\invalidIcon.png"));
		panel_1.add(InvalidIcon);
		
		JLabel lblPlease = new JLabel("Please contact your Administrator.");
		lblPlease.setBounds(175, 57, 536, 59);
		panel_1.add(lblPlease);
		lblPlease.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
		Button btnOk = new Button("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnOk.setBounds(1103, 560, 89, 36);
		panel.add(btnOk);btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					LoginPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});

	}
}
