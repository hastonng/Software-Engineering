import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame
{
	private static Window window;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args)
	{
		
		
		
		EventQueue.invokeLater( new Runnable()
		{
			public void run()
			{
				try
				{
					window = new Window();
					resetWindow();
					LoginPage.show();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	private Window()
	{
		//setBounds(100, 100, 800, 600);
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setUndecorated(true);
	    setVisible(true);
	    
		contentPane = new JPanel();
		getContentPane().add(contentPane);
	}
	
	/*public static void setWindowSize( int width , int height )
	{
		window.setSize(width, height);
		window.contentPane.setSize(width, height);
	}*/
	
	public static void resetWindow()
	{
		
		/* for (java.awt.Window w : Window.getWindows()) {
             GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(w);
         }*/
		window.contentPane.setBackground(Color.WHITE);
		window.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		window.contentPane.setLayout(null);
	}
	
	public static JPanel getCleanContentPane()
	{
		resetWindow();
		window.contentPane.removeAll();
		return window.contentPane;
	}
	
	public static void update()
	{
		window.contentPane.validate();
		window.contentPane.repaint();
	}
}
