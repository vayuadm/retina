package adm.vayu.retina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetinaController {

    @Autowired
    private Configuration config;

    @RequestMapping("/")
    public String index() {

        return config.getHelloGreeting();
    }
}
