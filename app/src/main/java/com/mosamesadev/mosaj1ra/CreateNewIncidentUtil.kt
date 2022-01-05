package com.mosamesadev.mosaj1ra

object CreateNewIncidentUtil {

    fun validateIncidentInput(
        userName: String,
        phoneNumber: String,
        timeAndDate: String,
        configurationItem: String,
        impact: String,
        description: String

        ): Boolean {

        if(userName.isEmpty() ){
            return false
        }

        if(phoneNumber.isEmpty() ){
            return false
        }

        if(timeAndDate.isEmpty() ){
            return false
        }
        if(configurationItem.isEmpty() ){
            return false
        }
        if(impact.isEmpty() ){
            return false
        }
        if(description.length < 10  ){
            return false
        }
        return true
    }

}