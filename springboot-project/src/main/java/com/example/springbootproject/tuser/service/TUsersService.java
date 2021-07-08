package com.example.springbootproject.tuser.service;

import com.example.springbootproject.common.JsonRtn;
import com.example.springbootproject.tuser.po.TUsersPO;

import java.util.Map;

/**
 * <p>标题: </p>
 * <p>描述: (TUsers)表服务接口</p>
 * <p>类名: TUsersService</p>
 * <p>单位: </p>
 * <p>作者: jia.song</p>
 * <p>邮箱: </p>
 * <p>日期: 2021-07-08 17:02:43</p>
 * <p>系统: </p >
 * <p>模块: </p >
 * <p>版本号: </p>
 */
public interface TUsersService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    JsonRtn getById(String id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUsers 实例对象
     * @return 对象列表
     */
    JsonRtn getAll(TUsersPO tUsers);

    /**
     * 新增数据
     *
     * @param tUsers 实例对象
     * @return 实例对象
     */
    JsonRtn add(TUsersPO tUsers);

    /**
     * 修改数据
     *
     * @param tUsers 实例对象
     * @return 实例对象
     */
    JsonRtn upd(TUsersPO tUsers);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    JsonRtn delById(String id);

    /**
     * 通过主键逻辑删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    JsonRtn logicDelById(String id);
}
