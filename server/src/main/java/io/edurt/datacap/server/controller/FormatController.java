package io.edurt.datacap.server.controller;

import io.edurt.datacap.server.common.Response;
import io.edurt.datacap.server.entity.FormatEntity;
import io.edurt.datacap.server.service.FormatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/format")
public class FormatController
{
    private final FormatService formatService;

    public FormatController(FormatService formatService)
    {
        this.formatService = formatService;
    }

    @PostMapping(value = "sql")
    Response<String> formatterSql(@RequestBody FormatEntity configure)
    {
        return this.formatService.formatterSql(configure.getSql());
    }
}
