import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FindPatientPage
{
	
	
	private static Employee em;

	JLabel patientId = new JLabel();
	JLabel patientName = new JLabel();
	JLabel icNum = new JLabel();
	JLabel gender = new JLabel();
	JLabel dob = new JLabel();
	JLabel height = new JLabel();
	JLabel weight = new JLabel();
	JLabel phoneNum = new JLabel();
	JLabel address = new JLabel();
	JLabel email = new JLabel();
	JLabel appointment = new JLabel();
	JLabel patientCondition = new JLabel();
	JLabel patientDisease = new JLabel();
	JLabel patientDiagnosis = new JLabel();
	
	
	
	public static Employee getEmployeeId() {
		return em;
	}



	public static void setEmployeeId(Employee employeeId) {
		FindPatientPage.em = employeeId;
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public static void show()
	{
		
        JPanel panel = Window.getCleanContentPane();
		
      //box panel
      		JPanel panel_2 = new JPanel();
      		panel_2.setBounds(215, 141, 915, 381);
      		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
      		panel.add(panel_2);
      		panel_2.setLayout(null);
      		
      		JLabel lblFindPatient = new JLabel("Find Patient");
      		lblFindPatient.setFont(new Font("Verdana", Font.BOLD, 40));
      		lblFindPatient.setBounds(347, 11, 288, 54);
      		panel_2.add(lblFindPatient);

      		//patientName
      		JLabel lblpatientName = new JLabel("Patient Name: ");
      		lblpatientName.setBounds(66, 120, 229, 35);
      		panel_2.add(lblpatientName);
      		lblpatientName.setFont(new Font("Verdana", Font.PLAIN, 30));
      		
      		JTextField patientNameField = new JTextField();
      		patientNameField.setFont(new Font("Tahoma", Font.PLAIN, 27));
      		//new HighlightListener(patientNameField);
      		patientNameField.setBounds(288, 119, 220, 36);
      		panel_2.add(patientNameField);
      		patientNameField.setColumns(10);
      		
      		
      		JLabel lblNote = new JLabel("  ( Please key in full name according to IC )");
      		lblNote.setBounds(509, 129, 396, 30);
      		panel_2.add(lblNote);
      		lblNote.setFont(new Font("Georgia", Font.PLAIN, 20));
      		
      		 //icNum
      		JLabel lblicNum = new JLabel("IC Number: ");
      		lblicNum.setBounds(107, 195, 200, 30);
      		panel_2.add(lblicNum);
      		lblicNum.setFont(new Font("Verdana", Font.PLAIN, 30));
      		
      		JTextField icNumField = new JTextField();
      		icNumField.setFont(new Font("Tahoma", Font.PLAIN, 27));
      		//new HighlightListener(icNumField);
      		icNumField.setBounds(288, 189, 221, 36);
      		panel_2.add(icNumField);
      		icNumField.setColumns(10);
      		
      		JLabel lblICNote = new JLabel("  ( Without \"-\"  )" );
      		lblICNote.setBounds(509, 199, 185, 30);
      		panel_2.add(lblICNote);
      		lblICNote.setFont(new Font("Georgia", Font.PLAIN, 20));
      		
      		JLabel lblBedNo = new JLabel("Bed No:");
      		lblBedNo.setFont(new Font("Verdana", Font.PLAIN, 30));
      		lblBedNo.setBounds(165, 262, 136, 30);
      		panel_2.add(lblBedNo);
      		
      		JTextField bedNoField = new JTextField();
      		bedNoField.setFont(new Font("Tahoma", Font.PLAIN, 27));
      		bedNoField.setColumns(10);
      		bedNoField.setBounds(288, 260, 142, 36);
      		panel_2.add(bedNoField);
      		bedNoField.addKeyListener(new KeyAdapter() {
      			@Override
      			public void keyTyped(KeyEvent e) {
      				if (bedNoField.getText().length() >= 4)
      					e.consume();
      				else 
      				{	//set accept only interger
      					 char c = e.getKeyChar();
      					 if (!((c >= '0') && (c <= '9') ||
      						c == KeyEvent.VK_BACK_SPACE) ||
      						(c == KeyEvent.VK_DELETE)) {
      						 bedNoField.getToolkit().beep();
      		    	  		e.consume();
      				}
      				}
      			}
      		
      		});
      		
      		//button
      		Button findBtn = new Button("Find");
      		findBtn.setFont(new Font("Tahoma", Font.BOLD, 25));
      		findBtn.setBounds(842, 574, 134, 43);
      		panel.add(findBtn);
     
      		
      		Button cancelBtn = new Button("Cancel");
      		cancelBtn.setFont(new Font("Tahoma", Font.BOLD, 25));
      		cancelBtn.setBounds(387, 574, 134, 43);
      		panel.add(cancelBtn);
			
			
			
			
				findBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					
					if(patientNameField.getText().trim().length() == 0 || icNumField.getText().trim().length() == 0) {
						FindPatientPage.show();
					}
					else {
						Patient patient = new Patient();
						patient.findPatient(patientNameField.getText(),icNumField.getText());
						
						
						if(patient.isGetPatient() == true) {
							PatientDetailsPage.setP(patient);
							PatientDetailsPage.show();
						}
						else {
							
							panel.repaint(); // <-- Refresh the Page. 
							
							JLabel lblErrorMSG = new JLabel("Invalid Patient. \r\n Please Try Again.");
					        lblErrorMSG.setFont(new Font("Calibri", Font.BOLD, 20));
					        lblErrorMSG.setForeground(Color.RED);
					        lblErrorMSG.setBounds(180, 264, 407, 30);
					        panel_2.add(lblErrorMSG);
					        
							
						}
							
							
					}
					
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
			
		});
		
		
		
		
		cancelBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if(em.getRole() == 1) {
						MainPage.show();
					}else if(em.getRole() == 2 || em.getRole() == 3) {
						GPMainPage.show();
					}
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
