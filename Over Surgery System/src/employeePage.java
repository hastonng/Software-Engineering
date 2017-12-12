import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JCalendar;

public class employeePage
{
	private static String currentDate;
	private static String gpId;
	private static String nurseId;
	private static int rowCount = 0;
	
	static JTable EmployeeTable;
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



		JCalendar calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		calendar.setBounds(41, 115, 469, 507);
		panel.add(calendar);
		
		
        Button btnSelect = new Button("Select");
        btnSelect.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnSelect.setBounds(532, 115, 127, 30);
        panel.add(btnSelect);
        
        JLabel lblStaffOnDuty = new JLabel("Staff On Duty");
        lblStaffOnDuty.setFont(new Font("Verdana", Font.BOLD, 24));
        lblStaffOnDuty.setBounds(581, 11, 190, 60);
        panel.add(lblStaffOnDuty);
        
        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(680, 115, 660, 556);
        panel.add(tablePanel);
       

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 5,  660, 540);
		tablePanel.add(scrollPane);
		
		
		
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					
						tablePanel.removeAll();
						tablePanel.repaint();
						
						SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
						Object[][] rowData = {};
						Object[] columnNames = {"EMPLOYEE ID", "EMPLOYEE NAME","EMPLOYEE EMAIL","EMPLOYEE CONTACT NUMBER"};
						 
						DefaultTableModel listTableModel;
						listTableModel = new DefaultTableModel(rowData, columnNames);
						
						
						
						Date cal = calendar.getDate();
						currentDate = date.format(cal);
						
						
						Employee emp = new Employee();
						emp.clear();
						
						emp.getGpForTable(currentDate);
						gpId=emp.getEmployeeID();
						System.out.println(gpId);
						emp.clear();
						emp.getNurseForTable(currentDate);
						nurseId = emp.getEmployeeID();
						emp.clear();
						System.out.println(nurseId);
						
						String Sql = "select * from employee where EMPLOYEE_ID !='"+gpId+"' AND EMPLOYEE_ID !='"+nurseId+"';";
						Connection connection = ConnectionSingleton.getInstance();
						Statement stmt = connection.createStatement();
						ResultSet rs = stmt.executeQuery(Sql);
						
						while (rs.next()) {
							listTableModel.addRow(new Object[]{rs.getString("EMPLOYEE_ID"), rs.getString("EMPLOYEE_NAME"), rs.getString("EMAIL"), rs.getString("PHONE_NO")});
						}
					
						
						
						EmployeeTable = new JTable(listTableModel);
						EmployeeTable.setBounds(0, 5, 660, 554);
				   		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				   		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
				   		EmployeeTable.setDefaultRenderer(String.class, centerRenderer);
				   		EmployeeTable.setBackground(Color.WHITE);
				   		EmployeeTable.setFillsViewportHeight(false);
				 
				   		tablePanel.setLayout(null);
				   		EmployeeTable.getColumnModel().getColumn(0).setPreferredWidth(300);
				        EmployeeTable.getColumnModel().getColumn(1).setPreferredWidth(300);
				        EmployeeTable.getColumnModel().getColumn(2).setPreferredWidth(300);
				        EmployeeTable.getColumnModel().getColumn(3).setPreferredWidth(300);
				   		EmployeeTable.setRowHeight(25);
				   		EmployeeTable.setFont(new Font("Verdana",Font.PLAIN,15));
				   		EmployeeTable.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
						 
				   		
				   		
				   		tablePanel.add(EmployeeTable);
				   		tablePanel.repaint();
				   		EmployeeTable.setEnabled(true);
				
				
					
					
					 
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		
		
		
		Button btnOk = new Button("OK");
		btnOk.setBounds(1271, 699, 89, 40);
		panel.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
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