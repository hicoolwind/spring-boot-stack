package study.service.impl;

import org.springframework.stereotype.Service;
import study.form.UserAddForm;
import study.mapper.UserMapper;
import study.service.UserService;

import javax.annotation.Resource;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Integer getUserCount() {
        return userMapper.getCount();
    }

    @Override
    public Integer add(UserAddForm form) {

        return userMapper.add(form);
    }
}
