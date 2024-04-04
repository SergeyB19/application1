package com.example.application1.controller;


import com.example.application1.model.request.RequestDTO;
import com.example.application1.response.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("response")
public class ResponseController {

    @GetMapping
    public Response getResponse() {
        return new Response("Hi from application1");
    }

    @PostMapping
    public String getName(@RequestBody RequestDTO requestDTO) {
        return "Hi from application1 " + requestDTO.getName();
    }
}
