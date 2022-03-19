package cowwfun.springbootplayground.service;

import cowwfun.springbootplayground.annotations.LoggableClass;
import cowwfun.springbootplayground.annotations.LoggableMethod;
import cowwfun.springbootplayground.annotations.NotLoggableMethod;
import org.springframework.stereotype.Service;

@LoggableClass
@Service
public class LoggingClassService {
    public void methodOne() {
        System.out.println("ClassWhichIsLoggable -> method with no annotation called");
    }

    @LoggableMethod
    public void methodTwo() {
        System.out.println("ClassWhichIsLoggable -> method with @LoggableMethod annotation called");
    }

    @NotLoggableMethod
    public void methodThree() {
        System.out.println("ClassWhichIsLoggable -> method with @NotLoggableMethod annotation called");
    }

    public void methodFour() throws Exception {
        System.out.println("ClassWhichIsLoggable -> method throwing exception called");
        throw new Exception("custom exception");
    }
}
