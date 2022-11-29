package com.yourgoods.retailerservice.repository

import com.yourgoods.retailerservice.model.Retailer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
open interface RetailerRepository: MongoRepository<Retailer?, String>{
    fun findByRetailerId(RetailerId: String?): Retailer?
}