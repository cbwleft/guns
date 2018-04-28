package com.cbwleft.sms.mgr.modular.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbwleft.sms.dao.mapper.AppMapper;
import com.cbwleft.sms.dao.model.App;
import com.cbwleft.sms.mgr.modular.app.service.IAppService;

/**
 * <p>
 * 应用表 服务实现类
 * </p>
 *
 * @author cbwleft
 * @since 2018-04-28
 */
@Service
public class AppServiceImpl implements IAppService {
	
	@Resource
	private AppMapper appMapper;

	@Override
	public List<App> selectList(Object object) {
		return appMapper.selectAll();
	}

	@Override
	public App selectById(Integer appId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(App app) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer appId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(App app) {
		// TODO Auto-generated method stub
		return 0;
	}

}
