package study.unit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author liujunliang
 * @date 2019/7/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StudyMockMvcBusiness {

    @Autowired
    private MockMvc mockMvc;

    /*
    * 验证  获取用户数量接口 必须返回一个数字
    * */
    @Test
    public void testExample1() throws Exception {
        String content = this.mockMvc.perform(get("/api/user/count"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse().getContentAsString();
        Integer count = Integer.valueOf(content);
        assertThat(count, instanceOf(Integer.class));
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testExample2() throws Exception {
        MultiValueMap<String, String> stringMultiValueMap = new LinkedMultiValueMap<>();
        stringMultiValueMap.add("userName","aaa111");
        stringMultiValueMap.add("password","aaa111");
        stringMultiValueMap.add("mobile","15611111111");
        stringMultiValueMap.add("email","aaa@aaa.com");
        stringMultiValueMap.add("nickName","aaaN");
        this.mockMvc.perform(post("/api/user/add").params(stringMultiValueMap))
                .andExpect(status().isOk());
    }



}
