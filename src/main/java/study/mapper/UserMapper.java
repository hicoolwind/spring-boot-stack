package study.mapper;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
public interface UserMapper {

    Integer getCount();

    String getUserNameById(Long id);
}
