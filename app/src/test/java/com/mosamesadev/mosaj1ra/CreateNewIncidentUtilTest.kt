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

    // TO DO:
    // After saving the initial input, all the variables should be saved into the 'history' of the incident.
    // If any of the variables are empty or not match the history, then fail the test.

    // There should be a history counter, keeping track of how many lines there are saved in the
    // history of this incident. This is to make sure the next change will get a new unique history number.

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