/**
 * 
 */
package fabrique_class;
//package fabrique_abs_int;
import fabrique_abs_int.ILog_Console;

/**
 * @author Hp
 *
 */
public class Log implements ILog_Console{

	/**
	 * 
	 */
	public Log() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		System.out.println("Module de journalisation LOG");
		
	}

}
