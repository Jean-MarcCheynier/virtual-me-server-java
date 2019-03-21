package jmcheynier.apps.portfolio;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/me")
public class MeController {

    @RequestMapping("/")
    public Me index() {
    	Me me = new Me();
    	me.setName("undefined");
        return me;
    }
    
    @RequestMapping("/name/{name}")
    public Me index(@PathVariable String name) {
    	Me me = new Me();
    	me.setName(name);
        return me;
    }

}
