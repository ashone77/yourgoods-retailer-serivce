package com.yourgoods.retailerservice.model


import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Column

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="retailer")
class Retailer {

    @Id
    private var retailerKey: String? = null
    private var retailerId: String? = null

    @Column(name = "retailerName")
    private var retailerName: String? = null

    @Column(name = "retailerEmail")
    private var retailerEmail: String? = null

    @Column(name = "retailerPassword")
    private var retailerPassword: String? = null

    @Column(name = "reatilerPhone")
    private var retailerPhone: String? = null

    @Column(name = "retailerAddress")
    private var retailerAddress: String? = null

    @Column(name = "retailerPincode")
    private var retailerPincode: String? = null

    fun Policy() {}
    fun Retailer(retailerId: String?, retailerName: String?, retailerEmail: String?, retailerPassword: String?, retailerPhone: String?, retailerAddress: String?, retailerPincode: String?) {
        this.retailerId = retailerId
        this.retailerName = retailerName
        this.retailerEmail = retailerEmail
        this.retailerPassword = retailerPassword
        this.retailerPhone = retailerPhone
        this.retailerAddress = retailerAddress
        this.retailerPincode = retailerPincode

    }

    fun getRetailerId(): String? {
        return retailerId
    }

    fun setRetailerId(retailerId: String?) {
        this.retailerId = retailerId
    }

    fun getRetailerName(): String? {
        return retailerName
    }

    fun setRetailerName(retailerName: String?) {
        this.retailerName = retailerName
    }

    fun getRetailerEmail(): String? {
        return retailerEmail
    }

    fun setRetailerEmail(retailerEmail: String?) {
        this.retailerEmail = retailerEmail
    }

    fun getRetailerPassword(): String? {
        return retailerPassword
    }

    fun setRetailerPassword(retailerPassword: String?) {
        this.retailerPassword = retailerPassword
    }
    fun getRetailerPhone(): String? {
        return retailerPhone
    }

    fun setRetailerPhone(retailerPhone: String?) {
        this.retailerPhone = retailerPhone
    }

    fun getRetailerAddress(): String? {
        return retailerAddress
    }

    fun setRetailerAddress(retailerAddress: String?) {
        this.retailerAddress = retailerAddress
    }

    fun getRetailerPincode(): String? {
        return retailerPincode
    }

    fun setRetailerPincode(retailerPincode: String?) {
        this.retailerPincode = retailerPincode
    }
    override fun toString(): String {
        return "Retailer(retailerId=$retailerId, retailerName=$retailerName, retailerEmail=$retailerEmail, retailerPassword=$retailerPassword, retailerPhone=$retailerPhone,  retailerAddress=$retailerAddress, retailerPincode=$retailerPincode)"
    }

}