package study.form;

import lombok.Data;

/**
 * @author liujunliang
 * @date 2019/7/22
 */
@Data
public class UserAddForm {

    private String userName;
    private String password;
    private String mobile;
    private String email;
    private String nickName;

}
