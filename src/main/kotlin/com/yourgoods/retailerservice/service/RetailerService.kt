package com.yourgoods.retailerservice.service

import com.yourgoods.retailerservice.model.Retailer
import com.yourgoods.retailerservice.repository.RetailerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RetailerService {
    @Autowired
    private val retailerRepository: RetailerRepository? = null
    fun createRetailer(retailer: Retailer): Retailer {
        return retailerRepository?.save(retailer) ?: retailer

    }

    fun findRetailerById(retailerId: String?): Retailer? {
        return retailerRepository?.findByRetailerId(retailerId)

    }

    fun deleteRetailerById(retailerId: String?) {
        if (retailerId != null) {
            retailerRepository?.deleteById(retailerId)
        }
    }

    fun getAllretailers(): List<Any?>? {
        return retailerRepository?.findAll()
    }

}

