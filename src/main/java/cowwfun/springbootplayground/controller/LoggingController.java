package cowwfun.springbootplayground.controller;

import cowwfun.springbootplayground.service.LoggingClassService;
import cowwfun.springbootplayground.service.LoggingMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging")
public class LoggingController {
    @Autowired
    LoggingClassService loggingClassService;

    @Autowired
    LoggingMethodService loggingMethodService;

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    @ResponseBody
    public String log() {
        System.out.println("\n\n\n------------------------------------------------------------------------------");
        System.out.println("                       ClassWhichIsLoggable");
        System.out.println("------------------------------------------------------------------------------");

        printSeparator();
        loggingClassService.methodOne();
        printSeparator();
        loggingClassService.methodTwo();
        printSeparator();
        loggingClassService.methodThree();
        printSeparator();
        try {
            loggingClassService.methodFour();
        } catch (Exception e) {
            System.out.println("Custom exception caught");
        }


        System.out.println("\n\n\n------------------------------------------------------------------------------");
        System.out.println("                     ClassWithLoggableMethods");
        System.out.println("------------------------------------------------------------------------------");

        printSeparator();
        loggingMethodService.methodOne();
        printSeparator();
        try {
            loggingMethodService.methodTwo();
        } catch (Exception e) {
            System.out.println("Custom exception caught");
        }
        printSeparator();
        loggingMethodService.methodThree();
        printSeparator();

        return "done";
    }

    private void printSeparator() {
        System.out.println("\n---------------------------------------\n");
    }
}
