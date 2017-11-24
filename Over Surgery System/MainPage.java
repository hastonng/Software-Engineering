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
import java.awt.Choice;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class MainPage
{
	/**
	 * @wbp.parser.entryPoint
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
		ImageIcon icon = new ImageIcon(rPatientImg);
		JButton RPatientBtn = new JButton(icon);
		RPatientBtn.setBounds(49, 188, 121, 110);
		panel.add(RPatientBtn);
		RPatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					newPatientPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		BufferedImage fPatientImg = null;
		try 
		{
			URL file = MainPage.class.getResource("fPatientTest.png");
			fPatientImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon icon1 = new ImageIcon(fPatientImg);
		JButton fPatientBtn = new JButton(icon1);
		fPatientBtn.setBounds(239, 188, 121, 110);
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
		ImageIcon icon2 = new ImageIcon(mAppImg);
		JButton mAppointmentBtn = new JButton(icon2);
		mAppointmentBtn.setBounds(424, 188, 121, 110);
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
		ImageIcon icon3 = new ImageIcon(cAvaiImg);
		//icon3.setBounds(611, 188, 121, 110);
		JButton AvaiBtn = new JButton(icon3);
		AvaiBtn.setBounds(611, 188, 121, 110);
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
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(590, 470, 121, 50);
		panel.add(logoutBtn);
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
		
		JLabel lblNewLabel_1 = new JLabel("Register Patient");
		lblNewLabel_1.setBounds(60, 309, 121, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblFindPatient = new JLabel("Find Patient");
		lblFindPatient.setBounds(266, 309, 111, 26);
		panel.add(lblFindPatient);
		
		JLabel lblMakeAppointment = new JLabel("Make Appointment\r\n\r\n");
		lblMakeAppointment.setBounds(430, 309, 121, 26);
		panel.add(lblMakeAppointment);
		
		JLabel lblAvai = new JLabel("Availability\r\n");
		lblAvai.setBounds(640, 309, 60, 26);
		panel.add(lblAvai);
		
		Window.update();
	}
}
