package com.ziroom.dao;

import com.ziroom.entity.UserEntity;

/**
 * Created by Yangjy on 2018/3/6.
 */
public interface UserDao  {

    public void saveUser(UserEntity user);

    public UserEntity findUserByUserName(String userName);

    public int updateUser(UserEntity user);

    public void deleteUserById(Long id);

}
