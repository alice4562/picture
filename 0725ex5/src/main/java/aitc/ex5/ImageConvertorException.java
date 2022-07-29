package aitc.ex5;


import java.util.logging.Logger;//導入方法依賴的package包/類
import javax.imageio.ImageIO;
import aitc.ex5.Para;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class ImageConvertorException extends Exception{
	public ImageConvertorException(String a) {
		super(a);
	}
	public ImageConvertorException(String a,Throwable throwable) {
		super(a,throwable);
	}
	
	public String getMessage() {
		String msg = super.getMessage();
		if(getCause()!=null) {
			msg = msg+">> "+(getCause() instanceof ImageConvertorException ? "" : getCause().getClass().getName() + ": ")
                              + getCause().getMessage();
		}
		return msg;
	}
	

}
