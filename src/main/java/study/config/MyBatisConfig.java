package study.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
@Configuration
@EnableTransactionManagement
@MapperScan("study.mapper")
public class MyBatisConfig {

}
