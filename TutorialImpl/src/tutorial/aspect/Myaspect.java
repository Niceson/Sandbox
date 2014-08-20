package tutorial.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.patterns.ThisOrTargetPointcut;

/**
 * My Aspect class
 * @author Nice
 *
 */
public class Myaspect {

	private Long startTime, endTme;

	/**
	 * Performed before method call execution
	 */
	public void dobefore() {
		System.out.println("Intercepting before method call");
		startTime = System.currentTimeMillis();
		System.out.println("The method started at " + startTime);
		System.out.println("" + ThisOrTargetPointcut.class.getName());
		
	}

	/**
	 * Performed after method call execution
	 */
	public void doafter() {
		System.out.println("Iam after the method call");
		endTme = System.currentTimeMillis();
		System.out.println("The method ended at " + endTme);
		System.out.println("The method lasted " + (endTme -startTime) + " Milliseconds");
	
	}

//	public void doAround() {
//		System.out.println("I do around everymethod");
//	}
}
