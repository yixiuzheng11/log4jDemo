import org.apache.log4j.Logger;
import org.junit.Test;


public class Demo {
	private static Logger logger = Logger.getLogger(Demo.class);

	public static void main(String[] args) {
		logger.debug("level debug---------");
		logger.info("level info---------");
		logger.error("level error---------");
	}

	@Test
	public void log() {
		logger.info("sssss info---------");
		logger.error("jjjjjj error---------");
	}
}
