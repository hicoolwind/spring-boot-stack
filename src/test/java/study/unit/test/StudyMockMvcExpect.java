package study.unit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author liujunliang
 * @date 2019/7/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StudyMockMvcExpect {

    @Autowired
    private MockMvc mockMvc;

    // *******************************************    test StatusResultMatchers

    @Test
    public void testStatusResultExample1() throws Exception {
        this.mockMvc.perform(get("/xxx")).andExpect(status().is(404));
    }

    @Test
    public void testStatusResultExample2() throws Exception {
        this.mockMvc.perform(get("/")).andExpect(status().isOk());
    }

    // post("/") 400 方法不支持
    // status().isBadRequest() 405
    @Test
    public void testStatusResultExample3() throws Exception {
        this.mockMvc.perform(post("/")).andExpect(status().isBadRequest());
    }

    // *******************************************    test ContentResultMatchers

    @Test
    public void testContentResultExample1() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"));
    }

    @Test
    public void testContentResultExample2() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(new MediaType(MediaType.TEXT_PLAIN, Charset.defaultCharset())));
    }


}
