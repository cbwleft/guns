package com.cbwleft.sms.mgr.modular.message.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbwleft.sms.dao.mapper.MessageMapper;
import com.cbwleft.sms.dao.model.Message;
import com.cbwleft.sms.mgr.modular.message.service.IMessageService;

/**
 * <p>
 * 短信表 服务实现类
 * </p>
 *
 * @author cbwleft
 * @since 2018-04-28
 */
@Service
public class MessageServiceImpl implements IMessageService {
	
	@Resource
	private MessageMapper messageMapper;

	@Override
	public Message selectById(Integer messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> selectList(Object object) {
		// TODO Auto-generated method stub
		return messageMapper.selectAll();
	}

	@Override
	public int insert(Message message) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer messageId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(Message message) {
		// TODO Auto-generated method stub
		return 0;
	}

}
