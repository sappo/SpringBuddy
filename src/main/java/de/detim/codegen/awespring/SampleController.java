package de.detim.codegen.awespring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SampleController {

    @RequestMapping(path = {"/test"})
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}