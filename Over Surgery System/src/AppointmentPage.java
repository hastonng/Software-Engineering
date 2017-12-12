import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;

import com.toedter.calendar.JCalendar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

public class AppointmentPage
{
	
	private static String currentDate;
	private static String startTime;
	private static String endTime;
	private static int nurseCount = 0;
	private static int gpCount = 0;
	private static String gpId;
	
	static JPanel gpPanel = new JPanel();
	static JPanel firstNursePanel = new JPanel();
	static JPanel secondNursePanel = new JPanel();
	
	
	
//selectedGP
static JLabel lblSelectedGeneralPractitioner = new JLabel("Selected General Practitioner:");
static JLabel lblGPName = new JLabel("Name:");
static JLabel GPNameField = new JLabel();
static JLabel lblGPID = new JLabel("ID:");
static JLabel gpIdField = new JLabel();
static JLabel GPEmaillbl = new JLabel("Email:");
static JLabel GPEmailField = new JLabel();
static JLabel lblGPContactNumber = new JLabel("Contact Number:");
static JLabel GPContactNumField = new JLabel();
static JButton gpCancelBtn = new JButton("X");

//FNurse
static JLabel lblSelectedFirstNurse = new JLabel("Selected First Nurse:");
static JLabel lblFNurseName = new JLabel("Name:");
static JLabel FNurseNameField = new JLabel();
static JLabel lblFNurseID = new JLabel("ID:");
static JLabel FNurseIDField = new JLabel();
static JLabel lblFNurseEmail = new JLabel("Email:");
static JLabel FNurseEmailField = new JLabel();
static JLabel lblFNurseNo = new JLabel("Contact Number:");
static JLabel FNurseNoField = new JLabel();
static JButton fCancelButton = new JButton("X");


//SNurse
static JLabel lblSelectedSecondNurse = new JLabel("Selected Second Nurse:");
static JLabel lblSNurseName = new JLabel("Name:");
static JLabel SNurseNameField = new JLabel();
static JLabel SNurseID = new JLabel("ID:");
static JLabel SNurseIDField = new JLabel();
static JLabel lblSNurseEmail = new JLabel("Email:");
static JLabel SNurseEmailField = new JLabel();
static JLabel lblSNurseNo = new JLabel("Contact Number:");
static JLabel SNurseNoField = new JLabel();
static JButton sCancelButton = new JButton("X");
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show()
	{
        JPanel panel = Window.getCleanContentPane();
        //must add to all panel
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 10000, 10000);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
        
			
		gpPanel.setEnabled(false);
		firstNursePanel.setEnabled(false);
		secondNursePanel.setEnabled(false);
			
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2.setBounds(10, 28, 1350, 653);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMakeAppointment = new JLabel("Make Appointment");
		lblMakeAppointment.setBounds(566, 11, 221, 28);
		lblMakeAppointment.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		panel_2.add(lblMakeAppointment);
		
		
		JPanel patientPanel = new JPanel();
		patientPanel.setBackground(new Color(176, 224, 230));
		patientPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		patientPanel.setBounds(32, 56, 741, 81);
		panel_2.add(patientPanel);
		patientPanel.setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPatientName.setBounds(33, 11, 107, 20);
		patientPanel.add(lblPatientName);
		
		JTextField PatNameField = new JTextField();
		PatNameField.setBounds(145, 11, 138, 23);
		patientPanel.add(PatNameField);
		PatNameField.setColumns(10);
		
		JLabel lblNRIC = new JLabel("NRIC Number:");
		lblNRIC.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNRIC.setBounds(373, 12, 108, 20);
		patientPanel.add(lblNRIC);
		
		JTextField icNumField = new JTextField();
		icNumField.setBounds(486, 12, 107, 23);
		patientPanel.add(icNumField);
		icNumField.setColumns(10);
		
