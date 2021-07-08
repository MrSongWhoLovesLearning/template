package com.example.springbootproject.tuser.service.impl;


import com.example.springbootproject.common.JsonRtn;
import com.example.springbootproject.tuser.entity.TUsersEntity;
import com.example.springbootproject.tuser.manager.TUsersManager;
import com.example.springbootproject.tuser.po.TUsersPO;
import com.example.springbootproject.tuser.service.TUsersService;
import com.example.springbootproject.tuser.vo.TUsersVO;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;

/**
 * <p>标题: </p>
 * <p>描述: (TUsers)表服务实现类</p>
 * <p>类名: TUsersServiceImpl</p>
 * <p>单位: </p>
 * <p>作者: jia.song</p>
 * <p>邮箱: </p>
 * <p>日期: 2021-07-08 17:02:44</p>
 * <p>系统: </p >
 * <p>模块: </p >
 * <p>版本号: </p>
 */

@Service
public class TUsersServiceImpl implements TUsersService {
    @Autowired
    private TUsersManager tUsersManager;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public JsonRtn getById(String id) {
        JsonRtn jsonRtn = new JsonRtn();
        TUsersEntity tUsers = this.tUsersManager.getById(id);
        TUsersVO tUsersVO = new TUsersVO();
        BeanUtils.copyProperties(tUsers, tUsersVO);
        jsonRtn.setRtnCode("0");
        jsonRtn.setRtnType("OK");
        jsonRtn.setRtnMsg("获取信息成功");
        jsonRtn.setData(tUsersVO);
        return jsonRtn;
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUsers 实例对象
     * @return 对象列表
     */
    @Override
    public JsonRtn getAll(TUsersPO tUsers) {
        JsonRtn jsonRtn = new JsonRtn();
        TUsersEntity temp = new TUsersEntity();
        BeanUtils.copyProperties(tUsers, temp);
        List<TUsersEntity> tUsersList = this.tUsersManager.getAll(temp);
        List<TUsersVO> tUsersVOList = new LinkedList<>();
        for (TUsersEntity model : tUsersList) {
            TUsersVO tUsersVO = new TUsersVO();
            BeanUtils.copyProperties(model, tUsersVO);
            tUsersVOList.add(tUsersVO);
        }
        jsonRtn.setRtnCode("0");
        jsonRtn.setRtnType("OK");
        jsonRtn.setRtnMsg("获取信息成功");
        jsonRtn.setData(tUsersVOList);
        return jsonRtn;
    }

    /**
     * 新增数据
     *
     * @param tUsers 实例对象
     * @return 实例对象
     */
    @Override
    public JsonRtn add(TUsersPO tUsers) {
        Map<String, Object> map = new HashMap<String, Object>();
        JsonRtn jsonRtn = new JsonRtn();
        TUsersEntity temp = new TUsersEntity();
        BeanUtils.copyProperties(tUsers, temp);
        Boolean addStatus = this.tUsersManager.add(temp);
        jsonRtn.setRtnCode("0");
        jsonRtn.setRtnType("OK");
        jsonRtn.setRtnMsg("操作成功！");
        jsonRtn.setData(addStatus);
        return jsonRtn;
    }

    /**
     * 修改数据
     *
     * @param tUsers 实例对象
     * @return 实例对象
     */
    @Override
    public JsonRtn upd(TUsersPO tUsers) {
        Map<String, Object> map = new HashMap<String, Object>();
        JsonRtn jsonRtn = new JsonRtn();
        TUsersEntity temp = new TUsersEntity();
        BeanUtils.copyProperties(tUsers, temp);
        Boolean updStatus = this.tUsersManager.upd(temp);
        jsonRtn.setRtnCode("0");
        jsonRtn.setRtnType("OK");
        jsonRtn.setRtnMsg("操作成功！");
        jsonRtn.setData(updStatus);
        return jsonRtn;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public JsonRtn delById(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        JsonRtn jsonRtn = new JsonRtn();
        Boolean delStatus = this.tUsersManager.delById(id);
        jsonRtn.setRtnCode("0");
        jsonRtn.setRtnType("OK");
        jsonRtn.setRtnMsg("操作成功！");
        jsonRtn.setData(delStatus);
        return jsonRtn;
    }

    /**
     * 通过主键逻辑删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public JsonRtn logicDelById(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        JsonRtn jsonRtn = new JsonRtn();
        Boolean delStatus = this.tUsersManager.logicDelById(id);
        jsonRtn.setRtnCode("0");
        jsonRtn.setRtnType("OK");
        jsonRtn.setRtnMsg("操作成功！");
        jsonRtn.setData(delStatus);
        return jsonRtn;
    }
}
