package study.service.impl;

import study.mapper.UserMapper;
import study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer getUserCount() {
        return userMapper.getCount();
    }
}
