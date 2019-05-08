package fabrique_class;

import fabrique_abs_int.ILog_Console;

public class Console implements ILog_Console {

	@Override
	public void service() {
		System.out.println("Module de journalisation CONSOLE");

	}

}
