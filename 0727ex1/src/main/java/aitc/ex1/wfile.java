package aitc.ex1;

import java.util.logging.Logger;//導入方法依賴的package包/類
import javax.imageio.ImageIO;

import aitc.ex1.wfileException;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;


class wfile{
	
	private Para a;
	
	public wfile(Para a) throws wfileException {
		if(a==null)throw new wfileException("parameters should not be null");
		this.a = a;
	}
	
	public boolean convertor()throws wfileException {
		try(FileInputStream inputStream = new FileInputStream(a.getinputImagePath());
            FileOutputStream outputStream = new FileOutputStream(a.getoututImagePath()))
		{
			BufferedImage inputImage = ImageIO.read(inputStream);
			int w = inputImage.getWidth();
			int h = inputImage.getHeight();
			int []pixels = new int [w*h];
			inputImage.getRGB(0, 0, w, h, pixels, 0, w);
            BufferedImage cleanedInputImage = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
            cleanedInputImage.setRGB(0, 0, w, h, pixels, 0, w);
            return ImageIO.write(cleanedInputImage, a.getformatName(), outputStream);
			
		}
		catch(IOException e){
            throw new wfileException("Open or write file failed!!! [" + e.getMessage() + "]");
        }                                                                                                                    
	}
	
}
