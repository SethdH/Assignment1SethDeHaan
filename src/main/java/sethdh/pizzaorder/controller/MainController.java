package sethdh.pizzaorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sethdh.pizzaorder.model.Order;
import sethdh.pizzaorder.model.User;
import sethdh.pizzaorder.service.UserOrderService;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserOrderService userOrderService;

    public MainController(UserOrderService userOrderService) {
        this.userOrderService = userOrderService;
    }

    @GetMapping("/OnlinePizza")
    public String MainPage(Model model){
        Order order = new Order();
        User user = new User();

        model.addAttribute("order", order);
        model.addAttribute("user", user);

        return "index";
    }

    @PostMapping("/SubmitOrder")
    public String SubmitOrder(Model model, @ModelAttribute("user") User user, @ModelAttribute("order") Order order){
        //adding the orders to the service
        LocalDateTime ldt = LocalDateTime.now();
        order.calculateTotalPrice();
        userOrderService.addUserAndOrder(user, order);
        //for the receipt page
        List<Order> orders = userOrderService.getOrders(user);
        model.addAttribute("user", user);
        model.addAttribute("orders", orders);
        return "receipt";
    }
}
