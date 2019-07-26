package study.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * 系统配置
 *
 * @author liujunliang
 * @date 2019/7/26
 */
@Component
@ConfigurationProperties
@Data
public class SysProp {

    String systemName;

}
