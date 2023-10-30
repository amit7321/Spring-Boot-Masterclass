package com.example.springbootmasterclass.jsonplaceholder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {

    @GetMapping("/post")
    List<Post> getPosts();

    @GetMapping("post/{postId}")
    Post getPost(@PathVariable("postId") Integer postId);
}
