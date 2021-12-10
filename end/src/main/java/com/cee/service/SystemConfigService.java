package com.cee.service;


import com.cee.model.SystemConfig;

public interface SystemConfigService {

    /**
     * 获取系统配置信息
     * @param tSysCfgnValue
     * @return
     */
    SystemConfig getSystemConfigByValue(String tSysCfgnValue);

}
