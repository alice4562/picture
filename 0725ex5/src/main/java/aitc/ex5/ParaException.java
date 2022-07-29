package aitc.ex5;


public class ParaException extends Exception{
	public ParaException(String s) {
		super(s);
	}
	
	public ParaException(String s,Throwable throwable) {
		super(s,throwable);
	}
	
	public String getMessage() {
        String msg = super.getMessage();
        if (getCause() != null) {
                msg = msg + ">> "
                          + (getCause() instanceof ParaException ? "" : getCause().getClass().getName() + ": ")
                          + getCause().getMessage();
        }
        return msg;
}
}
