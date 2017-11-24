import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newPatientPage
{
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show()
	{
        JPanel panel = Window.getCleanContentPane();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 795, 36);
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel.add(panel_1);
		
		JLabel title = new JLabel("Over Surgery System");
		panel_1.add(title);
		title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("New Patient Registration");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 24));
		lblNewLabel.setBounds(250, 29, 400, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First name:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_1.setBounds(100, 80, 150, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setFont(new Font("Verdana", Font.BOLD, 20));
		lblLastName.setBounds(100, 120, 150, 40);
		panel.add(lblLastName);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_2.setBounds(100, 160, 150, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("D.O.B:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_3.setBounds(100, 200, 100, 30);
		panel.add(lblNewLabel_3);
		
		JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setFont(new Font("Verdana", Font.BOLD, 20));
		lblContactNo.setBounds(100, 240, 140, 30);
		panel.add(lblContactNo);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEmail.setBounds(100, 280, 100, 30);
		panel.add(lblEmail);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Verdana", Font.BOLD, 20));
		lblAddress.setBounds(100, 320, 100, 30);
		panel.add(lblAddress);
		
		JLabel lblNric = new JLabel("NRIC:");
		lblNric.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNric.setBounds(100, 460, 100, 30);
		panel.add(lblNric);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.ITALIC, 15));
		textField.setBounds(250, 80, 180, 30);
		panel.add(textField);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Verdana", Font.ITALIC, 15));
		textField_1.setBounds(250, 120, 180, 30);
		panel.add(textField_1);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Verdana", Font.BOLD, 15));
		rdbtnMale.setBounds(250, 160, 90, 30);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Verdana", Font.BOLD, 15));
		rdbtnFemale.setBounds(340, 160, 100, 30);
		panel.add(rdbtnFemale);
		
		JTextField txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtDdmmyyyy.setText("DD/MM/YYYY");
		txtDdmmyyyy.setFont(new Font("Verdana", Font.ITALIC, 15));
		txtDdmmyyyy.setBounds(250, 200, 180, 30);
		panel.add(txtDdmmyyyy);
		txtDdmmyyyy.setColumns(10);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Verdana", Font.ITALIC, 15));
		textField_2.setBounds(250, 240, 180, 30);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JTextField textField_3 = new JTextField();
		textField_3.setFont(new Font("Verdana", Font.ITALIC, 15));
		textField_3.setBounds(250, 280, 180, 30);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Verdana", Font.ITALIC, 15));
		textField_4.setBounds(250, 320, 180, 120);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JTextField textField_5 = new JTextField();
		textField_5.setFont(new Font("Verdana", Font.ITALIC, 15));
		textField_5.setBounds(250, 460, 180, 30);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Height:");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(500, 80, 100, 30);
		panel.add(lblNewLabel_4);
		
		JTextField txtCm = new JTextField();
		txtCm.setText("cm");
		txtCm.setFont(new Font("Verdana", Font.ITALIC, 15));
		txtCm.setBounds(580, 85, 60, 30);
		panel.add(txtCm);
		txtCm.setColumns(10);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblWeight.setBounds(500, 120, 100, 30);
		panel.add(lblWeight);
		
		JTextField txtKg = new JTextField();
		txtKg.setFont(new Font("Verdana", Font.ITALIC, 15));
		txtKg.setText("kg");
		txtKg.setBounds(580, 125, 60, 30);
		panel.add(txtKg);
		txtKg.setColumns(10);
		
		Button button = new Button("Register");
		button.setFont(new Font("Verdana", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(250, 516, 70, 22);
		panel.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		button_1.setBounds(361, 516, 70, 22);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					MainPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
	}
}
