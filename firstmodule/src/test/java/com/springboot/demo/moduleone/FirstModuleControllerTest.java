package com.springboot.demo.moduleone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstModuleControllerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void firstModule() {
        FirstModuleController firstModuleController = new FirstModuleController();
        firstModuleController.firstModule();
    }
}