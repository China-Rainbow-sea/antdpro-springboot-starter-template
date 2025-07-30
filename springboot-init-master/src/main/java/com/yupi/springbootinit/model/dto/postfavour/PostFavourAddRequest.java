package com.yupi.springbootinit.model.dto.postfavour;

import java.io.Serializable;
import lombok.Data;

/**
 * 帖子收藏 / 取消收藏请求
 *
 * @author <a href="https://github.com/China-Rainbow-sea/">RainbowSea</a>
 * @from <a href="https://rainbowsea.blog.csdn.net/">RainbowSea15博客</a>
 */
@Data
public class PostFavourAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}