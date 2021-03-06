package de.telran.form.controller;

import de.telran.form.dto.PostDto;
import de.telran.form.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@Slf4j
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Long createNewPost(@RequestBody PostDto postDto) {
        log.info("Request received. posdtDto={}", postDto);
        return postService.createPost(postDto);
    }
}
