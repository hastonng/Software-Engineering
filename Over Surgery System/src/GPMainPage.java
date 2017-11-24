import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class GPMainPage
{

	/**
	 * Create the frame.
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
		
		BufferedImage fPatImg = null;
		try 
		{
			URL file = GPMainPage.class.getResource("fPatientTest.png");
			fPatImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon icon1 = new ImageIcon(fPatImg);
		JButton findPatientButton = new JButton(icon1);
		findPatientButton.setBounds(64, 188, 121, 110);
		panel.add(findPatientButton);
		findPatientButton.addActionListener(new ActionListener() {
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
		
		
		BufferedImage mpImg = null;
		try 
		{
			URL file = GPMainPage.class.getResource("MPres.png");
			mpImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon icon2 = new ImageIcon(mpImg);
		JButton mpButton = new JButton(icon2);
		mpButton.setBounds(327, 188, 121, 110);
		panel.add(mpButton);
		mpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					medicalPrescriptionForm.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		
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
		ImageIcon icon3 = new ImageIcon(logoutImg);
		JButton logoutButton = new JButton(icon3);
		logoutButton.setBounds(586, 188, 121, 110);
		panel.add(logoutButton);
		logoutButton.addActionListener(new ActionListener() {
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
		
		
		JLabel lblSearchPatient = new JLabel("Search Patient");
		lblSearchPatient.setBounds(82, 325, 121, 26);
		panel.add(lblSearchPatient);
		
		JLabel lblCreateMedicalPrescription = new JLabel("Create Medical Prescription");
		lblCreateMedicalPrescription.setBounds(313, 325, 167, 26);
		panel.add(lblCreateMedicalPrescription);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setBounds(626, 325, 47, 26);
		panel.add(lblLogout);
		
		Window.update();
	}
}
