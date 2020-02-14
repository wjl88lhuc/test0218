package com.atguigu.test0129.demotest0129.service.impl;

import com.atguigu.test0129.demotest0129.bean.UserInfo;
import com.atguigu.test0129.demotest0129.mapper.UserInfoMapper;
import com.atguigu.test0129.demotest0129.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    //表示当前 userInfoMapper在容器中
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUserInfo(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateUserInfoByName(UserInfo userInfo) {
        //根据name修改
        Example example = new Example(UserInfo.class);
        //创建修改条件: 第一个参数是要修改与数据库列对应的实体类的字段，第二个参数是要修改成为的值
        example.createCriteria().andEqualTo("name",userInfo.getName());
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void delUserInfo(UserInfo userInfo) {
        userInfoMapper.deleteByPrimaryKey(userInfo.getId());
    }

    @Override
    public void delUserInfoByName(UserInfo userInfo) {
        System.out.println("the name is " + userInfo.getName());
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());
        userInfoMapper.deleteByExample(example);
    }

}
