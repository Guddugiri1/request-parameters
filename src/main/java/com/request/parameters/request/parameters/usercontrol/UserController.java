package com.request.parameters.request.parameters.usercontrol;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Example URL: /api/users/1
    // Example URL: /api/users/1/orders/10
    @GetMapping("/{userId}/orders/{orderId}")
    public String getUserOrder(@PathVariable int userId, @PathVariable int orderId) {
        return "Order " + orderId + " for user " + userId;
    }

}

