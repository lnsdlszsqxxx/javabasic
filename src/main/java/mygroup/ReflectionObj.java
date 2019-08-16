package mygroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ReflectionObj {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String msg;

    public ReflectionObj()  {
        msg = "'This is reflection test object'";
    }

    ReflectionObj(String msg)  {
        this.msg = msg;
    }

    public void showMsg()  {
        logger.info(String.format(">>>>>>>>>> The public method - the message is %s", msg));
    }

    @Deprecated
    public void showMessage(String message)  {
        logger.info(String.format(">>>>>>>>>> The public method - the message is %s", message));
    }

    private void showPrivateMsg() {
        logger.info(String.format(">>>>>>>>>> The private method invoked - the message is %s", msg));
    }
}