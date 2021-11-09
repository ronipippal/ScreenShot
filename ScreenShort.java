import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
class ScreenShort 
{  
	public static final Long serialVersionUID=1l;
	public static void main(String[] args) 
	{   
		try{
			Thread.sleep(120);
			Robot r=new Robot();

			// it saves screenshort to desired path
			String path = "G:// Screenshort by java.jpg";

			// used to get Screenshort and capture image

			Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage Image = r.createScreenCapture(capture);
			ImageIO.write(Image,"JPG", new File(path));
			System.out.println("ScreenShort saved");
		}
		catch(AWTException | IOException | InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}
