package aitc.ex5;

import java.util.logging.Logger;

public class Para {
	
	private static Logger LOG = Logger.getLogger("Para");
	
	private String inputImagePath;
	private String oututImagePath;
	private String formatName;
	
	public Para() {
	}
	public Para(String []args){
		if(args.length<3) {
			LOG.info("Usage: java -jar fontCreator*.jar [input file] [output file] [format]");
		}
		
		else {
			inputImagePath = args[0];
			oututImagePath = args[1];
			formatName = args[2];
		}
		
		
	}
	
	public String getinputImagePath() {
		return inputImagePath;
	}
	public String getoututImagePath() {
		return oututImagePath;
	}
	public String getformatName() {
		return formatName;
	}
	
	
	public void setinputImagePath(String newinputImagePath) {
		inputImagePath = newinputImagePath;
	}
	public void setoututImagePath(String newoutputImagePath) {
		oututImagePath = newoutputImagePath;
	}
	public void setformatName(String newformatName) {
		formatName = newformatName;
	}
	
	

}
