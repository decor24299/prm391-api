package com.example.restful.api.service;

import com.example.restful.lib.dataset.Life;

import java.util.List;

public interface LifeService {

    List<Life> findAll();

    Life findOne(int id);

    void insert(Life actor);

    void update(Life actor);

    void delete(int id);

}
