package com.mosamesadev.mosaj1ra

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class WorkOnOpenIncidentUtilTest {

    // The viewed/edited incident is not valid if:
    // basics:
    // - the username is not filled in
    // - the contact phone number is not filled in
    // - the username is not filled in
    // - the contact phone number is not filled in
    // - the time+date of start of incident is not filled in
    // - the Configuration Item is not filled in (software X, network Y...)
    // - the Impact is not filled in (1 user, 5 users, all users...)
    // - the description of the incident has less than 10 characters

    // The viewed/edited incident is not valid if:
    // advanced:
    // - the expected resolve time is not filled in
    // - the solution group is not filled in
    // - the state of the incident is New (it has to be Assigned, Resolved, Pending Customer or Follow Up)

    // After saving the changes, each variable should be saved into a new 'history' line with a timestamp. With was x ->is y
    // - If any of the variables do not match the history, then fail the test.
    // - If the timestamp is corrupt, then fail the test.

    // - the
    // - the


    }