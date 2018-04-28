package com.stylefeng.guns.modular.app.service;

import java.util.List;

import com.cbwleft.sms.dao.model.App;

/**
 * <p>
 * 应用表 服务类
 * </p>
 *
 * @author cbwleft123
 * @since 2018-04-28
 */
public interface IAppService {

	List<App> selectList(Object object);

	App selectById(Integer appId);

	int insert(App app);

	int deleteById(Integer appId);

	int updateById(App app);

}
