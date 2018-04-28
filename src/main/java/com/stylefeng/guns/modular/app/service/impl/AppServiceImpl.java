package com.stylefeng.guns.modular.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbwleft.sms.dao.mapper.AppMapper;
import com.cbwleft.sms.dao.model.App;
import com.stylefeng.guns.modular.app.service.IAppService;

/**
 * <p>
 * 应用表 服务实现类
 * </p>
 *
 * @author cbwleft123
 * @since 2018-04-28
 */
@Service
public class AppServiceImpl implements IAppService {
	
	@Resource
	AppMapper appMapper;

	@Override
	public List<App> selectList(Object object) {
		return appMapper.selectAll();
	}

}
