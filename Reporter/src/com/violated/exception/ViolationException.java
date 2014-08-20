package com.violated.exception;

public class ViolationException extends Exception {

	public ViolationException() 
	{
		super();
	}
	
	public ViolationException(String message)
	{
		super(message);
	}
	
	public ViolationException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public ViolationException(Throwable cause) 
	{
		super(cause);
	}
}


