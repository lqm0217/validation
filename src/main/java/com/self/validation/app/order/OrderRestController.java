package com.self.validation.app.order;


import com.self.validation.domain.order.aggregate.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@RestController
public class OrderRestController {

    @GetMapping(value = "/order/{orderId}")
    public ResponseEntity<Order> getOrderById(@Min(1L) @Max(10L) @PathVariable("orderId") Long orderId) {

        return new ResponseEntity<Order>(HttpStatus.OK);
    }

    @PostMapping(value = "/order")
    public ResponseEntity<Order> createOrder(@Valid @RequestBody Order body) {

        return new ResponseEntity<Order>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/order/{orderId}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
