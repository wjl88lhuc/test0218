package com.atguigu.test0129.demotest0129.controller;

import com.atguigu.test0129.demotest0129.bean.UserInfo;
import com.atguigu.test0129.demotest0129.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }

    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfo.setLoginName("adminStr");
        userInfo.setPasswd("666666");
        userInfoService.addUserInfo(userInfo);

        //获取添加之后的主键
        //UserInfo实体类的主键上必须有注解才能获取 ：@GeneratedValue(strategy = GenerationType.IDENTITY)
        System.out.println(userInfo.getId());
    }

    @RequestMapping("update/by/id")
    public void updateById(UserInfo userInfo){
        userInfo.setLoginName("0219优秀");
        userInfo.setId("4");
        userInfoService.updateUserInfo(userInfo);
    }

    @RequestMapping("update/by/name")
    public String updateByName(UserInfo userInfo){
        userInfo.setName("0219优秀");
        userInfo.setLoginName("Adminstrator");
        userInfoService.updateUserInfoByName(userInfo);
        return "ok";
    }

    @RequestMapping("delUserInfo/by/id")
    public String delUserInfoById(UserInfo userInfo){
        userInfoService.delUserInfo(userInfo);
        return "ok";
    }

    @RequestMapping("delUserInfo/by/name")
    public String delUserInfoByName(UserInfo userInfo){
        userInfoService.delUserInfoByName(userInfo);
        return "del the userInfo by the name";
    }

}
