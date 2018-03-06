package com.ziroom.mongo;

import com.ziroom.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * Created by Yangjy on 2018/3/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testSaveUser() throws Exception {
        UserEntity user=new UserEntity();
        user.setUserName("小李");
        user.setPassWord("123456");
        user.setAge(19);
        mongoTemplate.save(user);
    }

    @Test
    public void findUserByUserName(){
        Query query = new Query(Criteria.where("userName").is("小明"));
        UserEntity user = mongoTemplate.findOne(query, UserEntity.class);
        System.out.println(user);
    }

    //分页
    @Test
    public void UpdateByUserName(){

    }

    @Test
    public void selectByPage(){
        Query query = new Query();
        query.skip(1);// 从那条记录开始
        query.limit(5);// 取多少条记录
        List<UserEntity> list = mongoTemplate.find(query, UserEntity.class);
        System.out.println(list);
    }

}
