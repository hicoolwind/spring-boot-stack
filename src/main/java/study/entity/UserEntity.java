package study.entity;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author liujunliang
 * @date 2019/7/24
 */
@Data
public class UserEntity {

    private Long id;
    private String userName;
    private String password;
    private String mobile;
    private String email;
    private String nickName;
    private boolean deleted = false;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private DateTime updatedAt = DateTime.now();

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private DateTime createdAt = DateTime.now();
}
