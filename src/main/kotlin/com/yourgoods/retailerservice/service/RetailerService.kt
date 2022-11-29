package com.yourgoods.retailerservice.service

import com.yourgoods.retailerservice.model.Retailer
import com.yourgoods.retailerservice.repository.RetailerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RetailerService{

    @Autowired
    private val retailerRepository: RetailerRepository? = null

    fun createRetailer(retailer: Retailer) {
        retailerRepository?.save(retailer) ?: retailer
    }

    fun getAllRetailers() {
        retailerRepository?.findAll()
    }


}