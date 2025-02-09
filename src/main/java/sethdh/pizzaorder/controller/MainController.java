package sethdh.pizzaorder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sethdh.pizzaorder.model.UserOrder;

import java.util.ArrayList;


@Controller
public class MainController {

    @GetMapping("/OnlinePizza")
    public String displayIndexPage(Model model) {
        UserOrder userOrder = new UserOrder("", "", "", "", "o");
        model.addAttribute("userOrder", userOrder);
        return "index";
    }

    @PostMapping("/submitOrder")
    public String submitOrder(Model model, @ModelAttribute UserOrder userOrder) {
        System.out.println(userOrder.getDeliveryType());
        return "recipt";
    }
}
