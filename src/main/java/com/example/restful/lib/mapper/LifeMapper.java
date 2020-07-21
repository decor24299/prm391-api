package com.example.restful.lib.mapper;

import com.example.restful.lib.dataset.Life;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LifeMapper {

    List<Life> findAll();

    Life findOne(int id);

    void insert(@Param("life") Life life);

    void update(@Param("life") Life life);

    void delete(int id);

}
