package aitc.ex5;//圖片讀取

import java.util.logging.Logger;//導入方法依賴的package包/類
import aitc.ex5.ImageConvertor;
import aitc.ex5.ImageConvertorException;
import aitc.ex5.ParaException;
import aitc.ex5.Para;

public class App 
{
    private static Logger LOG = Logger.getLogger("App");
	
	public static void main( String[] args )
    {
		Para p = new Para(args);
		
		try {
			LOG.info(new ImageConvertor(p).convertor()?"convert success":"convert failed");
		}
		catch(ImageConvertorException e){
			 LOG.severe("Open or write file failed!!! [" + e.getMessage() + "]");
		}
    }
}