		Button patientBtn = new Button("Select");
		patientBtn.setBounds(618, 11, 55, 23);
		patientPanel.add(patientBtn);
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPatientId.setBounds(61, 47, 79, 20);
		patientPanel.add(lblPatientId);
		
		JLabel PatIdlbl = new JLabel();
		PatIdlbl.setBounds(145, 44, 31, 23);
		patientPanel.add(PatIdlbl);
		
		JLabel lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setBounds(486, 50, 130, 20);
		patientPanel.add(lblContactNumber);
		lblContactNumber.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JLabel ConNumlbl = new JLabel();
		ConNumlbl.setBounds(625, 47, 95, 23);
		patientPanel.add(ConNumlbl);
	
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(220, 47, 46, 20);
		patientPanel.add(lblEmail);
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		
		JLabel EmailLabel = new JLabel();
		EmailLabel.setBounds(271, 44, 191, 23);
		patientPanel.add(EmailLabel);
		
		//calender part
		JPanel calendarPanel = new JPanel();
		calendarPanel.setBounds(807, 50, 533, 549);
		panel_2.add(calendarPanel);
		calendarPanel.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		calendar.setBounds(10, 11, 513, 316);
		calendarPanel.add(calendar);
		
		JLabel lblStartTime = new JLabel("Start Time:");
		lblStartTime.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblStartTime.setBounds(188, 338, 85, 20);
		calendarPanel.add(lblStartTime);
		
		JSpinner StartSpinner = new JSpinner(new SpinnerDateModel());
		StartSpinner.setBounds(285, 335, 108, 31);
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(StartSpinner, "HH:mm");
		StartSpinner.setEditor(timeEditor);
		StartSpinner.setValue(new Date());
		calendarPanel.add(StartSpinner);
		
		JLabel lblEndTime = new JLabel("End Time:");
		lblEndTime.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblEndTime.setBounds(205, 384, 75, 20);
		calendarPanel.add(lblEndTime);
		
		JSpinner EndSpinner = new JSpinner(new SpinnerDateModel());
		EndSpinner.setBounds(285, 384, 108, 31);
		JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(EndSpinner, "HH:mm");
		EndSpinner.setEditor(timeEditor1);
		EndSpinner.setValue(new Date());
		calendarPanel.add(EndSpinner);
		
		JLabel lblResult1 = new JLabel("");
		lblResult1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblResult1.setBounds(188, 451, 298, 37);
		calendarPanel.add(lblResult1);
		
		JLabel lblResult2 = new JLabel("");
		lblResult2.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblResult2.setBounds(188, 501, 180, 37);
		calendarPanel.add(lblResult2);
		
		Button GPSelectBtn = new Button("Add");
		GPSelectBtn.setBounds(410, 181, 62, 22);
		panel_2.add(GPSelectBtn);
		
		JTextField GPIDField = new JTextField();
		GPIDField.setColumns(10);
		GPIDField.setBounds(198, 181, 188, 23);
		panel_2.add(GPIDField);
		
		JLabel lblGPId = new JLabel("General Practitioner ID:");
		lblGPId.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblGPId.setBounds(20, 179, 174, 20);
		panel_2.add(lblGPId);
		
		JLabel lblNurseId = new JLabel("Nurse ID:");
		lblNurseId.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNurseId.setBounds(123, 226, 82, 20);
		panel_2.add(lblNurseId);
		
		JTextField NurseField = new JTextField();
		NurseField.setColumns(10);
		NurseField.setBounds(198, 228, 188, 23);
		panel_2.add(NurseField);
		
