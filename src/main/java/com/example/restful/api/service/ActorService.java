package com.example.restful.api.service;

import com.example.restful.lib.dataset.Actor;

import java.util.List;

public interface ActorService {

    List<Actor> findAll();

    Actor findOne(int id);

    void insert(Actor actor);

    void update(Actor actor);

    void delete(int id);

}
