package aitc.ex1;

import java.util.logging.Logger;//導入方法依賴的package包/類
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class App 
{
    private static Logger LOG = Logger.getLogger("App");
    
	
	public static void main( String[] args )
    {
		
		Para p = new Para(args);
		
		try {
			LOG.info(new wfile(p).convertor()?"convert success":"convert failed");
		}
		catch(wfileException e){
			 LOG.severe("Open or write file failed!!! [" + e.getMessage() + "]");
        }
			
		
    }
}
