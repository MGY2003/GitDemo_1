package com.DMSys.mapper;

import com.DMSys.model.Dormitory;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DormitoryMapper {
    // 添加宿舍
    public int addDormitory(Dormitory dormitory);
    // 删除宿舍
    public int deleteDormitory(@Param("dormitoryId")int dormitoryId, @Param("dormitoryName")String dormitoryName);
    // 更新宿舍
    public int updateDormitory(Map<String, Object> dormitoryMap);
    // 查询所有宿舍
    public List<Dormitory> getAllDormitories();
    // 根据id查询宿舍
    public List<Dormitory> getDormitoryById(Dormitory dormitory);
}