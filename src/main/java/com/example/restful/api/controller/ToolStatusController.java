package com.example.restful.api.controller;

import com.example.restful.api.service.ToolStatusService;
import com.example.restful.lib.dataset.ToolStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v0/toolstatus")
public class ToolStatusController {

    private final ToolStatusService toolStatusService;

    @Autowired
    public ToolStatusController(ToolStatusService toolStatusService) {
        this.toolStatusService = toolStatusService;
    }

    @GetMapping
    public List<ToolStatus> findAll() {
        return toolStatusService.findAll();
    }

}
