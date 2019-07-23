package study.service;

import study.form.UserAddForm;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
public interface UserService {

    /**
     * 获取有效用户数量
     * @return 用户数量
     */
    Integer getUserCount();

    /**
     * 添加用户
     * @param form 用户添加参数
     * @return 用户ID
     */
    Integer add(UserAddForm form);
}
