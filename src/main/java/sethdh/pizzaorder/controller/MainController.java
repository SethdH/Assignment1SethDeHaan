package sethdh.pizzaorder.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/OnlinePizza")
    public String displayIndexPage(Model model) {
        return "index";
    }
}
