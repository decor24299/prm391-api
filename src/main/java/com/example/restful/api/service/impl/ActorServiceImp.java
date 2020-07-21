package com.example.restful.api.service.impl;

import com.example.restful.api.service.ActorService;
import com.example.restful.lib.dataset.Actor;
import com.example.restful.lib.mapper.ActorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImp implements ActorService {

    private final ActorMapper actorMapper;

    @Autowired
    public ActorServiceImp(ActorMapper actorMapper) {
        this.actorMapper = actorMapper;
    }

    @Override
    public List<Actor> findAll() {
        return actorMapper.findAll();
    }

    @Override
    public Actor findOne(int id) {
        return actorMapper.findOne(id);
    }

    @Override
    public void insert(Actor actor) {
        actorMapper.insert(actor);
    }

    @Override
    public void update(Actor actor) {
        actorMapper.update(actor);
    }

    @Override
    public void delete(int id) {
        actorMapper.delete(id);
    }

}
