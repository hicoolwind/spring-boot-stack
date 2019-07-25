package study.unit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * 参数化测试
 *
 * 1 @RunWith(Parameterized.class)
 * 2 @Parameterized.Parameters
 * 3 @Test
 *
 * @author liujunliang
 * @date 2019/7/24
 */
@RunWith(Parameterized.class)
public class StudyJunit4Param {

    private static final Pattern NUMBER_PATTEN = Pattern.compile("^\\d+$");

    private String number1;

    public StudyJunit4Param(String number1) {
        this.number1 = number1;
    }

    @Parameterized.Parameters
    public static Collection initData(){
        return Arrays.asList("1a","2","3");
    }

    @Test
    public void test1(){
        assertThat(NUMBER_PATTEN.matcher(String.valueOf(number1)).find()).isEqualTo(true);
    }
}
