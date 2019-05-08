package fabrique_abs_int;

import fabrique_class.Type_log_cons;

public abstract class Creator_Log_Console {

	public Creator_Log_Console() {
		
	}
	public abstract ILog_Console factoryMethod(Type_log_cons type);
	public ILog_Console CreateLogger(Type_log_cons type) {
		// TODO Auto-generated method stub
		ILog_Console lo_cons=this.factoryMethod(type);
		lo_cons.service();
		return lo_cons;
	}
}
