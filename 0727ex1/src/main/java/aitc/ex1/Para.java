package aitc.ex1;
import java.util.logging.Logger;
class Para {
	private static Logger LOG = Logger.getLogger("Para");
	
	private String inputImagePath;
	private String oututImagePath;
	private String formatName;
	
	public Para() {
	}
	public Para(String a[]){
		if(a.length!=2) {
			LOG.info("Usage:java -jar ex.jar [input file] [output file]");
		}
		else {
			inputImagePath = a[0];
		oututImagePath = a[1];
		String b[] = a[1].split("\\.");
		formatName = b[1];
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
