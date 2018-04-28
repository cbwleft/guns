package com.cbwleft.sms.mgr.modular.template.service;

import java.util.List;

import com.cbwleft.sms.dao.model.Template;

/**
 * <p>
 * 短信模板表 服务类
 * </p>
 *
 * @author cbwleft
 * @since 2018-04-28
 */
public interface ITemplateService {

	Template selectById(Integer templateId);

	List<Template> selectList(Object object);

	int insert(Template template);

	int deleteById(Integer templateId);

	int updateById(Template template);

}
