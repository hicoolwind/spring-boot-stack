package study.unit.test.demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * 一般用例演示
 *
 * @author liujunliang
 * @date 2019/7/24
 */
public class StudyJunit4 {

    @Test(expected = NumberFormatException.class)
    public void test1(){
        String a = "1a";
        assertThat(Integer.valueOf(a),instanceOf(Integer.class));
    }
}
