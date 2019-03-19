package jmcheynier.apps.portfolio;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeController {

    @RequestMapping("/")
    public String index() {
        return "This is me";
    }

}
