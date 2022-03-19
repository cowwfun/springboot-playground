package cowwfun.springbootplayground.service;

import cowwfun.springbootplayground.annotations.LoggableMethod;
import org.springframework.stereotype.Service;

@Service
public class LoggingMethodService {
    @LoggableMethod
    public void methodOne() {
        System.out.println("ClassWithLoggableMethods -> method with @LoggableMethod annoation called");
    }

    @LoggableMethod
    public void methodTwo() throws Exception {
        System.out.println("ClassWithLoggableMethods -> method with @LoggableMethod annoation throwing exception called");
        throw new Exception("custom exception");
    }

    public void methodThree() {
        System.out.println("ClassWithLoggableMethods -> method without @LoggableMethod annoation called");
    }
}
