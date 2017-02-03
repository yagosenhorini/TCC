package br.com.sh.util;

public class RNException extends Exception {

	public RNException() {
		
	}
	
	public RNException (String message){
		super(message);
	}
	
	public RNException(Throwable cause){
		super(cause);
	}
	
	public RNException(String message, Throwable cause){
		super(message, cause);
	}
	
	public RNException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace){
		super(message,cause, enableSupression, writableStackTrace);
	}

}
