import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class SetAvailabilityPage 
{
	/**
	 * Create the panel.
	 */
	public static void show()  
	{
		JPanel panel = Window.getCleanContentPane();
        
		//GP Icon and label
		BufferedImage GPIconImg = null;
		try 
		{
			URL file = MainPage.class.getResource("gpIcon.png");
			GPIconImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon icon = new ImageIcon(GPIconImg);
		
		
		JButton GPIconButton = new JButton(icon);
		GPIconButton.setBounds(261, 178, 250, 250);
        panel.add(GPIconButton);
        GPIconButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
					{
						setGPAvailabilityPage.show();
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
			}
		});
        
        JLabel lblSetGPAvailability = new JLabel("General Practitioner Availability");
        lblSetGPAvailability.setFont(new Font("Segoe UI", Font.BOLD, 30));
        lblSetGPAvailability.setBounds(158, 450, 481, 47);
		panel.add(lblSetGPAvailability);
        
		
        //nurseIcon and label
		 BufferedImage nurseIconImg = null;
		try 
		{
			URL file = MainPage.class.getResource("nurseIcon.png");
			nurseIconImg = ImageIO.read(file);
		}
		catch (IOException ioex)
		{
			System.err.println("load error: "+ ioex.getMessage());
		}
		ImageIcon icon_1 = new ImageIcon(nurseIconImg);
        JButton NurseBtn = new JButton(icon_1);
        NurseBtn.setBounds(902, 178, 250, 250);
        panel.add(NurseBtn);
        NurseBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
					{
						setNurseAvailabilityPage.show();
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
			}
		});
        
		
        JLabel lblSetNurseAvailability = new JLabel("Nurse Availability");
		lblSetNurseAvailability.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblSetNurseAvailability.setBounds(902, 450, 276, 47);
		panel.add(lblSetNurseAvailability);
        
        Button btnOkButton = new Button("Cancel");
        btnOkButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnOkButton.setBounds(1231, 682, 100, 43);
        panel.add(btnOkButton);
        btnOkButton.addActionListener(new ActionListener()
		{
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
