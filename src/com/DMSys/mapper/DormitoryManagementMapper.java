package com.DMSys.mapper;

import com.DMSys.model.DormitoryManagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DormitoryManagementMapper {
    // 添加宿舍管理记录
    public int addDormitoryManagement(DormitoryManagement management);
    // 删除宿舍管理记录
    public int deleteDormitoryManagement(@Param("dormitoryId")int dormitoryId, @Param("dormitoryName")String dormitoryName);
    // 更新宿舍管理记录
    public int updateDormitoryManagement(Map<String, Object> managementMap);
    // 查询所有宿舍管理记录
    public List<DormitoryManagement> getAllDormitoryManagements();
    // 根据id查询宿舍管理记录
    public List<DormitoryManagement> getDormitoryManagementById(DormitoryManagement management);
}