		Button NurseSelectBtn = new Button("Add");
		NurseSelectBtn.setBounds(410, 229, 62, 22);
		panel_2.add(NurseSelectBtn);
		
	
		//outside box button part
		Button btnConfirm = new Button("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnConfirm.setBounds(1250, 698, 106, 41);
		panel.add(btnConfirm);
		
		Button btnCancel = new Button("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCancel.setBounds(1102, 698, 106, 41);
		panel.add(btnCancel);
		
		patientBtn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
						{
							Patient p = new Patient();
							
							p.findPatient(PatNameField.getText(), icNumField.getText());
							
							
							if(p.isGetPatient() == false) {
								
								calendarPanel.repaint();
								lblResult1.setText("Invalid Patient.");
								p.clear();
							}
							else 
							{
								lblResult1.setText("");
								lblResult2.setText("");
								calendarPanel.repaint();
								
								PatIdlbl.setText(Integer.toString(p.getPatientID()));
								EmailLabel.setText(p.getEmail());
								ConNumlbl.setText(p.getPhoneNum());
								p.clear();
							}
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
				}
			});
		
			
			
			
			GPSelectBtn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
						{
							
							
							lblResult1.setText("");
							lblResult2.setText("");
							calendarPanel.repaint();
							
							Employee emp = new Employee();
							emp.clear();
							emp.employeeExistDetails(GPIDField.getText());
							
							if(emp.isEmployeeExist() == false) {
								
								
								calendarPanel.repaint();
								lblResult1.setText("No Employee Exist");
								emp.clear();
								
							}
							else if (emp.isEmployeeExist() == true)
							{
								

								gpPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
								gpPanel.setBounds(24, 273, 243, 356);
								panel_2.add(gpPanel);
								gpPanel.setLayout(null);
								gpPanel.setEnabled(true);
								gpPanel.setVisible(true);
								
								gpPanel.repaint();
								
								
								lblSelectedGeneralPractitioner.setFont(new Font("Tahoma", Font.BOLD, 15));
								lblSelectedGeneralPractitioner.setBounds(5, 0, 228, 26);
								gpPanel.add(lblSelectedGeneralPractitioner);
								
								
								
								
								//GP Name
								lblGPName.setBounds(15, 37, 64, 20);
								gpPanel.add(lblGPName);
								lblGPName.setFont(new Font("Verdana", Font.PLAIN, 15));
								
								
								GPNameField.setBounds(15, 66, 208, 32);
								gpPanel.add(GPNameField);
								GPNameField.setText(emp.getEmployeeName());
								
								//GP Id
								lblGPID.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblGPID.setBounds(15, 109, 34, 20);
								gpPanel.add(lblGPID);
								
								
								gpIdField.setBounds(45, 107, 115, 32);
								gpPanel.add(gpIdField);
								gpIdField.setText(emp.getEmployeeID());
								
								//GP Email
								GPEmaillbl.setBounds(15, 158, 46, 20);
								gpPanel.add(GPEmaillbl);
								GPEmaillbl.setFont(new Font("Verdana", Font.PLAIN, 15));
								
								
								GPEmailField.setBounds(15, 189, 218, 23);
								gpPanel.add(GPEmailField);
								GPEmailField.setText(emp.getEmail());
								
								//GP Phone Number
								lblGPContactNumber.setBounds(15, 224, 138, 20);
								gpPanel.add(lblGPContactNumber);
								lblGPContactNumber.setFont(new Font("Verdana", Font.PLAIN, 15));
								
								
								GPContactNumField.setBounds(15, 255, 145, 23);
								gpPanel.add(GPContactNumField);
								GPContactNumField.setText(emp.getPhoneNum());
								
								gpCancelBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
								gpCancelBtn.setBounds(99, 289, 61, 56);
								gpPanel.add(gpCancelBtn);
								
								gpCancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
							        public void mouseEntered(java.awt.event.MouseEvent evt) {                
							        	gpCancelBtn.setSize(65,60);                
							        }
							    });
								gpCount = gpCount + 1;
								
								emp.clear();
								
