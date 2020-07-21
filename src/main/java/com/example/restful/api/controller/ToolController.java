package com.example.restful.api.controller;

import com.example.restful.api.service.ToolService;
import com.example.restful.lib.dataset.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v0/tools")
public class ToolController {

    private final ToolService toolService;

    @Autowired
    public ToolController(ToolService toolService) {
        this.toolService = toolService;
    }

    @GetMapping
    public List<Tool> findAll() {
        return toolService.findAll();
    }

    @GetMapping("{id}")
    public Tool findOne(final @PathVariable int id) {
        return toolService.findOne(id);
    }

    @PostMapping
    public void insert(@RequestBody final Tool tool) {
        toolService.insert(tool);
    }

    @PutMapping("{id}")
    public void update(@PathVariable final int id, @RequestBody final Tool tool) {
        tool.setId(id);
        toolService.update(tool);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable final int id) {
        toolService.delete(id);
    }

}
