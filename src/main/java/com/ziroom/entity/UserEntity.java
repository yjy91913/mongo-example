package com.ziroom.entity;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by Yangjy on 2018/3/6.
 */
@ToString
@Document(collection = "user")
public class UserEntity implements Serializable {
        private static final long serialVersionUID = -3258839839160856613L;

        @Id
        private String id;
        private String userName;
        private String passWord;
        private int age;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassWord() {
                return passWord;
        }

        public void setPassWord(String passWord) {
                this.passWord = passWord;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }
}
