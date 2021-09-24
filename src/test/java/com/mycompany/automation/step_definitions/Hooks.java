package com.mycompany.automation.step_definitions;

import com.mycompany.automation.utils.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
