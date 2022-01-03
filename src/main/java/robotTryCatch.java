import java.util.logging.Level;
import java.util.logging.Logger;

public class robotTryCatch {

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);
        @Override
        void close();
    }
    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }
    public static class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY){
        int count=0;
        RobotConnection rC=null;
        while (count<3) {
            try {
                rC=robotConnectionManager.getConnection();
                rC.moveRobotTo(toX, toY);
                count=3;
            } catch (RobotConnectionException robotConnectionException) {

                if(count == 2)
                    throw new RobotConnectionException("3", robotConnectionException);
                count++;
            } catch (Exception e) {
                throw e;

            } finally {
                if(rC != null){
                    try {
                        rC.close();
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    public static void moveRobot1(RobotConnectionManager robotConnectionManager, int toX, int toY){
        boolean success=false;
        for (int i=0; !success && (i<3); ++i) {
            try (RobotConnection connection=robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                success=true;
            } catch (RobotConnectionException e) {
            }
        }
        if(!success){
            throw new RobotConnectionException("3 attempts failed");
        }
    }
    public static void logging() {
        final Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
        LOGGER.log(Level.INFO,"Все хорошо");
        LOGGER.log(Level.WARNING,"Произошла ошибка");
}
}
