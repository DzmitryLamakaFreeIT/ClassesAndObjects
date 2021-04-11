package by.lamaka.lesson9.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProgramLogic {
    public static boolean checkClassByAnnotation(Class myClass) {
        boolean result = false;

        if (myClass.getDeclaredAnnotations().length > 0) {
            result = true;
        }
        return result;
    }

    public static void thisClassInfo(Object myClass) {
        try {
            Method method = myClass.getClass().getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
