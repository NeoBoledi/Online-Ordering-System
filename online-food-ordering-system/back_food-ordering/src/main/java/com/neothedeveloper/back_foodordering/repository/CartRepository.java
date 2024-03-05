package com.neothedeveloper.back_foodordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neothedeveloper.back_foodordering.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
