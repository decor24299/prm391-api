package com.example.restful.api.service;

import com.example.restful.lib.dataset.Tool;

import java.util.List;

public interface ToolService {

    List<Tool> findAll();

    Tool findOne(int id);

    void insert(Tool actor);

    void update(Tool actor);

    void delete(int id);

}
