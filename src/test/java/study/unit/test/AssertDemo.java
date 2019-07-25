package study.unit.test;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author liujunliang
 * @date 2019/7/25
 */
public class AssertDemo {

    @Test
    public void test1(){
        int a = 1;
        assertThat(a, equalTo(1));
    }

    @Test
    public void test2(){
        int a = 1;
        assertEquals(1,a);
    }

}
