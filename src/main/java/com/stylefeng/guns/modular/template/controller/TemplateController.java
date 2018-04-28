package com.stylefeng.guns.modular.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.cbwleft.sms.dao.model.Template;
import com.stylefeng.guns.common.controller.BaseController;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.template.service.ITemplateService;

/**
 * 短信模板控制器
 *
 * @author fengshuonan
 * @Date 2018-04-28 16:17:17
 */
@Controller
@RequestMapping("/template")
public class TemplateController extends BaseController {

    private String PREFIX = "/template/template/";

    @Autowired
    private ITemplateService templateService;

    /**
     * 跳转到短信模板首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "template.html";
    }

    /**
     * 跳转到添加短信模板
     */
    @RequestMapping("/template_add")
    public String templateAdd() {
        return PREFIX + "template_add.html";
    }

    /**
     * 跳转到修改短信模板
     */
    @RequestMapping("/template_update/{templateId}")
    public String templateUpdate(@PathVariable Integer templateId, Model model) {
        Template template = templateService.selectById(templateId);
        model.addAttribute("item",template);
        LogObjectHolder.me().set(template);
        return PREFIX + "template_edit.html";
    }

    /**
     * 获取短信模板列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return templateService.selectList(null);
    }

    /**
     * 新增短信模板
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(Template template) {
        templateService.insert(template);
        return SUCCESS_TIP;
    }

    /**
     * 删除短信模板
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer templateId) {
        templateService.deleteById(templateId);
        return SUCCESS_TIP;
    }

    /**
     * 修改短信模板
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Template template) {
        templateService.updateById(template);
        return SUCCESS_TIP;
    }

    /**
     * 短信模板详情
     */
    @RequestMapping(value = "/detail/{templateId}")
    @ResponseBody
    public Object detail(@PathVariable("templateId") Integer templateId) {
        return templateService.selectById(templateId);
    }
}
