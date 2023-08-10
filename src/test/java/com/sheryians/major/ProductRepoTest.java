//package com.sheryians.major;
//
//import com.sheryians.major.model.Product;
//import com.sheryians.major.repository.ProductRepo;
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class ProductRepoTest {
//    @Autowired
//    private ProductRepo productRepo;
//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    public void saveProduct(){
//        Product product= null;
//        try {
//            product = Product.builder()
//                    .name()
//                    .price(600)
//                    .weight("2")
//                    .build();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        productRepo.save(product);
//        Assertions.assertThat(product.getId()).isGreaterThan(0);
//    }
//}
