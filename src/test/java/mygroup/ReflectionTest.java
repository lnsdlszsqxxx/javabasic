package mygroup;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void reflectionTest() throws Exception {
        ReflectionObj obj = new ReflectionObj();
        Class cls = obj.getClass();
        logger.info(">>>>>>>>>> class name: " + cls.getName());
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object fieldValue = field.get(obj);
            logger.info(">>>>>>>>>> filed: " + field.getName() + ", value: " + fieldValue.toString() + ", Type: " + field.getType().getName());
        }
        for (Constructor<?> constructor : cls.getConstructors()) {
            constructor.setAccessible(true);
            logger.info(">>>>>>>>>> constructor name: " + constructor.toGenericString());
        }
        for (Method method : cls.getDeclaredMethods()) {
            method.setAccessible(true);
            logger.info(String.format(">>>>>>>>>> method name: %s, annotation: %s", method.toGenericString(), Arrays.deepToString(method.getAnnotations())));
        }
        obj.showMsg();
        Field field = cls.getDeclaredField("msg");
        field.setAccessible(true);
        field.set(obj, "'The message is hacked'");
        obj.showMsg();
        Method m = cls.getDeclaredMethod("showPrivateMsg");
        m.setAccessible(true);
        m.invoke(obj);
    }
}