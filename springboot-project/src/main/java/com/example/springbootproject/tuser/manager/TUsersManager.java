package com.example.springbootproject.tuser.manager;

import com.example.springbootproject.tuser.dao.TUsersDao;
import com.example.springbootproject.tuser.entity.TUsersEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>标题: </p>
 * <p>描述: (TUsers)表数据处理类</p>
 * <p>类名: TUsersManager</p>
 * <p>单位: </p>
 * <p>作者: jia.song</p>
 * <p>邮箱: </p>
 * <p>日期: 2021-07-08 17:02:42</p>
 * <p>系统: </p >
 * <p>模块: </p >
 * <p>版本号: </p>
 */
@Service
public class TUsersManager {
    @Autowired
    private TUsersDao tUsersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public TUsersEntity getById(String id) {
        return this.tUsersDao.getById(id);
    }

    /**
     * 查询多条数据
     *
     * @param tUsers 实例对象
     * @return 对象列表
     */
    public List<TUsersEntity> getAllByLimit(TUsersEntity tUsers) {
        return this.tUsersDao.getAllByLimit(tUsers);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUsers 实例对象
     * @return 对象列表
     */
    public List<TUsersEntity> getAll(TUsersEntity tUsers) {
        return this.tUsersDao.getAll(tUsers);
    }

    /**
     * 新增数据
     *
     * @param tUsers 实例对象
     * @return 是否成功
     */
    public boolean add(TUsersEntity tUsers) {
        return this.tUsersDao.add(tUsers) > 0;
    }

    /**
     * 修改数据
     *
     * @param tUsers 实例对象
     * @return 是否成功
     */
    public boolean upd(TUsersEntity tUsers) {
        return this.tUsersDao.upd(tUsers) > 0;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean delById(String id) {
        return this.tUsersDao.delById(id) > 0;
    }

    /**
     * 通过主键逻辑删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean logicDelById(String id) {
        return this.tUsersDao.logicDelById(id) > 0;
    }
}
