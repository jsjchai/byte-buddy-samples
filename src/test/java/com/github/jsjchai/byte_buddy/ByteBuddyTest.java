package com.github.jsjchai.byte_buddy;

import com.github.jsjchai.App;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ByteBuddyTest {

    /**
     * 修改App的toString方法，并打印"Hello World ByteBuddy!"
     */
    @Test
    void modifyToStringMethod() throws InstantiationException, IllegalAccessException {
        DynamicType.Unloaded<App> unloadedType = new ByteBuddy()
                .subclass(App.class)
                .method(ElementMatchers.isToString())
                .intercept(FixedValue.value("Hello World ByteBuddy!"))
                .make();

        Class<?> dynamicType = unloadedType.load(getClass()
                .getClassLoader())
                .getLoaded();

        assertEquals("Hello World ByteBuddy!", dynamicType.newInstance().toString());
    }
}
