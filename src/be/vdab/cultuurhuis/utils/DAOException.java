package be.vdab.cultuurhuis.utils;

public class DAOException extends Exception {
	private static final long serialVersionUID = 1L;

	public DAOException (){
		super();
	}
	
	public DAOException (String message){
		super(message);
	}
	
	public DAOException (Throwable throwable){
		super(throwable);
	}
	
	public DAOException (String message, Throwable throwable){
		super(message, throwable);
	}
	
}
