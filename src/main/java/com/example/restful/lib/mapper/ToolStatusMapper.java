package com.example.restful.lib.mapper;

import com.example.restful.lib.dataset.ToolStatus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ToolStatusMapper {

    List<ToolStatus> findAll();

}
