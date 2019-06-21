package com.psf.psfrest.service;

public interface IOrderService {
    void addProductToOrder();
    void addAdditionsToOrder();
    void completeOrder();
}
