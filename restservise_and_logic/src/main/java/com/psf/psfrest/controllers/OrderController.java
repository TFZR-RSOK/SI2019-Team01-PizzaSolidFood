package com.psf.psfrest.controllers;

import com.psf.psfrest.entity.Order;
import com.psf.psfrest.model.MailDetails;
import com.psf.psfrest.service.IOrderService;
import com.psf.psfrest.utils.Globals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.psf.psfrest.MailQueueThread.mailQueue;

@RestController
@CrossOrigin
public class OrderController {

    @Autowired
    private IOrderService orderService;

    private String address;

    @GetMapping("/auth/address")
    @ResponseStatus(HttpStatus.CREATED)
    public void setAddress(@RequestParam String userAddress) {
        System.out.println(userAddress);
        this.address = userAddress;
    }

    @PostMapping("/auth/order")
    @ResponseStatus(HttpStatus.OK)
    public void order(@RequestBody List<Order> orderDetails) {
        for (Order orderDetail : orderDetails) {
            orderService.init(
                    orderDetail.getMail(),
                    orderDetail.getProductName(),
                    orderDetail.getPayment(),
                    orderDetail.getQuantity(),
                    orderDetail.getOrderNum(),
                    orderDetail.getAdditionName()
            );

           orderService.addProductToOrder();
           if (orderDetail.getUserType() == 1 && !orderDetail.getAdditionName().equals("none"))
               orderService.addAdditionsToOrder();

        }
        orderService.completeOrder();
        mailQueue.offer(new MailDetails(orderDetails.get(0).getMail(), orderDetails.get(0).getOrderNum(), this.address, Globals.MailEnum.BILL));
    }
}
