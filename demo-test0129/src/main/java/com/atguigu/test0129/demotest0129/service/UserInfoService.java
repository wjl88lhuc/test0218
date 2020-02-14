package com.atguigu.test0129.demotest0129.service;

import com.atguigu.test0129.demotest0129.bean.UserInfo;

import java.util.List;

//业务逻辑层
public interface UserInfoService {
    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo>  findAll();

    /**
     * 插入
     * @param userInfo
     */
    void addUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void updateUserInfoByName(UserInfo userInfo);

    void delUserInfo(UserInfo userInfo);

    void delUserInfoByName(UserInfo userInfo);
}
