package com.cbwleft.sms.mgr.modular.template.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbwleft.sms.dao.mapper.TemplateMapper;
import com.cbwleft.sms.dao.model.Template;
import com.cbwleft.sms.mgr.modular.template.service.ITemplateService;

/**
 * <p>
 * 短信模板表 服务实现类
 * </p>
 *
 * @author cbwleft
 * @since 2018-04-28
 */
@Service
public class TemplateServiceImpl implements ITemplateService {
	
	@Resource
	private TemplateMapper templateMapper;

	@Override
	public Template selectById(Integer templateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Template> selectList(Object object) {
		// TODO Auto-generated method stub
		return templateMapper.selectAll();
	}

	@Override
	public int insert(Template template) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer templateId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(Template template) {
		// TODO Auto-generated method stub
		return 0;
	}

}
