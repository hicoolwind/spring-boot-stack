package study.unit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import study.service.UserSelectService;
import study.service.UserService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Testing with MockMvc
 * @author liujunliang
 * @date 2019/7/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MockBeanDemo {

    @MockBean
    private UserService userService;

    @Autowired
    private UserSelectService userSelectService;

    @Test
    public void exampleTest()  {
        given(this.userService.getUserCount()).willReturn(100);
        System.out.println(this.userService.getUserCount());
        String userName = userSelectService.getUserNameById(1L);
        assertThat(userName).isEqualTo("kcom");
    }


}
