package com.cbwleft.sms.mgr.modular.message.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.cbwleft.sms.dao.model.Message;
import com.cbwleft.sms.mgr.modular.message.service.IMessageService;
import com.stylefeng.guns.common.controller.BaseController;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 短信管理控制器
 *
 * @author cbwleft
 * @Date 2018-04-28 16:31:28
 */
@Controller
@RequestMapping("/message")
public class MessageController extends BaseController {

    private String PREFIX = "/message/message/";

    @Autowired
    private IMessageService messageService;

    /**
     * 跳转到短信管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "message.html";
    }

    /**
     * 跳转到添加短信管理
     */
    @RequestMapping("/message_add")
    public String messageAdd() {
        return PREFIX + "message_add.html";
    }

    /**
     * 跳转到修改短信管理
     */
    @RequestMapping("/message_update/{messageId}")
    public String messageUpdate(@PathVariable Integer messageId, Model model) {
        Message message = messageService.selectById(messageId);
        model.addAttribute("item",message);
        LogObjectHolder.me().set(message);
        return PREFIX + "message_edit.html";
    }

    /**
     * 获取短信管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return messageService.selectList(null);
    }

    /**
     * 新增短信管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(Message message) {
        messageService.insert(message);
        return SUCCESS_TIP;
    }

    /**
     * 删除短信管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer messageId) {
        messageService.deleteById(messageId);
        return SUCCESS_TIP;
    }

    /**
     * 修改短信管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Message message) {
        messageService.updateById(message);
        return SUCCESS_TIP;
    }

    /**
     * 短信管理详情
     */
    @RequestMapping(value = "/detail/{messageId}")
    @ResponseBody
    public Object detail(@PathVariable("messageId") Integer messageId) {
        return messageService.selectById(messageId);
    }
}