								if(gpCount == 1) 
								{
									GPSelectBtn.setEnabled(false);
									GPIDField.setText(null);
									
								}
								
								
							}
							
						}
						
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
				}
			});
			
			
			
			
			NurseSelectBtn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
						{
						
						lblResult1.setText("");
						lblResult2.setText("");
						calendarPanel.repaint();
						
						Employee emp = new Employee();
						emp.clear();
						emp.employeeExistDetails(NurseField.getText());
						
						
						if(emp.isEmployeeExist() ==  false)
						{
							
							calendarPanel.repaint();
							lblResult1.setText("No Employee Exist");
							emp.clear();
							
						}
						else if (emp.isEmployeeExist() == true) {
							
							
							if(nurseCount == 0) {
								
								firstNursePanel.setLayout(null);
								firstNursePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
								firstNursePanel.setBounds(287, 273, 243, 356);
								panel_2.add(firstNursePanel);
								firstNursePanel.setEnabled(true);
								firstNursePanel.setVisible(true);
								
								firstNursePanel.repaint();
								
								
								lblSelectedFirstNurse.setFont(new Font("Tahoma", Font.BOLD, 15));
								lblSelectedFirstNurse.setBounds(5, 0, 195, 26);
								firstNursePanel.add(lblSelectedFirstNurse);
								
								
								//First Nurse Name
								lblFNurseName.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseName.setBounds(15, 37, 64, 20);
								firstNursePanel.add(lblFNurseName);
								
								
								FNurseNameField.setBounds(15, 66, 208, 32);
								firstNursePanel.add(FNurseNameField);
								FNurseNameField.setText(emp.getEmployeeName());
								
								
								//First Nurse ID
								lblFNurseID.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseID.setBounds(15, 109, 34, 20);
								firstNursePanel.add(lblFNurseID);
								
								
								FNurseIDField.setBounds(45, 107, 115, 32);
								firstNursePanel.add(FNurseIDField);
								FNurseIDField.setText(emp.getEmployeeID());
								
								
								//First Nurse Email
								lblFNurseEmail.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseEmail.setBounds(15, 158, 46, 20);
								firstNursePanel.add(lblFNurseEmail);
								
								
								FNurseEmailField.setBounds(15, 189, 218, 23);
								firstNursePanel.add(FNurseEmailField);
								FNurseEmailField.setText(emp.getEmail());
								
								
								//First Nurse Phone Number
								lblFNurseNo.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseNo.setBounds(15, 224, 138, 20);
								firstNursePanel.add(lblFNurseNo);
								
								
								FNurseNoField.setBounds(15, 255, 145, 23);
								firstNursePanel.add(FNurseNoField);
								FNurseNoField.setText(emp.getPhoneNum());
								
								
								fCancelButton.setFont(new Font("Tahoma", Font.BOLD, 15));
								fCancelButton.setBounds(99, 289, 61, 56);
								firstNursePanel.add(fCancelButton);
								
								fCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
							        public void mouseEntered(java.awt.event.MouseEvent evt) {                
							        	fCancelButton.setSize(65,60);                
							        }
							    });
								
								nurseCount = nurseCount + 1;
								
								emp.clear();
								
								NurseField.setText(null);

								
							}
							else if (nurseCount == 1) 
							{
								
								if(NurseField.getText().equals(FNurseIDField.getText())) {
									
									calendarPanel.repaint();
									lblResult1.setText("This Employee is Selected !");
									NurseField.setText(null);
									emp.clear();
								}
								
								secondNursePanel.setLayout(null);
								secondNursePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
								secondNursePanel.setBounds(554, 273, 243, 356);
								panel_2.add(secondNursePanel);
								secondNursePanel.setEnabled(true);
								secondNursePanel.setVisible(true);
								
								secondNursePanel.repaint();
								
								
								lblSelectedSecondNurse.setFont(new Font("Tahoma", Font.BOLD, 15));
								lblSelectedSecondNurse.setBounds(5, 0, 195, 26);
								secondNursePanel.add(lblSelectedSecondNurse);
								
								
								//Second Nurse Name
								lblSNurseName.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblSNurseName.setBounds(15, 37, 64, 20);
								secondNursePanel.add(lblSNurseName);
								
								
								SNurseNameField.setBounds(15, 66, 208, 32);
								secondNursePanel.add(SNurseNameField);
								SNurseNameField.setText(emp.getEmployeeName());
								
								//Second Nurse ID
								SNurseID.setFont(new Font("Verdana", Font.PLAIN, 15));
								SNurseID.setBounds(15, 109, 34, 20);
								secondNursePanel.add(SNurseID);
								
								
								SNurseIDField.setBounds(45, 107, 115, 32);
								secondNursePanel.add(SNurseIDField);
								SNurseIDField.setText(emp.getEmployeeID());
								
								
								//Second Nurse Email
								lblSNurseEmail.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblSNurseEmail.setBounds(15, 158, 46, 20);
								secondNursePanel.add(lblSNurseEmail);
								
								
								SNurseEmailField.setBounds(15, 189, 218, 23);
								secondNursePanel.add(SNurseEmailField);
								SNurseEmailField.setText(emp.getEmail());
								
								//Second Nurse Phone Number
								lblSNurseNo.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblSNurseNo.setBounds(15, 224, 138, 20);
								secondNursePanel.add(lblSNurseNo);
								
								
								SNurseNoField.setBounds(15, 255, 145, 23);
								secondNursePanel.add(SNurseNoField);
								SNurseNoField.setText(emp.getPhoneNum());
								
								sCancelButton.setFont(new Font("Tahoma", Font.BOLD, 15));
								sCancelButton.setBounds(99, 289, 61, 56);
								secondNursePanel.add(sCancelButton);
								
								sCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
							        public void mouseEntered(java.awt.event.MouseEvent evt) {                
							        	sCancelButton.setSize(65,60);                
							        }
							    });
								
								nurseCount = nurseCount + 1;
								
								emp.clear();
								
								if(nurseCount == 2) {
									NurseSelectBtn.setEnabled(false);
									NurseField.setText(null);
								}
							}
						}
						
						
										
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
				}
			});

			
			gpCancelBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						lblResult1.setText("");
						lblResult2.setText("");
						calendarPanel.repaint();
						
						
						gpCount = gpCount - 1;
						gpPanel.setVisible(false);
						gpPanel.setEnabled(false);
						GPSelectBtn.setEnabled(true);
						gpPanel.repaint();
						
						
						
					}catch(Exception ex) {
						
					}
				}
			});
			
			
			
			
			fCancelButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
						{
							if(nurseCount == 2) {
								
								lblResult1.setText("");
								lblResult2.setText("");
								calendarPanel.repaint();
								
								
								firstNursePanel.setLayout(null);
								firstNursePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
								firstNursePanel.setBounds(287, 273, 243, 356);
								panel_2.add(firstNursePanel);
								firstNursePanel.setVisible(true);
								firstNursePanel.setEnabled(true);
								
								
								NurseSelectBtn.setEnabled(true);
								secondNursePanel.setVisible(false);
								secondNursePanel.setEnabled(false);
								nurseCount = nurseCount - 1;
								
								firstNursePanel.repaint();
								
								lblSelectedFirstNurse.setFont(new Font("Tahoma", Font.BOLD, 15));
								lblSelectedFirstNurse.setBounds(5, 0, 195, 26);
								firstNursePanel.add(lblSelectedFirstNurse);
								
								
								//First Nurse Name
								lblFNurseName.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseName.setBounds(15, 37, 64, 20);
								firstNursePanel.add(lblFNurseName);
								
								FNurseNameField.setBounds(15, 66, 208, 32);
								firstNursePanel.add(FNurseNameField);
								FNurseNameField.setText(SNurseNameField.getText());
								
								
								//First Nurse Id
								lblFNurseID.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseID.setBounds(15, 109, 34, 20);
								firstNursePanel.add(lblFNurseID);
								
								FNurseIDField.setBounds(45, 107, 115, 32);
								firstNursePanel.add(FNurseIDField);
								FNurseIDField.setText(SNurseIDField.getText());
								
								
								//First Nurse Email
								lblFNurseEmail.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseEmail.setBounds(15, 158, 46, 20);
								firstNursePanel.add(lblFNurseEmail);
								
								FNurseEmailField.setBounds(15, 189, 218, 23);
								firstNursePanel.add(FNurseEmailField);
								FNurseEmailField.setText(SNurseEmailField.getText());
								
								
								
								
								//First Nurse Phone Number
								lblFNurseNo.setFont(new Font("Verdana", Font.PLAIN, 15));
								lblFNurseNo.setBounds(15, 224, 138, 20);
								firstNursePanel.add(lblFNurseNo);
								
								FNurseNoField.setBounds(15, 255, 145, 23);
								firstNursePanel.add(FNurseNoField);
								FNurseNoField.setText(SNurseNoField.getText());
								
								
								fCancelButton.setFont(new Font("Tahoma", Font.BOLD, 15));
								fCancelButton.setBounds(99, 289, 61, 56);
								firstNursePanel.add(fCancelButton);
								fCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
							        public void mouseEntered(java.awt.event.MouseEvent evt) {                
							        	fCancelButton.setSize(65,60);                
							        }
							    });
								
								
								
							
								
								
							}
							else if(nurseCount == 1)
							{
								
								lblResult1.setText("");
								lblResult2.setText("");
								calendarPanel.repaint();
								
								nurseCount = nurseCount - 1;
								firstNursePanel.repaint();
								firstNursePanel.setVisible(false);
								
							}
							
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
				}
			});
			
			
			sCancelButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
						{
							
						lblResult1.setText("");
						lblResult2.setText("");
						calendarPanel.repaint();
						
							NurseSelectBtn.setEnabled(true);
							secondNursePanel.setEnabled(false);
							secondNursePanel.repaint();
							secondNursePanel.setVisible(false);
							nurseCount = 1;
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
				}
			});
			
			
			btnConfirm.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
						{
						
							if(gpPanel.isEnabled() == true && (firstNursePanel.isEnabled() == true || secondNursePanel.isEnabled() == true)) 
							{
								SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
								SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
								
								 Date cal = calendar.getDate();
								 Object sTime = StartSpinner.getValue(); 
								 Object eTime = EndSpinner.getValue();
								 
								 
								 Date sValue = (Date)sTime;
								 Date eValue = (Date)eTime;
								
								 currentDate = date.format(cal);
								 startTime = time.format(sValue);
								 endTime = time.format(eValue);
								 
								if(PatIdlbl.getText().trim().length() == 0) {
									
									lblResult1.setText("<html>Invalid Patient. </html>");
									lblResult1.setFont(new Font("Tahoma", Font.PLAIN, 25));
									
								}else if (PatIdlbl.getText().trim().length() > 0) {
									
									if(firstNursePanel.isEnabled() == true && secondNursePanel.isEnabled() == false ) 
									{
										Appointments app = new Appointments();
										app.setAppointment(Integer.parseInt(PatIdlbl.getText()), gpIdField.getText(),FNurseIDField.getText(),null,currentDate, startTime, endTime,EmailLabel.getText(),GPEmailField.getText(),FNurseEmailField.getText(),null);
										
									}else if(secondNursePanel.isEnabled() == true && secondNursePanel.isEnabled() == true)
									{
										Appointments app = new Appointments();
										app.setAppointment(Integer.parseInt(PatIdlbl.getText()), gpIdField.getText(),FNurseIDField.getText(),SNurseIDField.getText(),currentDate, startTime, endTime,EmailLabel.getText(),GPEmailField.getText(),FNurseEmailField.getText(),SNurseEmailField.getText());
									}
								}
								
							}
							else 
							{
								
								lblResult1.setText("<html>Please Select at Least <b>ONE</b> General Practitioner and <b>ONE</b> Nurse</html>");
								lblResult1.setFont(new Font("Tahoma", Font.PLAIN, 25));
							}
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
				}
			});
		
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
		
		Window.update();
	}
}
