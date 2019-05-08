/**
 * 
 */
package fabrique_class;

import fabrique_abs_int.Creator_Log_Console;
import fabrique_abs_int.ILog_Console;

/**
 * @author Hp
 *
 */
public class MainTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Creator_Log_Console factory=new LoggerFactory();
		ILog_Console LogCons=factory.CreateLogger(Type_log_cons.LOG);
		//LogCons.service(MainTesting.class.toString(),"Bonjour");
		System.out.println(LogCons);

	}

}
