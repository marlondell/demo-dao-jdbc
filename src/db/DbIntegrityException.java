// Class created to the mistakes os Referencial Integrity (Foreign Keys for example)
package db;

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}
	
}
