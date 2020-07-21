package com.example.restful.api.controller;

import com.example.restful.api.service.LifeService;
import com.example.restful.lib.dataset.Life;
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
@RequestMapping("/api/v0/lives")
public class LifeController {

    private final LifeService lifeService;

    @Autowired
    public LifeController(LifeService lifeService) {
        this.lifeService = lifeService;
    }

    @GetMapping
    public List<Life> findAll() {
        return lifeService.findAll();
    }

    @GetMapping("{id}")
    public Life findOne(final @PathVariable int id) {
        return lifeService.findOne(id);
    }

    @PostMapping
    public void insert(@RequestBody final Life life) {
        lifeService.insert(life);
    }

    @PutMapping("{id}")
    public void update(@PathVariable final int id, @RequestBody final Life life) {
        life.setId(id);
        lifeService.update(life);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable final int id) {
        lifeService.delete(id);
    }

}
