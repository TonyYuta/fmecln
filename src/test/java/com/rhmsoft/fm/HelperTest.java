package com.rhmsoft.fm;

import org.testng.annotations.Test;

/**
 * Created by aolyva on 5/10/17.
 */

public class HelperTest extends Environment {

    //
    @Test(enabled = true, groups={"helper", "dryrun", "regression", "all"})
    public void helperTest() {
        int result = helper.qqqGetDeviceSNLength("abc");
        System.out.println("result = " + result);
    }

    @Test(enabled = true, groups = {"helper", "dryrun", "regression", "all"})
    public void deviceCapabilitiesTest() {
        String deviceCapabilitiesInfo = "";
        deviceCapabilitiesInfo = helper.deviceCapabilities("abcdf");
        System.out.println("========= deviceCapabilitiesInfo ======= :" + deviceCapabilitiesInfo);
    }







}