package com.chaitu.jee.controllers

import javax.ws.rs.GET
import javax.ws.rs.Path

/**
 * @author Chaitanya Chunduri
 */
@Path("/api/products")
open class ProductsController {

    @GET
    public fun getProducts(): List<String> {
        return listOf("Apple", "Samsumng");
    }
}