package io.github.zhoujunlin94.meet.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujunlin
 * @date 2025/5/29 21:52
 */
@Tag(name = "服务器信息")
@RestController
@RequestMapping("/v1/api/server")
public class ServerInfoController {

    @Operation(summary = "当前服务器时间戳")
    @GetMapping("/timestamp")
    public Long timestamp() {
        return System.currentTimeMillis();
    }

}
