package study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.properties.SysProp;

/**
 * @author liujunliang
 * @date 2019/6/27
 */
@RestController
public class IndexController {

    @Autowired
    private SysProp sysProp;

    @GetMapping("/")
    public String index(){
        return sysProp.getSystemName();
    }
}
