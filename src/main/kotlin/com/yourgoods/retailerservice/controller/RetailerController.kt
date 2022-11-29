package com.yourgoods.retailerservice.controller

import com.yourgoods.retailerservice.model.Retailer
import com.yourgoods.retailerservice.service.RetailerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/yourgoods/api/retailer/")
class RetailerController {

    @Autowired
    private val retailerService: RetailerService?= null

    @PostMapping("/")
    fun createRetailer(@RequestBody retailer: Retailer?): Unit? {
        return retailer?.let { retailerService?.createRetailer(it) }
    }

    @GetMapping("/")
    fun getAllRetailers(): Unit? {
        return retailerService?.getAllRetailers()
    }

    
}