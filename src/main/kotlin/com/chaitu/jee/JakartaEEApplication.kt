package com.chaitu.jee

import com.chaitu.jee.controllers.ProductsController

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

/**
 * @author Chaitanya Chunduri
 */
@ApplicationPath("/")
open class JakartaEEApplication : Application() {
    override fun getClasses(): MutableSet<Class<*>> {
        return mutableSetOf(ProductsController::class.java)
    }
}