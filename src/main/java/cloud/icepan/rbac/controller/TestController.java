package cloud.icepan.rbac.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/***
 *@Author lyer
 *@Date 2/9/21 10:55
 *@Description
 *
 ***/

@RestController
public class TestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/ping")
    public String Ping(HttpServletRequest request) {
        String infoTest = "---------ping reques-------------";
        logger.trace(infoTest);
        return "OK";
    }

}
