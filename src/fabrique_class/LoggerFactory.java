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
public class LoggerFactory extends Creator_Log_Console{

	/**
	 * 
	 */
	public LoggerFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ILog_Console factoryMethod(Type_log_cons type) {
		ILog_Console unite = null;;
		switch(type)
		{
		case LOG:unite = new Log(); 
			break;
		case CONSOLE:unite = new Console();
			break;
		}
		return unite;
	}

}
