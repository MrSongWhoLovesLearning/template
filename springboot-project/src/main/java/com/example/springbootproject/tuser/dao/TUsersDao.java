package com.example.springbootproject.tuser.dao;

import com.example.springbootproject.tuser.entity.TUsersEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>标题: </p>
 * <p>描述: (TUsers)表数据库访问层</p>
 * <p>类名: TUsersDao</p>
 * <p>单位: </p>
 * <p>作者: jia.song</p>
 * <p>邮箱: </p>
 * <p>日期: 2021-07-08 17:02:34</p>
 * <p>系统: </p >
 * <p>模块: </p >
 * <p>版本号: </p>
 */
public interface TUsersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TUsersEntity getById(@Param("id") String id);

    /**
     * 查询指定行数据
     *
     * @param tUsers 实例对象
     * @return 对象列表
     */
    List<TUsersEntity> getAllByLimit(TUsersEntity tUsers);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUsers 实例对象
     * @return 对象列表
     */
    List<TUsersEntity> getAll(TUsersEntity tUsers);

    /**
     * 新增数据
     *
     * @param tUsers 实例对象
     * @return 影响行数
     */
    Integer add(TUsersEntity tUsers);

    /**
     * 修改数据
     *
     * @param tUsers 实例对象
     * @return 影响行数
     */
    Integer upd(TUsersEntity tUsers);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    Integer delById(@Param("id") String id);

    /**
     * 通过主键逻辑删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    Integer logicDelById(@Param("id") String id);

}
