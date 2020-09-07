package my_spring;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {


//    private Map<Class, Class> ifc2ImplClass = Map.of(Speaker.class, ConsoleSpeaker.class)


    private static ObjectFactory objectFactory = new ObjectFactory();

    private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    public Object createObject(Class type) {
        //todo finish this
        // if type is concrete class, just create and return it's instance
        //if type is and interface, you should find appropriative impl.
    }
}
