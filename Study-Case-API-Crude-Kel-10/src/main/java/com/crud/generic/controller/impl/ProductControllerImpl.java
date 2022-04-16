package com.crud.generic.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.generic.controller.PersonController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Product;

@RestController
@RequestMapping(path = "/product")
public class ProductControllerImpl extends ControllerGenericImpl<Product> implements PersonController{
	
}
