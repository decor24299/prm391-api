package com.example.restful.api.controller;

import com.example.restful.api.service.ActorService;
import com.example.restful.api.service.LoginService;
import com.example.restful.lib.dataset.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v0/actors")
public class ActorController {

    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<Actor> findAll() {
        return actorService.findAll();
    }

    @GetMapping("{id}")
    public Actor findOne(final @PathVariable int id) {
        return actorService.findOne(id);
    }

    @PostMapping
    public void insert(@RequestBody final Actor actor) {
        actorService.insert(actor);
    }

    @PutMapping("{id}")
    public void update(@PathVariable final int id, @RequestBody final Actor actor) {
        actor.setId(id);
        actorService.update(actor);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable final int id) {
        actorService.delete(id);
    }

}
