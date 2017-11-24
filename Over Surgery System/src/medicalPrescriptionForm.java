import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JCheckBox;

public class medicalPrescriptionForm
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
		
		JLabel lblNewLabel = new JLabel("Over Surgery System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMPrescription = new JLabel("Medical Prescription");
		lblMPrescription.setFont(new Font("Verdana", Font.BOLD, 25));
		lblMPrescription.setBounds(250, 50, 300, 40);
		panel.add(lblMPrescription);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPatientName.setBounds(35, 110, 150, 30);
		panel.add(lblPatientName);
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPatientId.setBounds(35, 140, 150, 30);
		panel.add(lblPatientId);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis:");
		lblDiagnosis.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblDiagnosis.setBounds(35, 300, 150, 30);
		panel.add(lblDiagnosis);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField.setBounds(200, 300, 400, 180);
		panel.add(textField);
		textField.setColumns(10);
		
		Button SubmitBtn = new Button("Submit");
		SubmitBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		SubmitBtn.setBounds(200, 500, 100, 30);
		panel.add(SubmitBtn);
		
		Button CancelBtn = new Button("Cancel");
		CancelBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		CancelBtn.setBounds(500, 500, 100, 30);
		panel.add(CancelBtn);
		CancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					GPMainPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblHeight.setBounds(35, 170, 150, 30);
		panel.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblWeight.setBounds(35, 200, 150, 30);
		panel.add(lblWeight);
		
		JLabel lblDisease = new JLabel("Condition:");
		lblDisease.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblDisease.setBounds(35, 230, 150, 30);
		panel.add(lblDisease);
		
		JLabel lblNewLabel_1 = new JLabel("Disease:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(35, 260, 150, 30);
		panel.add(lblNewLabel_1);
		
		JLabel patientNamefld = new JLabel("");
		patientNamefld.setFont(new Font("Verdana", Font.PLAIN, 12));
		patientNamefld.setBounds(195, 140, 400, 30);
		panel.add(patientNamefld);
		
		JLabel patientHeightFld = new JLabel("");
		patientHeightFld.setFont(new Font("Verdana", Font.PLAIN, 12));
		patientHeightFld.setBounds(195, 170, 100, 30);
		panel.add(patientHeightFld);
		
		JLabel patientWeightFld = new JLabel("");
		patientWeightFld.setBounds(195, 200, 100, 30);
		panel.add(patientWeightFld);
		
		JTextField fldPatientId = new JTextField();
		fldPatientId.setFont(new Font("Verdana", Font.PLAIN, 12));
		fldPatientId.setBounds(195, 110, 200, 30);
		panel.add(fldPatientId);
		fldPatientId.setColumns(10);
		
		JButton btnSearchPatient = new JButton("Search");
		btnSearchPatient.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnSearchPatient.setBounds(421, 116, 89, 23);
		panel.add(btnSearchPatient);
		
		JTextField fldPatientDisease = new JTextField();
		fldPatientDisease.setFont(new Font("Verdana", Font.PLAIN, 12));
		fldPatientDisease.setBounds(200, 263, 400, 30);
		panel.add(fldPatientDisease);
		fldPatientDisease.setColumns(10);
		
		JCheckBox chckbxHealthyCondition = new JCheckBox("Healthy");
		chckbxHealthyCondition.setBackground(Color.BLACK);
		chckbxHealthyCondition.setFont(new Font("Verdana", Font.PLAIN, 12));
		chckbxHealthyCondition.setForeground(Color.GREEN);
		chckbxHealthyCondition.setBounds(200, 236, 97, 23);
		panel.add(chckbxHealthyCondition);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Risky");
		chckbxNewCheckBox.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox.setForeground(Color.YELLOW);
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(321, 236, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Critical");
		chckbxNewCheckBox_1.setBackground(Color.BLACK);
		chckbxNewCheckBox_1.setForeground(Color.RED);
		chckbxNewCheckBox_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(453, 236, 97, 23);
		panel.add(chckbxNewCheckBox_1);
		
		Window.update();
	}
}
