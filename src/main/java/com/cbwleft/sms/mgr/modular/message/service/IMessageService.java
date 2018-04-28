package com.cbwleft.sms.mgr.modular.message.service;

import java.util.List;

import com.cbwleft.sms.dao.model.Message;

/**
 * <p>
 * 短信表 服务类
 * </p>
 *
 * @author cbwleft
 * @since 2018-04-28
 */
public interface IMessageService {

	Message selectById(Integer messageId);

	List<Message> selectList(Object object);

	int insert(Message message);

	int deleteById(Integer messageId);

	int updateById(Message message);

}
