import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class GPMainPage
{
	
	private static Employee em;
	
	public static Employee getEm() {
		return em;
	}

	public static void setEm(Employee em) {
		GPMainPage.em = em;
	}

	
	
	
	/**
	 * Create the frame.
	 */
	
	
	public static void show()
	{
		/*   TitledBorder border = new TitledBorder("This is my title");
    border.setTitleJustification(TitledBorder.CENTER);
    border.setTitlePosition(TitledBorder.TOP);
 
    JPanel panel = new JPanel();
    panel.setBorder(border);*/
		JPanel panel = Window.getCleanContentPane();
		//must add to all panel
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 10000, 10000);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		
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
		
		/*JTextField WelIDField = new JTextField("");
		WelIDField.setBounds(400, 107, 80, 25);
		WelIDField.setColumns(10);
		panel.add(WelIDField);*/
		
		
		//find patient part
		BufferedImage fPatImg = null;
		try 
		{
			URL file = GPMainPage.class.getResource("findPatient.png");
			fPatImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon fPatIcon = new ImageIcon(fPatImg);
		JButton findPatientButton = new JButton(fPatIcon);
		findPatientButton.setBounds(148, 219, 250, 250);
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
		
		JLabel lblSearchPatient = new JLabel("Search Patient");
		lblSearchPatient.setBounds(168, 492, 226, 47);
		lblSearchPatient.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panel.add(lblSearchPatient);
		
		
		//medical prescription part
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
		ImageIcon mpIcon = new ImageIcon(mpImg);
		
		JButton mpButton = new JButton(mpIcon);
		mpButton.setBounds(534, 219, 250, 250);
		panel.add(mpButton);
		mpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					mpPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		JLabel lblCreateMedicalPrescription = new JLabel("New Medical Prescription");
		lblCreateMedicalPrescription.setBounds(482, 492, 402, 47);
		lblCreateMedicalPrescription.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panel.add(lblCreateMedicalPrescription);
		
		
		//set avai part
		BufferedImage setAvaiImg = null;
		try 
		{
			URL file = GPMainPage.class.getResource("CheckAvailability.png");
			setAvaiImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon setAvaiIcon = new ImageIcon(setAvaiImg);
		JButton setAvaiButton = new JButton(setAvaiIcon);
		setAvaiButton.setBounds(976, 219, 250, 250);
		panel.add(setAvaiButton);
		setAvaiButton.addActionListener(new ActionListener() {
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
		
		JLabel lblSetAvai = new JLabel("Set Availability");
		lblSetAvai.setBounds(995, 492, 231, 47);
		lblSetAvai.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panel.add(lblSetAvai);
		
		
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
			
			JLabel thumb = new JLabel();
			thumb.setBounds(0, 0, 1370, 800);
			panel.add(thumb);
			thumb.setBackground(new Color(255, 255, 255));
			thumb.setIcon(new ImageIcon("C:\\Users\\Haston Ng\\eclipse-workspace\\Over Surgery System\\src\\mainpageImg.jpg"));
			
			
		Window.update();
	}
}
