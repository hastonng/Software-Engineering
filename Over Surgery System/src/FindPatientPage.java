import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class FindPatientPage
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
		
		JLabel lblFindPatient = new JLabel("Find Patient");
		lblFindPatient.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFindPatient.setBounds(317, 59, 155, 54);
		panel.add(lblFindPatient);
		
		JLabel lblPatientId = new JLabel("Patient ID: ");
		lblPatientId.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPatientId.setBounds(257, 134, 120, 30);
		panel.add(lblPatientId);
		
		JTextField textField = new JTextField();
		textField.setBounds(387, 134, 144, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblIcNumber = new JLabel("IC Number:");
		lblIcNumber.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblIcNumber.setBounds(250, 245, 120, 30);
		panel.add(lblIcNumber);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(387, 245, 144, 36);
		panel.add(textField_1);
		
		JLabel lblPatientName = new JLabel("Patient Name: ");
		lblPatientName.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPatientName.setBounds(226, 190, 144, 30);
		panel.add(lblPatientName);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(387, 190, 144, 36);
		panel.add(textField_2);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(213, 303, 144, 30);
		panel.add(lblPhoneNumber);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(387, 303, 144, 36);
		panel.add(textField_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(634, 337, 6, 20);
		panel.add(textPane);
		
		JButton findBtn = new JButton("Find");
		findBtn.setBounds(426, 413, 134, 43);
		panel.add(findBtn);
		findBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					PatientDetailsPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
			
		});
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(226, 413, 134, 43);
		panel.add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener()
		{
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
		
		Window.update();
	}
}
