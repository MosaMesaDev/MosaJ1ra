package com.mosamesadev.mosaj1ra

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CreateNewIncidentUtilTest {

    // The input is not valid if:
    // - the username is not filled in
    // - the contact phone number is not filled in
    // - the time+date of start of incident is not filled in
    // - the Configuration Item is not filled in (software X, network Y...)
    // - the Impact is not filled in (1 user, 5 users, all users...)
    // - the description of the incident has less than 10 characters


    @Test
    fun `empty username returns false`(){
        val result = CreateNewIncidentUtil.validateIncidentInput(
            "",
            "123",
            "123",
            "Software X",
            "5 users",
            "There has been an incident"

        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty phone number returns false`(){
        val result = CreateNewIncidentUtil.validateIncidentInput(
            "Test Case",
            "",
            "123",
            "Software X",
            "5 users",
            "There has been an incident"

        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty time + date returns false`(){
        val result = CreateNewIncidentUtil.validateIncidentInput(
            "Test Case",
            "123",
            "",
            "Software X",
            "5 users",
            "There has been an incident"

        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty Configuration Item returns false`(){
        val result = CreateNewIncidentUtil.validateIncidentInput(
            "Test Case",
            "123",
            "123",
            "",
            "5 users",
            "There has been an incident"

        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty Impact returns false`(){
        val result = CreateNewIncidentUtil.validateIncidentInput(
            "",
            "123",
            "123",
            "Software X",
            "",
            "There has been an incident"

        )
        assertThat(result).isFalse()
    }

    @Test
    fun `description length fewer than 10 characters returns false`(){
        val result = CreateNewIncidentUtil.validateIncidentInput(
            "",
            "123",
            "123",
            "Software X",
            "5 users",
            "123456789"

        )
        assertThat(result).isFalse()
    }


    @Test
    fun `Everything filled in correctly returns true`(){
        val result = CreateNewIncidentUtil.validateIncidentInput(
            "Test Case",
            "123",
            "123",
            "Software X",
            "5 users",
            "There has been an incident"

        )
        assertThat(result).isTrue()
    }



}