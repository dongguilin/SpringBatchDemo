package demo.batch.hello;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by guilin1 on 15/12/9.
 */
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/world")
    public String world() {
        System.out.println("hello world!");
        return "success";
    }

}
