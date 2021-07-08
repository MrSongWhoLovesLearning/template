package com.example.springbootproject.tuser.controller;

import com.example.springbootproject.common.JsonRtn;
import com.example.springbootproject.tuser.po.TUsersPO;
import com.example.springbootproject.tuser.service.TUsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>标题: </p>
 * <p>描述: (TUsers)表接口层</p>
 * <p>类名: TUsersController</p>
 * <p>单位: </p>
 * <p>作者: jia.song</p>
 * <p>邮箱: </p>
 * <p>日期: 2021-07-08 17:02:46</p>
 * <p>系统: </p >
 * <p>模块: </p >
 * <p>版本号: </p>
 */

@Api(tags = {"用户"}, value = "用户")
@RestController
@RequestMapping("/tuser/")
public class TUsersController {
    /**
     * 服务对象
     */
    @Autowired
    private TUsersService tUsersService;

    /**
     * 通过主键查询单条数据
     *
     * @param tUsers 参数实体对象
     * @return 单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")
    @RequestMapping(value = "get_by_id", method = RequestMethod.POST)
    public JsonRtn getById(@RequestBody(required = false) TUsersPO tUsers) {
        return this.tUsersService.getById(tUsers.getId());
    }


    /**
     * 新增数据
     *
     * @param tUsers 参数实体对象
     * @return 实例对象
     */
    @ApiOperation(value = "新增数据")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public JsonRtn add(@RequestBody(required = false) TUsersPO tUsers) {
        return this.tUsersService.add(tUsers);
    }

    /**
     * 修改数据
     *
     * @param tUsers 参数实体对象
     * @return 实例对象
     */
    @ApiOperation(value = "修改数据")
    @RequestMapping(value = "upd", method = RequestMethod.POST)
    public JsonRtn upd(@RequestBody(required = false) TUsersPO tUsers) {
        return this.tUsersService.upd(tUsers);
    }

    /**
     * 通过主键删除数据
     *
     * @param tUsers 参数实体对象
     * @return 是否成功
     */
    @ApiOperation(value = "通过主键删除数据")
    @RequestMapping(value = "del_by_id", method = RequestMethod.POST)
    public JsonRtn delById(@RequestBody(required = false) TUsersPO tUsers) {
        return this.tUsersService.delById(tUsers.getId());
    }

    /**
     * 通过主键逻辑删除数据
     *
     * @param tUsers 参数实体对象
     * @return 是否成功
     */
    @ApiOperation(value = "通过主键逻辑删除数据")
    @RequestMapping(value = "logic_del_by_id", method = RequestMethod.POST)
    public JsonRtn logicDelById(@RequestBody(required = false) TUsersPO tUsers) {
        return this.tUsersService.logicDelById(tUsers.getId());
    }
}
