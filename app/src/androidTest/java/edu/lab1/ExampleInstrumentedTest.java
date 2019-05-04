package edu.lab1;

import android.content.Context;
import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("edu.lab1", appContext.getPackageName());
    }

    @Test
    public void onCreateTest() {
//        try {
            boolean actualResult = false;
//            Annotation[] onCreateDeclaredAnnotations = ItemListActivity.class
//                    .getDeclaredMethod("onCreate", Bundle.class).getDeclaredAnnotations();
            Method[] declaredMethods = ItemListActivity.class.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.out.println(method.getDeclaredAnnotations().getClass().getName());
            }
//            for (Annotation item : onCreateDeclaredAnnotations) {
//                actualResult = item.getClass().getName().equals("Override");
//                assertTrue(actualResult);
//            }

//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
    }
}
