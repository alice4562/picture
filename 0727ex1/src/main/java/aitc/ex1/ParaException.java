package aitc.ex1;

import aitc.ex1.ParaException;

public class ParaException extends Exception{
	public ParaException(String a) {
		super(a);
	}
	
	public ParaException(String a,Throwable throwable) {
		super(a,throwable);
	}
	
	@Override
	public String getMessage() {
		String msg = super.getMessage();
		if(getCause()!=null) {
			msg = msg+">> "+ (getCause() instanceof ParaException ? "" : getCause().getClass().getName() + ": ")
                    + getCause().getMessage();
  }
		return msg;
	}
}
