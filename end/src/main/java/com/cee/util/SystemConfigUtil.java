package com.cee.util;


import com.cee.model.SystemConfig;
import com.cee.service.SystemConfigService;

public class SystemConfigUtil {

    public static final String TEST_JSON_VALUE = "TEST_JSON_VALUE";

    public static final String TEST_JSON_VALUE2 = "TEST_JSON_VALUE2";


    public static SystemConfig getSystemConfigByValue(String value){
        SystemConfig systemConfig =  SpringContextUtil.getBean(SystemConfigService.class).getSystemConfigByValue(value);
        return systemConfig;
    }
}
