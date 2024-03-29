package study.unit.test.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import study.controller.IndexController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author liujunliang
 * @date 2019/7/19
 */
@RunWith(SpringRunner.class)
@WebMvcTest(IndexController.class)
public class MockMVCDemo {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testTest() throws Exception {
        this.mvc.perform(get("/"))
                .andExpect(status().isOk()).andExpect(content().string("Hello1"));
    }
}
