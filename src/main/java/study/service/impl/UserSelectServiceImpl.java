package study.service.impl;

import org.springframework.stereotype.Service;
import study.mapper.UserMapper;
import study.service.UserSelectService;

import javax.annotation.Resource;

/**
 * @author liujunliang
 * @date 2019/7/19
 */
@Service
public class UserSelectServiceImpl implements UserSelectService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getUserNameById(Long id) {
        return userMapper.getUserNameById(id);
    }

}
