package com.example.restful.api.service.impl;

import com.example.restful.api.service.ToolStatusService;
import com.example.restful.lib.dataset.ToolStatus;
import com.example.restful.lib.mapper.ToolStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolStatusServiceImp implements ToolStatusService {

    private final ToolStatusMapper toolStatusMapper;

    @Autowired
    public ToolStatusServiceImp(ToolStatusMapper toolStatusMapper) {
        this.toolStatusMapper = toolStatusMapper;
    }

    @Override
    public List<ToolStatus> findAll() {
        return toolStatusMapper.findAll();
    }

}
