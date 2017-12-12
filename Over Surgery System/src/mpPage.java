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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JCheckBox;

public class mpPage
{
	
	private static String pName;
	private static String icNum;
	private static int pID;
	
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show()
	{
		JPanel panel = Window.getCleanContentPane();
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2.setBounds(283, 20, 850, 660);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMPrescription = new JLabel("Medical Prescription");
		lblMPrescription.setBounds(196, 11, 482, 54);
		lblMPrescription.setFont(new Font("Verdana", Font.BOLD, 40));
		panel_2.add(lblMPrescription);
		
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(180, 105, 218, 35);
		lblEmployeeId.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblEmployeeId);
		
		JTextField EmpIDField = new JTextField();
		EmpIDField.setBounds(422, 105, 174, 36);
		EmpIDField.setFont(new Font("Tahoma", Font.PLAIN, 27));
		EmpIDField.setColumns(10);
		panel_2.add(EmpIDField);
		
		
		//patName
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setBounds(175, 233, 223, 35);
		lblPatientName.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblPatientName);
		
		JLabel fldPatientName = new JLabel();
		fldPatientName.setBounds(422, 232, 207, 36);
		fldPatientName.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel_2.add(fldPatientName);
		
		/*JTextField fldPatientName = new JTextField();
		fldPatientName.setBounds(280, 137, 207, 22);
		fldPatientName.setFont(new Font("Verdana", Font.PLAIN, 12));
		panel_2.add(fldPatientName);
		fldPatientName.setColumns(10);*/
		
		Button btnSearchPatient = new Button("Search");
		btnSearchPatient.setBounds(515, 161, 98, 43);
		btnSearchPatient.setFont(new Font("Verdana", Font.PLAIN, 25));
		panel_2.add(btnSearchPatient);
		
		//patientID 
		JLabel lblBedNo = new JLabel("Bed No:");
		lblBedNo.setBounds(267, 169, 131, 35);
		lblBedNo.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblBedNo);
		
		/*
		JLabel lblicNum = new JLabel("");
		lblicNum.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblicNum.setBounds(195, 140, 400, 30);
		panel_2.add(lblicNum);
		*/
		JTextField BedNoField = new JTextField();
		BedNoField.setBounds(422, 169, 75, 36);
		BedNoField.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel_2.add(BedNoField);
		BedNoField.setColumns(10);
		BedNoField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (BedNoField.getText().length() >= 4)
					e.consume();
				else 
				{	//set accept only interger
					 char c = e.getKeyChar();
					 if (!((c >= '0') && (c <= '9') ||
						c == KeyEvent.VK_BACK_SPACE) ||
						(c == KeyEvent.VK_DELETE)) {
						 BedNoField.getToolkit().beep();
		    	  		e.consume();
				}
				}
			}
		
		});
		
		//Height
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(277, 297, 123, 35);
		lblHeight.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblHeight);
		
		
		JLabel patientHeightField = new JLabel();
		patientHeightField.setFont(new Font("Tahoma", Font.PLAIN, 27));
		patientHeightField.setBounds(422, 296, 58, 36);
		panel_2.add(patientHeightField);
		
		/*
		JTextField patientHeightField = new JTextField();
		patientHeightField.setBounds(280, 181, 58, 22);
		patientHeightField.setFont(new Font("Verdana", Font.PLAIN, 12));
		panel_2.add(patientHeightField);
		patientHeightField.setColumns(10);
		*/
		
		//weight
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(277, 361, 131, 35);
		lblWeight.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblWeight);
		
		
		JLabel patientWeightField = new JLabel("");
		patientWeightField.setFont(new Font("Tahoma", Font.PLAIN, 27));
		patientWeightField.setBounds(422, 360, 58, 36);
		panel_2.add(patientWeightField);
		
		/*
		JTextField patientWeightField = new JTextField();
		patientWeightField.setBounds(280, 223, 58, 22);
		patientWeightField.setFont(new Font("Verdana", Font.PLAIN, 12));
		panel_2.add(patientWeightField);
		patientWeightField.setColumns(10);
		*/
		
		//condition
		JLabel lblCondition = new JLabel("Condition:");
		lblCondition.setBounds(239, 425, 169, 35);
		lblCondition.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblCondition);
		
		JCheckBox chckbxHealthyCondition = new JCheckBox("Healthy");
		chckbxHealthyCondition.setBounds(418, 425, 112, 35);
		chckbxHealthyCondition.setBackground(Color.BLACK);
		chckbxHealthyCondition.setFont(new Font("Verdana", Font.PLAIN, 20));
		chckbxHealthyCondition.setForeground(Color.GREEN);
		panel_2.add(chckbxHealthyCondition);
		
		JCheckBox chckbxRiskyCondition = new JCheckBox("Risky");
		chckbxRiskyCondition.setBounds(554, 425, 98, 35);
		chckbxRiskyCondition.setBackground(Color.DARK_GRAY);
		chckbxRiskyCondition.setForeground(Color.YELLOW);
		chckbxRiskyCondition.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel_2.add(chckbxRiskyCondition);
		
		JCheckBox chckbxCriticalCondition = new JCheckBox("Critical");
		chckbxCriticalCondition.setBounds(676, 425, 112, 35);
		chckbxCriticalCondition.setBackground(Color.BLACK);
		chckbxCriticalCondition.setForeground(Color.RED);
		chckbxCriticalCondition.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel_2.add(chckbxCriticalCondition);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(chckbxHealthyCondition);
		group1.add(chckbxRiskyCondition);
		group1.add(chckbxCriticalCondition);
		
		//disease
		JLabel lblDisease = new JLabel("Disease:");
		lblDisease.setBounds(267, 489, 144, 35);
		lblDisease.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblDisease);
		
		JTextField fldPatientDisease = new JTextField();
		fldPatientDisease.setBounds(422, 489, 231, 36);
		fldPatientDisease.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel_2.add(fldPatientDisease);
		fldPatientDisease.setColumns(10);
		
		
		//diagnosis
		JLabel lblDRUGPRESCRIBED = new JLabel("DRUG PRESCRIBED:");
		lblDRUGPRESCRIBED.setBounds(91, 553, 321, 35);
		lblDRUGPRESCRIBED.setFont(new Font("Verdana", Font.PLAIN, 30));
		panel_2.add(lblDRUGPRESCRIBED);
		
		JTextField DRUGPRESCRIBEDField = new JTextField();
		DRUGPRESCRIBEDField.setBounds(422, 553, 337, 36);
		DRUGPRESCRIBEDField.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel_2.add(DRUGPRESCRIBEDField);
		DRUGPRESCRIBEDField.setColumns(10);
		
		
		//outside box panel button
		Button SubmitBtn = new Button("Submit");
		SubmitBtn.setBounds(951, 697, 134, 43);
		SubmitBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(SubmitBtn);
		
		Button CancelBtn = new Button("Cancel");
		CancelBtn.setBounds(1141, 697, 134, 43);
		CancelBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(CancelBtn);
		
		
		
		btnSearchPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Patient p = new Patient();
					int bedNum = Integer.parseInt(BedNoField.getText());
					
					p.setBedNum(bedNum);
					p.findPatientByBedNum();
					
					if(BedNoField.getText().trim().length() == 0) {
						
						panel_2.repaint();
						
						fldPatientName.setText("");
						patientHeightField.setText("");
						patientWeightField.setText("");
						p.clear();
						
						
					}
					else if(p.isGetPatient() == false) 
					{
						panel_2.repaint();
						
						fldPatientName.setText("");
						patientHeightField.setText("");
						patientWeightField.setText("");
						p.clear();
						
					}
					else 
					{
						panel_2.repaint();
						
						fldPatientName.setText(p.getPatientName());
						patientHeightField.setText(Integer.toString(p.getPatientHeight()));
						patientWeightField.setText(Integer.toString(p.getPatientWeight()));
						pName = p.getPatientName();
						icNum = p.getNricNum();
						pID = p.getPatientID();
						p.clear();
						
					}
					
					
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		
		SubmitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					
					MedicalPrescription mp  = new MedicalPrescription();
					mp.searchMpID(pName, icNum);
					
					
					if(BedNoField.getText().trim().length() == 0 || EmpIDField.getText().trim().length() == 0 || fldPatientDisease.getText().trim().length() == 0 || DRUGPRESCRIBEDField.getText().trim().length() == 0) 
					{
						panel_2.repaint();
					}				
					else {	
				
						if(chckbxHealthyCondition.isSelected()) 
						{		
							mp.insertMP(pID,EmpIDField.getText(), fldPatientDisease.getText(),1, DRUGPRESCRIBEDField.getText());
						}else if(chckbxRiskyCondition.isSelected())
						{
							mp.insertMP(pID,EmpIDField.getText(), fldPatientDisease.getText(),2, DRUGPRESCRIBEDField.getText());
						}else if (chckbxCriticalCondition.isSelected())
						{
							mp.insertMP(pID,EmpIDField.getText(), fldPatientDisease.getText(),3, DRUGPRESCRIBEDField.getText());	
						}
					}
					
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
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
		

		JLabel thumb = new JLabel();
		thumb.setBounds(0, 0, 1370, 800);
		panel.add(thumb);
		thumb.setBackground(new Color(255, 255, 255));
		thumb.setIcon(new ImageIcon("C:\\Users\\Haston Ng\\eclipse-workspace\\Over Surgery System\\src\\mainpageImg.jpg"));
		
		
		Window.update();
	}
}
