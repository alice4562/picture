package aitc.ex1;

import aitc.ex1.wfileException;

public class wfileException extends Exception{
	public wfileException(String a) {
		super(a);
	}
	
	public wfileException(String a, Throwable throwable) {
		super(a, throwable);
	}
	
	@Override
	public String getMessage() {
		String msg = super.getMessage();
		if(getCause()!=null) {
			msg = msg+">> "+(getCause() instanceof wfileException ? "" : getCause().getClass().getName() + ": ")
                              + getCause().getMessage();
		}
		return msg;
	}
}
