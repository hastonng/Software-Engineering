import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class setNurseAvailabilityPage 
{
	
	private static String startDate;
	private static String endDate;
	private static String startTime;
	private static String endTime;
	
	
	public static void show()  
	{
		JPanel panel = Window.getCleanContentPane();
		
		panel.setBackground(Color.WHITE);
	    panel.setBounds(0, 0, 10000, 10000);
	    panel.setBorder(new EmptyBorder(5, 5, 5, 5));
	    panel.setLayout(null);
	    
	    Button btnOkButton = new Button("OK");
		btnOkButton.setBounds(1236, 702, 100, 37);
		panel.add(btnOkButton);
		btnOkButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		Button btnCancel = new Button("Cancel");
		btnCancel.setBounds(1093, 702, 100, 37);
		panel.add(btnCancel);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
		//box panel
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(134, 11, 1103, 685);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Set Nurse Availability");
        lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 30));
        lblNewLabel_2.setBounds(370, 0, 598, 47);
        panel_2.add(lblNewLabel_2);
        
        
        JLabel lblNurse_ID = new JLabel("Employee ID:");
        lblNurse_ID.setBounds(26, 58, 165, 30);
        lblNurse_ID.setFont(new Font("Tahoma", Font.PLAIN, 25));
        panel_2.add(lblNurse_ID);
        
        JTextField Nurse_IDField = new JTextField();
        Nurse_IDField.setFont(new Font("Tahoma", Font.PLAIN, 24));
        Nurse_IDField.setBounds(187, 58, 148, 30);
        panel_2.add(Nurse_IDField);
        Nurse_IDField.setColumns(10);
        
        JLabel startDatelbl = new JLabel("Start Date\r\n:");
        startDatelbl.setFont(new Font("Tahoma", Font.PLAIN, 25));
        startDatelbl.setBounds(53, 119, 134, 23);
        panel_2.add(startDatelbl);
        
        JLabel lblEndDate = new JLabel("End Date\r\n:");
        lblEndDate.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblEndDate.setBounds(53, 408, 120, 23);
        panel_2.add(lblEndDate);
        
        JLabel lblEndTime = new JLabel("End Time\r\n:");
        lblEndTime.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblEndTime.setBounds(749, 412, 125, 23);
        panel_2.add(lblEndTime);
        
        JSpinner StartSpinner = new JSpinner(new SpinnerDateModel());
        StartSpinner.setFont(new Font("Tahoma", Font.PLAIN, 25));
        StartSpinner.setBounds(874, 119, 192, 30);
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(StartSpinner, "HH:mm");
        StartSpinner.setEditor(timeEditor);
        StartSpinner.setValue(new Date());
        panel_2.add(StartSpinner);
        
        JLabel lblStartTime = new JLabel("Start Time\n:");
        lblStartTime.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblStartTime.setBounds(731, 123, 143, 23);
        panel_2.add(lblStartTime);
        
        JSpinner EndSpinner = new JSpinner(new SpinnerDateModel());
        EndSpinner.setFont(new Font("Tahoma", Font.PLAIN, 25));
        EndSpinner.setBounds(874, 408, 192, 30);
        JSpinner.DateEditor timeEditor_1 = new JSpinner.DateEditor(EndSpinner, "HH:mm");
        EndSpinner.setEditor(timeEditor_1);
        EndSpinner.setValue(new Date());
        panel_2.add(EndSpinner);
        
        JCalendar Startcalendar = new JCalendar();
        Startcalendar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        Startcalendar.setBounds(187, 119, 497, 255);
        panel_2.add(Startcalendar);
        
        JCalendar Endcalendar = new JCalendar();
        Endcalendar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        Endcalendar.setBounds(184, 406, 497, 255);
        panel_2.add(Endcalendar);
        
        JLabel thumb = new JLabel();
		thumb.setBounds(0, 0, 1370, 800);
		panel.add(thumb);
		thumb.setBackground(new Color(255, 255, 255));
		thumb.setIcon(new ImageIcon("C:\\Users\\Haston Ng\\eclipse-workspace\\Over Surgery System\\src\\mainpageImg.jpg"));
        
		 btnOkButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
					{
					Employee emp = new Employee();
					emp.employeeExistDetails(Nurse_IDField.getText());
				
					SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
					SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
					
					 Date startCal = Startcalendar.getDate();
					 Date endCal = Endcalendar.getDate();
					 Object sTime = StartSpinner.getValue(); 
					 Object eTime = EndSpinner.getValue();
					 
					 startDate = date.format(startCal);
					 endDate = date.format(endCal);
					 startTime = time.format(sTime);
					 endTime = time.format(eTime);
				
					
					if(Nurse_IDField.getText().trim().length() == 0 ) {
						setGPAvailabilityPage.show();
						emp.clear();
					}
					if(emp.isEmployeeExist() == false) 
					{
						setGPAvailabilityPage.show();
						emp.clear();
					}
					else 
					{
						emp.generateId();
						emp.setNurseAvailable(Nurse_IDField.getText(), startDate, endDate, startTime, endTime);
						emp.clear();
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
						SetAvailabilityPage.show();
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
