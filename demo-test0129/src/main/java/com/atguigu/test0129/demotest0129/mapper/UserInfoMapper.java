package com.atguigu.test0129.demotest0129.mapper;

import com.atguigu.test0129.demotest0129.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

/**
 * mapper泛型表示当前mapper要操作的实体类
 * 数据访问层
 */
public interface UserInfoMapper extends Mapper<UserInfo> {

}
