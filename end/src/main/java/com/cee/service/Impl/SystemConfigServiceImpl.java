package com.cee.service.Impl;


import com.cee.dao.SystemConfigMapper;
import com.cee.model.SystemConfig;
import com.cee.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemConfigServiceImpl implements SystemConfigService {

    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public SystemConfig getSystemConfigByValue(String tSysCfgnValue) {
        return systemConfigMapper.getSystemConfigByValue(tSysCfgnValue);
    }
}
