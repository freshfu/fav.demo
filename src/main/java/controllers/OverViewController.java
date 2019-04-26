package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OverViewController {
    private static final Logger logger = LoggerFactory.getLogger(OverViewController.class);

    @RequestMapping(value = "/gotoHome")
    public String gotoHome(){
        logger.debug("进入方法： OverViewController.gotoHome");
        return "home";
    }
}
