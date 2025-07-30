package com.yupi.springbootinit.service;

import com.yupi.springbootinit.model.entity.User;
import javax.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子点赞服务测试
 *
 * @author <a href="https://github.com/China-Rainbow-sea/">RainbowSea</a>
 * @from <a href="https://rainbowsea.blog.csdn.net/">RainbowSea15博客</a>
 */
@SpringBootTest
class PostThumbServiceTest {

    @Resource
    private PostThumbService postThumbService;

    private static final User loginUser = new User();

    @BeforeAll
    static void setUp() {
        loginUser.setId(1L);
    }

    @Test
    void doPostThumb() {
        int i = postThumbService.doPostThumb(1L, loginUser);
        Assertions.assertTrue(i >= 0);
    }
}
