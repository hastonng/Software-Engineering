import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenu;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class MainPage
{
	private static Employee em;
	
	public static Employee getEm() {
		return em;
	}

	public static void setEm(Employee em) {
		MainPage.em = em;
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void show()
	{	
		
		JPanel panel = Window.getCleanContentPane();
		
        panel.setBounds(0, 0, 10000, 10000);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
		

        //register Patient part
  		BufferedImage rPatientImg = null;
  		try 
  		{
  			URL file = MainPage.class.getResource("registerPatients.png");
  			rPatientImg = ImageIO.read(file);
  		}
  		catch (IOException ioex)
  		{
  			System.err.println("load error: "+ ioex.getMessage());
  		}
  		ImageIcon rPatientIcon = new ImageIcon(rPatientImg);
  		panel.setLayout(null);
  		JButton RPatientBtn = new JButton(rPatientIcon);
  		RPatientBtn.setBounds(44, 234, 220, 220);
  		panel.add(RPatientBtn);
  		RPatientBtn.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e)
  			{
  				try 
  				{
  					registerPatientPage.show();
  				}
  				catch (Exception ex)
  				{
  					ex.printStackTrace();
  				}
  			}
  		});
  		
  		JLabel lblregisterPatient = new JLabel("Register Patient");
  		lblregisterPatient.setBounds(54, 465, 198, 57);
  		lblregisterPatient.setFont(new Font("Segoe UI", Font.BOLD, 25));
  		panel.add(lblregisterPatient);
  		
  		
  		//Find Patient part
  		BufferedImage fPatientImg = null;
  		try 
  		{
  			URL file = MainPage.class.getResource("findPatient.png");
  			fPatientImg = ImageIO.read(file);
  		}
  		catch (IOException ioex)
  		{
  			System.err.println("load error: "+ ioex.getMessage());
  		}
  		ImageIcon fPatientIcon = new ImageIcon(fPatientImg);
  		JButton fPatientBtn = new JButton(fPatientIcon);
  		fPatientBtn.setBounds(308, 234, 220, 220);
  		panel.add(fPatientBtn);
  		fPatientBtn.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e)
  			{
  				try
  				{
  					FindPatientPage.show();
  				}
  				catch (Exception ex)
  				{
  					ex.printStackTrace();
  				}
  			}
  		});
  				
  		JLabel lblFindPatient = new JLabel("Search Patient");
  		lblFindPatient.setFont(new Font("Segoe UI", Font.BOLD, 25));
  		lblFindPatient.setBounds(333, 465, 180, 57);
  		panel.add(lblFindPatient);
  		
  		
  		//Make Appointment Part
  		BufferedImage mAppImg = null;
  		try 
  		{
  			URL file = MainPage.class.getResource("makeAppointment.png");
  			mAppImg = ImageIO.read(file);
  		}
  		catch (IOException ioex)
  		{
  			System.err.println("load error: "+ ioex.getMessage());
  		}
  		ImageIcon mAppIcon = new ImageIcon(mAppImg);
  		JButton mAppointmentBtn = new JButton(mAppIcon);
  		mAppointmentBtn.setBounds(572, 234, 220, 220);
  		panel.add(mAppointmentBtn);
  		mAppointmentBtn.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e)
  			{
  				try
  				{
  					AppointmentPage.show();
  				}
  				catch (Exception ex)
  				{
  					ex.printStackTrace();
  				}
  			}
  		});
  		
  		JLabel lblMakeAppointment = new JLabel("Make Appointment\r\n\r\n");
  		lblMakeAppointment.setFont(new Font("Segoe UI", Font.BOLD, 25));
  		lblMakeAppointment.setBounds(572, 465, 240, 57);
  		panel.add(lblMakeAppointment);
  		
  		
  		
  		//check Availability part
  		BufferedImage cAvaiImg = null;
  		try 
  		{
  			URL file = MainPage.class.getResource("CheckAvailability.png");
  			cAvaiImg = ImageIO.read(file);
  		}
  		catch (IOException ioex)
  		{
  			System.err.println("load error: "+ ioex.getMessage());
  		}
  		ImageIcon AvaiIcon = new ImageIcon(cAvaiImg);
  		JButton AvaiBtn = new JButton(AvaiIcon);
  		AvaiBtn.setBounds(838, 234, 220, 220);
  		panel.add(AvaiBtn);
  		AvaiBtn.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) 
  			{
  				try 
  				{
  					checkAvaibilityPage.show();
  				}
  				catch (Exception ex)
  				{
  					ex.printStackTrace();
  				}
  			}
  		});
  		JLabel lblAvai = new JLabel("Availability\r\n");
  		lblAvai.setFont(new Font("Segoe UI", Font.BOLD, 25));
  		lblAvai.setBounds(883, 465, 149, 57);
  		panel.add(lblAvai);
  		
  		//employee list part
  		BufferedImage employeeImg = null;
  		try 
  		{
  			URL file = MainPage.class.getResource("employeeIcon.png");
  			employeeImg = ImageIO.read(file);
  		}
  		catch (IOException ioex)
  		{
  			System.err.println("load error: "+ ioex.getMessage());
  		}
  		ImageIcon employIcon = new ImageIcon(employeeImg);
  		
  		JButton EmployeeBtn = new JButton(employIcon);
  		EmployeeBtn.setBounds(1098, 234, 220, 220);
  		panel.add(EmployeeBtn);
  		EmployeeBtn.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) 
  			{
  				try 
  				{
  					employeePage.show();
  				}
  				catch (Exception ex)
  				{
  					ex.printStackTrace();
  				}
  			}
  		});
  		
  		JLabel lblEmployee = new JLabel("Employee");
  		lblEmployee.setFont(new Font("Segoe UI", Font.BOLD, 25));
  		lblEmployee.setBounds(1149, 465, 123, 57);
  		panel.add(lblEmployee);
  		
  	//logout button
		BufferedImage logoutImg = null;
		try 
		{
			URL file = GPMainPage.class.getResource("logout.png");
			logoutImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon setlogoutIcon = new ImageIcon(logoutImg);
			JButton logoutBtn = new JButton(setlogoutIcon);
			logoutBtn.setBounds(1247, 11, 113, 117);
			logoutBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
			panel.add(logoutBtn);
			
			JLabel lblLogout = new JLabel("Logout");
			lblLogout.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblLogout.setBounds(1262, 139, 84, 36);
			panel.add(lblLogout);
			logoutBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					try 
					{
						LoginPage.show();
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
  	
  		
  		//box panel
			JPanel WelPanel = new JPanel();
			WelPanel.setBounds(385, 60, 556, 104);
			WelPanel.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
			panel.add(WelPanel);
			WelPanel.setLayout(null);
			
			JLabel lblWel = new JLabel("Welcome,");
			lblWel.setBounds(52, 25, 231, 50);
			WelPanel.add(lblWel);
			lblWel.setFont(new Font("Tahoma", Font.PLAIN, 50));
			
			JLabel WelIDField = new JLabel(em.getEmployeeID());
			WelIDField.setFont(new Font("Tahoma", Font.PLAIN, 35));
			WelIDField.setBounds(275, 18, 217, 57);
			WelPanel.add(WelIDField);
			WelIDField.setLabelFor(lblWel);
  				
  				JLabel thumb = new JLabel();
  				thumb.setBounds(0, 0, 1370, 800);
  				thumb.setBackground(new Color(255, 255, 255));
  				thumb.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 19));
  				thumb.setIcon(new ImageIcon("C:\\Users\\Haston Ng\\eclipse-workspace\\Over Surgery System\\src\\mainpageImg.jpg"));
  				panel.add(thumb);
			
		
		Window.update();
	}
}
