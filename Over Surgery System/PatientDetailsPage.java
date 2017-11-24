import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class PatientDetailsPage 
{
	/**
	 * @wbp.parser.entryPoint
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
		
		JLabel lblPatientPersonalDetail = new JLabel("Patient Personal Details");
		lblPatientPersonalDetail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPatientPersonalDetail.setBounds(290, 47, 194, 36);
		panel.add(lblPatientPersonalDetail);
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setBounds(56, 101, 63, 28);
		panel.add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setBounds(56, 152, 80, 28);
		panel.add(lblPatientName);
		
		JLabel lblNRICNumber = new JLabel("NRIC Number: ");
		lblNRICNumber.setBounds(56, 211, 90, 14);
		panel.add(lblNRICNumber);
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setBounds(56, 262, 39, 14);
		panel.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(56, 312, 74, 14);
		panel.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(56, 445, 74, 14);
		panel.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(56, 359, 100, 14);
		panel.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(56, 402, 74, 14);
		panel.add(lblEmail);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(490, 108, 74, 14);
		panel.add(lblWeight);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(490, 159, 47, 14);
		panel.add(lblHeight);
		
		JLabel lblNoAppointment = new JLabel("No Appointment:");
		lblNoAppointment.setBounds(440, 211, 100, 14);
		panel.add(lblNoAppointment);
		
		JLabel lblMedicalPrescription = new JLabel("Medical Prescription:");
		lblMedicalPrescription.setBounds(412, 262, 120, 14);
		panel.add(lblMedicalPrescription);
		
		JLabel PatientIDField = new JLabel("");
		PatientIDField.setLabelFor(lblPatientId);
		PatientIDField.setBounds(140, 108, 74, 14);
		panel.add(PatientIDField);
		
		JLabel PatientNameField = new JLabel("");
		PatientNameField.setLabelFor(lblPatientName);
		PatientNameField.setBounds(140, 159, 74, 14);
		panel.add(PatientNameField);
		
		JLabel NRICNumberField = new JLabel("");
		NRICNumberField.setLabelFor(lblNRICNumber);
		NRICNumberField.setBounds(140, 211, 74, 14);
		panel.add(NRICNumberField);
		
		JLabel DOBField = new JLabel("");
		DOBField.setLabelFor(lblDob);
		DOBField.setBounds(105, 262, 63, 14);
		panel.add(DOBField);
		
		JLabel GenderField = new JLabel("");
		GenderField.setLabelFor(lblGender);
		GenderField.setBounds(105, 312, 46, 14);
		panel.add(GenderField);
		
		JLabel PhoneNumField = new JLabel("");
		PhoneNumField.setLabelFor(lblPhoneNumber);
		PhoneNumField.setBounds(140, 359, 46, 14);
		panel.add(PhoneNumField);
		
		JLabel EmailField = new JLabel("");
		EmailField.setLabelFor(lblEmail);
		EmailField.setBounds(105, 402, 46, 14);
		panel.add(EmailField);
		
		JLabel AddressField = new JLabel("\r\n");
		AddressField.setLabelFor(lblAddress);
		AddressField.setBounds(105, 445, 63, 14);
		panel.add(AddressField);
		
		JLabel WeightField = new JLabel("\r\n");
		WeightField.setLabelFor(lblWeight);
		WeightField.setBounds(520, 108, 46, 14);
		panel.add(WeightField);
		
		JLabel HeightField = new JLabel("\r\n");
		HeightField.setLabelFor(lblHeight);
		HeightField.setBounds(520, 159, 46, 14);
		panel.add(HeightField);
		
		JLabel NoAppointmentField = new JLabel("\r\n");
		NoAppointmentField.setLabelFor(lblNoAppointment);
		NoAppointmentField.setBounds(520, 211, 63, 14);
		panel.add(NoAppointmentField);
		
		JLabel MedicalPrescriptionField = new JLabel("\r\n");
		MedicalPrescriptionField.setLabelFor(lblMedicalPrescription);
		MedicalPrescriptionField.setBounds(526, 262, 46, 14);
		panel.add(MedicalPrescriptionField);
		
		JButton okBtn = new JButton("OK");
		okBtn.setBounds(600, 450, 134, 43);
		panel.add(okBtn);
		okBtn.addActionListener(new ActionListener()
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
		

	}
}
