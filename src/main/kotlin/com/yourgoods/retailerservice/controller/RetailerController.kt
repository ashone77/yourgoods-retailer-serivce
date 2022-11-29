package com.yourgoods.retailerservice.controller

import com.yourgoods.retailerservice.model.Retailer
import com.yourgoods.retailerservice.service.RetailerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.collections.ArrayList

@RestController
@RequestMapping("/retailer")
@CrossOrigin(origins = ["*"])
class RetailerController {
    @Autowired
    private val retailerService: RetailerService? = null


    @PostMapping("/")
    fun createRetailer(@RequestBody retailer: Retailer?): Retailer? {
        return retailer?.let { retailerService?.createRetailer(it) }
    }
    @GetMapping("/{id}")
    fun findRetailerById(@PathVariable("id") retailerId: String?): Retailer? {
        return retailerService?.findRetailerById(retailerId)
    }

    @DeleteMapping("/{id}")
    fun deleteRetailerById(@PathVariable("id") retailerId: String?) {
        retailerService?.deleteRetailerById(retailerId)
    }

    @get:GetMapping("/")
    val allretailers: List<Any?>?
        get() {
            val support: List<Retailer> = ArrayList<Retailer>()
            return retailerService?.getAllretailers()
        }
    @PutMapping("/{id}")
    fun updateRetailerById(@PathVariable("id") retailerId: String?, @RequestBody retailer: Retailer): Retailer? {
        val retailerData: Optional<Retailer> = Optional.ofNullable(retailerService?.findRetailerById(retailerId))
        if (retailerData.isPresent()) {

            val _retailer: Retailer = retailerData.get()
            _retailer.setRetailerId(retailer.getRetailerId())
            _retailer.setRetailerName(retailer.getRetailerName())
            _retailer.setRetailerEmail(retailer.getRetailerEmail())
            _retailer.setRetailerPassword(retailer.getRetailerPassword())
            _retailer.setRetailerPhone(retailer.getRetailerPhone())
            _retailer.setRetailerAddress(retailer.getRetailerAddress())
            _retailer.setRetailerPincode(retailer.getRetailerPincode())
            return retailerService?.createRetailer(_retailer)
        }
        return retailerService(HttpStatus.NOT_FOUND)
    }

    private fun retailerService(notFound: HttpStatus): Retailer? {
        return retailerService(HttpStatus.NOT_FOUND)
    }

}