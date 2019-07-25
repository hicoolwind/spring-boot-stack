package study.service.impl;

import org.springframework.stereotype.Service;
import study.entity.UserEntity;
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
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(form.getUserName());
        userEntity.setPassword(form.getPassword());
        userEntity.setMobile(form.getMobile());
        userEntity.setEmail(form.getEmail());
        userEntity.setNickName(form.getNickName());
        return userMapper.add(userEntity);
    }
}
