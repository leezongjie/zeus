package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "sample")
@EnableAutoConfiguration
@ComponentScan
public class SampleController {
    private Logger logger= LoggerFactory.getLogger(getClass());

    @RequestMapping("/aaa")
    @ResponseBody
    String home() {
        logger.info("receive message");
        return "Hello World!12";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
