package com.cee.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cee.model.SystemConfig;
import com.cee.model.User;
import org.apache.ibatis.annotations.Param;

public interface SystemConfigMapper extends BaseMapper<User> {
    /**
     * 获取系统配置信息
     * @param tSysCfgnValue
     * @return
     */
    SystemConfig getSystemConfigByValue(@Param("tSysCfgnValue") String tSysCfgnValue);
}
