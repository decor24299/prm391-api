package com.example.restful.lib.mapper;

import com.example.restful.lib.dataset.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ActorMapper {

    List<Actor> findAll();

    Actor findOne(int id);

    void insert(@Param("actor") Actor actor);

    void update(@Param("actor") Actor actor);

    void delete(int id);

}
