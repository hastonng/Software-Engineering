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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import javax.swing.JSpinner;

public class checkAvaibilityPage 
{
	
	private static String currentDate;
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show() 
	{
		JPanel panel = Window.getCleanContentPane();
		
		 panel.setBackground(new Color(176, 224, 230));
	        panel.setBounds(0, 0, 10000, 10000);
	        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setLayout(null);
			
			
			//box panel
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(SystemColor.menu);
				panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
				panel_2.setBounds(74, 35, 1230, 643);
				panel.add(panel_2);
				panel_2.setLayout(null);
				
				JLabel lblNewLabel_1 = new JLabel("Check Availability");
				lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 20));
				lblNewLabel_1.setBounds(522, 22, 210, 30);
				panel_2.add(lblNewLabel_1);
				
				
				//calender part
				
				JPanel panel_3 = new JPanel();
				panel_3.setBackground(UIManager.getColor("Viewport.background"));
				panel_3.setBounds(21, 82, 508, 550);
				panel_2.add(panel_3);
				panel_3.setLayout(null);
				
				JCalendar calendar = new JCalendar();
				calendar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				calendar.setBounds(0, 0, 508, 550);
				panel_3.add(calendar);
				
				
				
				//Gp part

				JPanel gpPanel = new JPanel();
				gpPanel.setBackground(new Color(176, 224, 230));
				gpPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
				gpPanel.setBounds(553, 82, 653, 262);
				panel_2.add(gpPanel);
				gpPanel.setLayout(null);
				
				JLabel lblGPID = new JLabel("General Practitioner ID:");
				lblGPID.setBounds(31, 12, 306, 30);
				lblGPID.setFont(new Font("Verdana", Font.PLAIN, 25));
				gpPanel.add(lblGPID);
				
				JTextField GPIDField = new JTextField();
				GPIDField.setFont(new Font("Tahoma", Font.PLAIN, 25));
				GPIDField.setBounds(347, 12, 171, 30);
				gpPanel.add(GPIDField);
				GPIDField.setColumns(10);
				
				Button GPOkBtn = new Button("Select");
				GPOkBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
				GPOkBtn.setBounds(540, 12, 92, 37);
				gpPanel.add(GPOkBtn);
				
				JLabel lblStartNonAvailable = new JLabel("Start Non Available Date:");
				lblStartNonAvailable.setFont(new Font("Verdana", Font.PLAIN, 20));
				lblStartNonAvailable.setBounds(59, 80, 336, 23);
				gpPanel.add(lblStartNonAvailable);
				
				JLabel GPstartDateField = new JLabel();
				GPstartDateField.setFont(new Font("Tahoma", Font.PLAIN, 22));
				GPstartDateField.setLabelFor(lblStartNonAvailable);
				GPstartDateField.setBounds(334, 73, 162, 30);
				gpPanel.add(GPstartDateField);
				
				/*
				JTextField GPendDateField = new JTextField();
				GPendDateField.setColumns(10);
				GPendDateField.setBounds(502, 67, 77, 23);
				gpPanel.add(GPendDateField);
				*/
				
				JLabel lblStartNonAvailable_1 = new JLabel("Start Non Available Time:");
				lblStartNonAvailable_1.setFont(new Font("Verdana", Font.PLAIN, 20));
				lblStartNonAvailable_1.setBounds(59, 118, 268, 23);
				gpPanel.add(lblStartNonAvailable_1);
				
				JLabel GPstartTimeField = new JLabel();
				GPstartTimeField.setFont(new Font("Tahoma", Font.PLAIN, 22));
				GPstartTimeField.setLabelFor(lblStartNonAvailable_1);
				GPstartTimeField.setBounds(334, 111, 161, 30);
				gpPanel.add(GPstartTimeField);
				
				/*
				JTextField GPstartTimeField = new JTextField();
				GPstartTimeField.setColumns(10);
				GPstartTimeField.setBounds(201, 127, 77, 23);
				gpPanel.add(GPstartTimeField);
				*/
				
				JLabel lblEndNonAvailable_1 = new JLabel("End Non Available Time:");
				lblEndNonAvailable_1.setFont(new Font("Verdana", Font.PLAIN, 20));
				lblEndNonAvailable_1.setBounds(69, 162, 259, 23);
				gpPanel.add(lblEndNonAvailable_1);
				
				JLabel GPendTimeField = new JLabel();
				GPendTimeField.setFont(new Font("Tahoma", Font.PLAIN, 22));
				GPendTimeField.setLabelFor(lblEndNonAvailable_1);
				GPendTimeField.setBounds(334, 155, 162, 30);
				gpPanel.add(GPendTimeField);
				
				JLabel lblGPResult = new JLabel();
				lblGPResult.setFont(new Font("Verdana", Font.PLAIN, 20));
				lblGPResult.setBounds(107, 209, 469, 30);
				gpPanel.add(lblGPResult);
				
				/*
				JTextField GPendTimeField = new JTextField();
				GPendTimeField.setColumns(10);
				GPendTimeField.setBounds(502, 127, 77, 23);
				gpPanel.add(GPendTimeField);
				*/
				
				
				
				//nurse part
				JPanel nursePanel = new JPanel();
				nursePanel.setBackground(new Color(176, 224, 230));
				nursePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
				nursePanel.setBounds(553, 370, 653, 262);
				panel_2.add(nursePanel);
				nursePanel.setLayout(null);
				
				JLabel lblNurseAvability = new JLabel("Nurse ID:");
				lblNurseAvability.setBounds(210, 17, 131, 37);
				nursePanel.add(lblNurseAvability);
				lblNurseAvability.setFont(new Font("Verdana", Font.PLAIN, 25));
				
				JTextField NurseIDField = new JTextField();
				NurseIDField.setFont(new Font("Tahoma", Font.PLAIN, 25));
				NurseIDField.setBounds(351, 20, 172, 30);
				nursePanel.add(NurseIDField);
				NurseIDField.setColumns(10);
				
				Button NurseOkBtn = new Button("Select");
				NurseOkBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
				NurseOkBtn.setBounds(540, 20, 92, 37);
				nursePanel.add(NurseOkBtn);
				
				JLabel NurseStartDatelabel = new JLabel("Start Non Available Date:");
				NurseStartDatelabel.setFont(new Font("Verdana", Font.PLAIN, 20));
				NurseStartDatelabel.setBounds(75, 77, 268, 23);
				nursePanel.add(NurseStartDatelabel);
				
				/*
				JTextField NurseEndDateField = new JTextField();
				NurseEndDateField.setColumns(10);
				NurseEndDateField.setBounds(502, 77, 77, 23);
				nursePanel.add(NurseEndDateField);
				*/
				
				JLabel nurseStartTimelabel = new JLabel("Start Non Available Time:");
				nurseStartTimelabel.setFont(new Font("Verdana", Font.PLAIN, 20));
				nurseStartTimelabel.setBounds(73, 128, 268, 23);
				nursePanel.add(nurseStartTimelabel);
				/*
				JTextField NurseStartTimeField = new JTextField();
				NurseStartTimeField.setColumns(10);
				NurseStartTimeField.setBounds(202, 137, 77, 23);
				nursePanel.add(NurseStartTimeField);
				*/
				
				JLabel nurseEndTimelabel = new JLabel("End Non Available Time:");
				nurseEndTimelabel.setFont(new Font("Verdana", Font.PLAIN, 20));
				nurseEndTimelabel.setBounds(88, 176, 258, 23);
				nursePanel.add(nurseEndTimelabel);
				
				JLabel NurseStartDateField_1 = new JLabel();
				NurseStartDateField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
				NurseStartDateField_1.setBounds(351, 77, 234, 30);
				nursePanel.add(NurseStartDateField_1);
				NurseStartDateField_1.setLabelFor(NurseStartDatelabel);
				

				JLabel NurseStartTimeField_1 = new JLabel();
				NurseStartTimeField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
				NurseStartTimeField_1.setBounds(351, 128, 234, 30);
				nursePanel.add(NurseStartTimeField_1);
				NurseStartTimeField_1.setLabelFor(nurseStartTimelabel);
				
				JLabel NurseEndTimeField_1 = new JLabel();
				NurseEndTimeField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
				NurseEndTimeField_1.setBounds(351, 176, 234, 30);
				nursePanel.add(NurseEndTimeField_1);
				NurseEndTimeField_1.setLabelFor(nurseEndTimelabel);
				
				JLabel lblNurseResult = new JLabel();
				lblNurseResult.setFont(new Font("Verdana", Font.PLAIN, 20));
				lblNurseResult.setBounds(176, 219, 323, 30);
				nursePanel.add(lblNurseResult);
				/*
				JTextField NurseEndTimeField = new JTextField();
				NurseEndTimeField.setColumns(10);
				NurseEndTimeField.setBounds(502, 137, 77, 23);
				nursePanel.add(NurseEndTimeField);
				*/
				
				//outside box ok button
				Button okBtn = new Button("OK");
				okBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
				okBtn.setBounds(1265, 709, 82, 30);
				panel.add(okBtn);
				
				
				
					
				GPOkBtn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
							{
								SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
								Date cal = calendar.getDate();
								currentDate = date.format(cal);
								
								Employee emp = new Employee();
								
								
								emp.setEmployeeID(GPIDField.getText());
								emp.checkGpAvailability(currentDate);
								
								
								if(GPIDField.getText().trim().length() == 0) {
									gpPanel.repaint();
									GPstartDateField.setText("");
									GPstartTimeField.setText("");
									GPendTimeField.setText("");
									lblGPResult.setText("");
									emp.clear();
									
								}
								if (emp.isEmployeeAvailable() == true) {
									
									gpPanel.repaint();
									GPstartDateField.setText("-");
									GPstartTimeField.setText("-");
									GPendTimeField.setText("-");
									
									lblGPResult.setText("General Practitioner is Available !");
									emp.clear();
									
									
								}
								else {
									
									gpPanel.repaint();
									GPstartDateField.setText(emp.getStart_date());
									
									if(emp.getStart_time().equals("00:00:00") && emp.getEnd_time().equals("23:59:00")) {
										GPstartTimeField.setText("All Day");
										GPendTimeField.setText("All Day");
										lblGPResult.setText("");
										emp.clear();
									}else
									{
										GPstartTimeField.setText(emp.getStart_time());
										GPendTimeField.setText(emp.getEnd_time());
										lblGPResult.setText("");
										emp.clear();
									}
									
								}
								
								
								
							}
							catch (Exception ex)
							{
								ex.printStackTrace();
							}
					}
				});

				
			
				
				NurseOkBtn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
							{
								
							SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
							Date cal = calendar.getDate();
							currentDate = date.format(cal);
							
							Employee emp = new Employee();
							
							
							emp.setEmployeeID(NurseIDField.getText());
							emp.checkNurseAvailability(currentDate);
							

							if(NurseIDField.getText().trim().length() == 0) {
								nursePanel.repaint();
								NurseStartDateField_1.setText("");
								NurseStartTimeField_1.setText("");
								NurseEndTimeField_1.setText("");
								lblNurseResult.setText("");
								emp.clear();
								
							}
							if (emp.isEmployeeAvailable() == true) {
								
								nursePanel.repaint();
								NurseStartDateField_1.setText("-");
								NurseStartTimeField_1.setText("-");
								NurseEndTimeField_1.setText("-");
								lblNurseResult.setText("Nurse Is Available !");
								
								emp.clear();
								
								
							}else {
								nursePanel.repaint();
								NurseStartDateField_1.setText(emp.getStart_date());
								
								if(emp.getStart_time().equals("00:00:00") && emp.getEnd_time().equals("23:59:00")) {
									NurseStartTimeField_1.setText("All Day");
									NurseEndTimeField_1.setText("All Day");
									lblNurseResult.setText("");
									emp.clear();
								}else
								{
									NurseStartTimeField_1.setText(emp.getStart_time());
									NurseEndTimeField_1.setText(emp.getEnd_time());
									lblNurseResult.setText("");
									emp.clear();
								}
								
							}
							
							
							}
							catch (Exception ex)
							{
								ex.printStackTrace();
							}
					}
				});

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
