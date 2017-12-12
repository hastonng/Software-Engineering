import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;

public class PatientDetailsPage 
{
		
	private static int condition;
	static Patient patient = new Patient();
	
	public Patient getP() {
		return patient;
	}

	public static void setP(Patient pa) {
		patient = pa;
	}
	
	
	
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
		
		JPanel upperPanel = new JPanel();
		upperPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		upperPanel.setBounds(22, 47, 740, 247);
		panel.add(upperPanel);
		upperPanel.setLayout(null);
		
		JLabel lblPatientPersonalDetail = new JLabel("Patient Personal Details");
		lblPatientPersonalDetail.setFont(new Font("Verdana", Font.BOLD, 20));
		lblPatientPersonalDetail.setBounds(234, 11, 270, 22);
		upperPanel.add(lblPatientPersonalDetail);
		
		
		
		//patientID
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPatientId.setBounds(589, 31, 119, 18);
		upperPanel.add(lblPatientId);
		
		JLabel PatientIDField = new JLabel(Integer.toString(patient.getPatientID()));
		PatientIDField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		PatientIDField.setLabelFor(lblPatientId);
		PatientIDField.setBounds(690, 31, 40, 23);
		upperPanel.add(PatientIDField);
		
		//patientName
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPatientName.setBounds(43, 69, 136, 18);
		upperPanel.add(lblPatientName);
		
		JLabel PatientNameField = new JLabel(patient.getPatientName());
		PatientNameField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		PatientNameField.setLabelFor(lblPatientName);
		PatientNameField.setBounds(184, 68, 180, 23);
		upperPanel.add(PatientNameField);
	
		
		//ICNumber
		JLabel lblNRICNumber = new JLabel("NRIC Number:");
		lblNRICNumber.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNRICNumber.setBounds(37, 107, 138, 18);
		upperPanel.add(lblNRICNumber);
		
		JLabel NRICNumberField = new JLabel(patient.getNricNum());
		NRICNumberField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		NRICNumberField.setLabelFor(lblNRICNumber);
		NRICNumberField.setBounds(184, 108, 86, 23);
		upperPanel.add(NRICNumberField);
		
		
		//DOB
		JLabel lblDob = new JLabel("Date Of Birth:");
		lblDob.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblDob.setBounds(47, 149, 134, 18);
		upperPanel.add(lblDob);
		
		JLabel DOBField = new JLabel(patient.getStrDob());
		DOBField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		DOBField.setLabelFor(lblDob);
		DOBField.setBounds(184, 149, 120, 23);
		upperPanel.add(DOBField);

		
		//Gender
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(102, 187, 78, 18);
		upperPanel.add(lblGender);
		lblGender.setFont(new Font("Georgia", Font.PLAIN, 20));
		
		JLabel GenderField = new JLabel(patient.getSex());
		GenderField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		GenderField.setLabelFor(lblGender);
		GenderField.setBounds(184, 186, 86, 23);
		upperPanel.add(GenderField);
		
		
		//Phone Number
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(369, 68, 149, 18);
		upperPanel.add(lblPhoneNumber);
		
		
		JLabel PhoneNumField = new JLabel(patient.getPhoneNum());
		PhoneNumField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		PhoneNumField.setLabelFor(lblPhoneNumber);
		PhoneNumField.setBounds(520, 68, 120, 23);
		upperPanel.add(PhoneNumField);
	
			
		//email
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblEmail.setBounds(453, 109, 66, 18);
		upperPanel.add(lblEmail);
		
		JLabel EmailField = new JLabel(patient.getEmail());
		EmailField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		EmailField.setLabelFor(lblEmail);
		EmailField.setBounds(519, 108, 211, 23);
		upperPanel.add(EmailField);
	
		//address
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblAddress.setBounds(438, 149, 78, 18);
		upperPanel.add(lblAddress);
		
		
		String[] addFields = patient.getAddress().split(",");

		JLabel AddressField = new JLabel(addFields[0]);
		AddressField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		AddressField.setLabelFor(lblAddress);
		AddressField.setBounds(519, 148, 193, 23);
		upperPanel.add(AddressField);
		
		JLabel AddressField1 = new JLabel(addFields[1]);
		AddressField1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        	AddressField1.setLabelFor(lblAddress);
        	AddressField1.setBounds(519, 171, 193, 23);
        	upperPanel.add(AddressField1);
		
		
		//lowerPart Panel
		JPanel lowerPartPanel = new JPanel();
		lowerPartPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lowerPartPanel.setBounds(22, 302, 740, 227);
		panel.add(lowerPartPanel);
		lowerPartPanel.setLayout(null);
		
		JLabel weightlabel = new JLabel("Weight:");
		weightlabel.setFont(new Font("Georgia", Font.PLAIN, 20));
		weightlabel.setBounds(482, 16, 86, 18);
		lowerPartPanel.add(weightlabel);
		
		JLabel weightField = new JLabel(Integer.toString(patient.getPatientWeight()));
		weightField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		weightField.setLabelFor(weightlabel);
		weightField.setBounds(558, 16, 86, 23);
		lowerPartPanel.add(weightField);
		
		
		JLabel lblheightField = new JLabel("Height:");
		lblheightField.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblheightField.setBounds(486, 52, 78, 18);
		lowerPartPanel.add(lblheightField);
		
		JLabel heightField = new JLabel(Integer.toString(patient.getPatientHeight()));
		heightField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		heightField.setLabelFor(lblheightField);
		heightField.setBounds(558, 51, 86, 23);
		lowerPartPanel.add(heightField);
		
		JLabel patConlbl = new JLabel("Patient Condition:");
		patConlbl.setFont(new Font("Georgia", Font.PLAIN, 20));
		patConlbl.setBounds(38, 52, 166, 18);
		lowerPartPanel.add(patConlbl);
		
		JLabel patConditionField = new JLabel(Integer.toString(patient.getCondition()));
		patConditionField.setLabelFor(patConlbl);
		patConditionField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		patConditionField.setBounds(206, 51, 86, 23);
		lowerPartPanel.add(patConditionField);
		
		JLabel patDislbl = new JLabel("Patient Disease:");
		patDislbl.setFont(new Font("Georgia", Font.PLAIN, 20));
		patDislbl.setBounds(57, 16, 150, 18);
		lowerPartPanel.add(patDislbl);
		
		JLabel patDiseaseField = new JLabel(patient.getDisease());
		patDiseaseField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		patDiseaseField.setLabelFor(patDislbl);
		patDiseaseField.setBounds(206, 16, 86, 23);
		lowerPartPanel.add(patDiseaseField);
		
		
		JLabel lblDRUGPRESCRIBED = new JLabel("Drugs Prescribed:");
        lblDRUGPRESCRIBED.setFont(new Font("Georgia", Font.PLAIN, 20));
        lblDRUGPRESCRIBED.setBounds(43, 92, 163, 18);
       	lowerPartPanel.add(lblDRUGPRESCRIBED);

       	JLabel DRUGPRESCRIBEDField = new JLabel(patient.getDrugsPrescribed());
        DRUGPRESCRIBEDField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        DRUGPRESCRIBEDField.setLabelFor(lblDRUGPRESCRIBED);
        DRUGPRESCRIBEDField.setBounds(206, 92, 257, 23);
        lowerPartPanel.add(DRUGPRESCRIBEDField);

		
		
		
		Button okBtn = new Button("OK");
		okBtn.setBounds(694, 538, 80, 23);
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
		Window.update();
	}
}
