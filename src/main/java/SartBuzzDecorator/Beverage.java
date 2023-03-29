package main.java.SartBuzzDecorator;

/*
 * allow classes to be easily extended to incorporate new behavior without modifying existing main.code.
 * Decorator Pattern : attaches additional responsibility to an object dynamically. it provide a flexable alternative to subclassing for extending functionally.
 * 
 */
public interface Beverage {
	/*
	public final String VENTI = "VENTI";
	public final String TALL = "TALL";
	public final String GRANDE = "GRANDE";
	*/
	public enum Size {VENTI, TALL, GRANDE};
	Size size = Size.VENTI;
	
	String getDescription();
	
	double cost();
	
	void setSize(Size size);
	
	 Size getSize();
	
	 String toString();

}
