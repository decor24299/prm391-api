package com.example.restful.lib.mapper;

import com.example.restful.lib.dataset.Tool;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ToolMapper {

    List<Tool> findAll();

    Tool findOne(int id);

    void insert(@Param("tool") Tool tool);

    void update(@Param("tool") Tool tool);

    void delete(int id);

}
