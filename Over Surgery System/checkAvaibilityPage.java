import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class checkAvaibilityPage 
{
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show() 
	{
		JPanel panel = Window.getCleanContentPane();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(-11, 0, 795, 36);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Over Surgery System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JTable table = new JTable();
		table.setBounds(25, 130, 726, 120);
		panel.add(table);
		
		JLabel lblNewLabel1 = new JLabel("General Practictioner ID:");
		lblNewLabel1.setBounds(25, 73, 145, 34);
		panel.add(lblNewLabel1);
		
		JTextField textField = new JTextField();
		textField.setBounds(218, 77, 172, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(440, 79, 57, 23);
		panel.add(btnNewButton);
		
		JLabel lblNurseAvability = new JLabel("Nurse ID:");
		lblNurseAvability.setBounds(25, 326, 112, 14);
		panel.add(lblNurseAvability);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(233, 326, 172, 27);
		panel.add(textField_1);
		
		
		JButton button = new JButton("Ok");
		button.setBounds(440, 328, 57, 23);
		panel.add(button);
		
		JTable table_1 = new JTable();
		table_1.setBounds(25, 388, 726, 120);
		panel.add(table_1);
	}
}
