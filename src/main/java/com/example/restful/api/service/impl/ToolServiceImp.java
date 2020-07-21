package com.example.restful.api.service.impl;

import com.example.restful.api.service.ToolService;
import com.example.restful.lib.dataset.Tool;
import com.example.restful.lib.mapper.ToolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolServiceImp implements ToolService {

    private final ToolMapper toolMapper;

    @Autowired
    public ToolServiceImp(ToolMapper toolMapper) {
        this.toolMapper = toolMapper;
    }

    @Override
    public List<Tool> findAll() {
        return toolMapper.findAll();
    }

    @Override
    public Tool findOne(int id) {
        return toolMapper.findOne(id);
    }

    @Override
    public void insert(Tool tool) {
        toolMapper.insert(tool);
    }

    @Override
    public void update(Tool tool) {
        toolMapper.update(tool);
    }

    @Override
    public void delete(int id) {
        toolMapper.delete(id);
    }

}
