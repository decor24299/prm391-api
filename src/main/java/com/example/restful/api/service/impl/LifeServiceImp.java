package com.example.restful.api.service.impl;

import com.example.restful.api.service.LifeService;
import com.example.restful.lib.dataset.Life;
import com.example.restful.lib.mapper.LifeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifeServiceImp implements LifeService {

    private final LifeMapper lifeMapper;

    @Autowired
    public LifeServiceImp(LifeMapper lifeMapper) {
        this.lifeMapper = lifeMapper;
    }

    @Override
    public List<Life> findAll() {
        return lifeMapper.findAll();
    }

    @Override
    public Life findOne(int id) {
        return lifeMapper.findOne(id);
    }

    @Override
    public void insert(Life life) {
        lifeMapper.insert(life);
    }

    @Override
    public void update(Life life) {
        lifeMapper.update(life);
    }

    @Override
    public void delete(int id) {
        lifeMapper.delete(id);
    }

}
