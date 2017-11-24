import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import com.toedter.calendar.JCalendar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class AppointmentPage
{
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show()
	{
        JPanel panel = Window.getCleanContentPane();
		Window.setWindowSize(1000,800);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 984, 36);
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Over Surgery System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatientId.setBounds(35, 115, 95, 20);
		panel.add(lblPatientId);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(140, 117, 206, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(385, 116, 62, 23);
		panel.add(btnNewButton);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatientName.setBounds(56, 150, 132, 20);
		panel.add(lblPatientName);
		
		JLabel PatientLabel_1 = new JLabel("");
		PatientLabel_1.setBounds(178, 150, 191, 20);
		panel.add(PatientLabel_1);
		
		JLabel lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContactNumber.setBounds(35, 197, 132, 20);
		panel.add(lblContactNumber);
		
		JLabel lblNric = new JLabel("NRIC:\r\n");
		lblNric.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNric.setBounds(499, 150, 56, 20);
		panel.add(lblNric);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(499, 197, 56, 20);
		panel.add(lblEmail);
		
		JLabel Contactlabel = new JLabel("");
		Contactlabel.setBounds(178, 202, 191, 20);
		panel.add(Contactlabel);
		
		JLabel NRIClabel_1 = new JLabel("");
		NRIClabel_1.setBounds(580, 150, 191, 20);
		panel.add(NRIClabel_1);
		
		JLabel EmailLabel_2 = new JLabel("");
		EmailLabel_2.setBounds(580, 197, 191, 20);
		panel.add(EmailLabel_2);
		
		JLabel lblGeneralPractictionerId = new JLabel("General Practitioner ID:");
		lblGeneralPractictionerId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGeneralPractictionerId.setBounds(35, 267, 196, 20);
		panel.add(lblGeneralPractictionerId);
		
		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(241, 269, 206, 20);
		panel.add(textField_5);
		
		JButton button = new JButton("Ok");
		button.setBounds(473, 268, 58, 23);
		panel.add(button);
		
		JLabel lblGeneralPractictioner = new JLabel("General Practitioner Name:");
		lblGeneralPractictioner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGeneralPractictioner.setBounds(35, 331, 221, 20);
		panel.add(lblGeneralPractictioner);
		
		JLabel lblGeneralPractitionerAvability = new JLabel("General Practitioner Avability:");
		lblGeneralPractitionerAvability.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGeneralPractitionerAvability.setBounds(502, 331, 221, 20);
		panel.add(lblGeneralPractitionerAvability);
		
		JLabel GPNamelabel = new JLabel("");
		GPNamelabel.setBounds(239, 331, 191, 20);
		panel.add(GPNamelabel);
		
		JLabel GPAvabilitylabel = new JLabel("");
		GPAvabilitylabel.setBounds(733, 331, 191, 20);
		panel.add(GPAvabilitylabel);
		
		JLabel lblNurseId = new JLabel("Nurse ID:");
		lblNurseId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNurseId.setBounds(35, 454, 81, 20);
		panel.add(lblNurseId);
		
		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(140, 456, 206, 20);
		panel.add(textField_6);
		
		JButton button_1 = new JButton("Ok");
		button_1.setBounds(385, 455, 62, 23);
		panel.add(button_1);
		
		JLabel lblNurseName = new JLabel("Nurse Name:");
		lblNurseName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNurseName.setBounds(35, 512, 221, 20);
		panel.add(lblNurseName);
		
		JLabel lblNurseAvability = new JLabel("Nurse Avability:");
		lblNurseAvability.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNurseAvability.setBounds(514, 512, 221, 20);
		panel.add(lblNurseAvability);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(266, 517, 191, 20);
		panel.add(label_3);
		
		JLabel lblMakeAppointment = new JLabel("Make Appointment");
		lblMakeAppointment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMakeAppointment.setBounds(402, 47, 185, 28);
		panel.add(lblMakeAppointment);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(35, 569, 496, 161);
		panel.add(calendar);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTime.setBounds(580, 569, 56, 20);
		panel.add(lblTime);
		
		JTextField timeLabel = new JTextField();
		timeLabel.setBounds(629, 571, 115, 20);
		panel.add(timeLabel);
		timeLabel.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.setBounds(849, 695, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener()
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
		btnCancel.setBounds(652, 695, 89, 23);
		panel.add(btnCancel);

		Window.update();
	}
}
