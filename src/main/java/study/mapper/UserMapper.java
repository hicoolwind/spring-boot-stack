package study.mapper;

import study.entity.UserEntity;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
public interface UserMapper {

    Integer getCount();

    String getUserNameById(Long id);

    Integer add(UserEntity userEntity);
}
