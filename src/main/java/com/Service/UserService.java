package com.Service;

import com.Bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.jmx.export.annotation.ManagedOperation;

@Mapper
public interface UserService {
    int regist(Users user);
}
