package com.stylefeng.guns.modular.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.cbwleft.sms.dao.model.App;
import com.stylefeng.guns.common.controller.BaseController;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.app.service.IAppService;

/**
 * 应用管理控制器
 *
 * @author fengshuonan
 * @Date 2018-04-28 14:33:00
 */
@Controller
@RequestMapping("/app")
public class AppController extends BaseController {

    private String PREFIX = "/app/app/";

    @Autowired
    private IAppService appService;

    /**
     * 跳转到应用管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "app.html";
    }

    /**
     * 跳转到添加应用管理
     */
    @RequestMapping("/app_add")
    public String appAdd() {
        return PREFIX + "app_add.html";
    }

    /**
     * 跳转到修改应用管理
     */
    @RequestMapping("/app_update/{appId}")
    public String appUpdate(@PathVariable Integer appId, Model model) {
        /*App app = appService.selectById(appId);
        model.addAttribute("item",app);
        LogObjectHolder.me().set(app);*/
        return PREFIX + "app_edit.html";
    }

    /**
     * 获取应用管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return appService.selectList(null);
    }

    /**
     * 新增应用管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(App app) {
        //appService.insert(app);
        return SUCCESS_TIP;
    }

    /**
     * 删除应用管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer appId) {
        //appService.deleteById(appId);
        return SUCCESS_TIP;
    }

    /**
     * 修改应用管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(App app) {
        //appService.updateById(app);
        return SUCCESS_TIP;
    }

    /**
     * 应用管理详情
     */
    @RequestMapping(value = "/detail/{appId}")
    @ResponseBody
    public Object detail(@PathVariable("appId") Integer appId) {
        //return appService.selectById(appId);
    	return null;
    }
}
