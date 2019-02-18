package com.dgf.mms.modules.common.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dgf.mms.modules.common.entity.BaseEntity;
import com.dgf.mms.modules.common.enums.DelFlag;
import com.dgf.mms.modules.common.enums.ResponseType;
import com.dgf.mms.modules.common.response.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *     控制器基类
 *     封装CRUD
 * </p>
 * @author dengganfeng
 * @since 2019-02-18 21:20:56
 * @param <T>
 */
@RestController
public abstract class BaseController<T extends BaseEntity<T>> {

    @Autowired
    protected IService<T> service;

    /**
     * <p>
     *     增加一条记录
     *
     * </p>
     *
     * @param insertEntity 需要增加的记录对应的实体
     * @return 无论成功失败都返回该实体
     */
    @PostMapping("/save")
    protected ResultDTO save(T insertEntity){
        if(service.save(insertEntity)){
            return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(), insertEntity);
        }
        return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), insertEntity);
    }

    /**
     * <p>
     *     逻辑删除一条记录
     * </p>
     *
     * @param updateEntity 需要删除的实体
     * @return 无论成功失败都返回该实体
     */
    @PostMapping("/delete")
    public ResultDTO delete(T updateEntity){
        updateEntity.setDelFlag(DelFlag.DELETED.getValue());
        if(service.updateById(updateEntity)){
            return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(), updateEntity);
        }
        return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), updateEntity);
    }

    /**
     * <p>
     *     更新一条实体
     * </p>
     * @param updateEntity 修改目标实体
     * @return 更新成功后，查询返回成功记录，失败返回修改目标实体
     */
    @PostMapping("/update")
    public ResultDTO update(T updateEntity){
        if(service.updateById(updateEntity)){
            return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(),
                    service.getOne(new QueryWrapper<>(updateEntity)));
        }
        return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), updateEntity);
    }

    /**
     * <p>
     *     查询一条记录
     * </p>
     * @param getEntity 查询目标实体
     * @return 成功返回查询记录，失败返回查询目标实体
     */
    @PostMapping("/get")
    public ResultDTO get(T getEntity){
        getEntity.setDelFlag(DelFlag.NORMAL.getValue());
        QueryWrapper<T> wrapper = new QueryWrapper<>();
        wrapper.setEntity(getEntity);
        T query;
        try {
           query = service.getOne(wrapper);
        } catch (Exception e){
            e.printStackTrace();
            return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), getEntity);

        }
        return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(), query);
    }

    @PostMapping("/list")
    public ResultDTO list(T listEntity){
        listEntity.setDelFlag(DelFlag.NORMAL.getValue());
        QueryWrapper<T> wrapper = new QueryWrapper<>();
        wrapper.setEntity(listEntity);
        List<T> res;
        try {
            res = service.list(wrapper);
        } catch (Exception e){
            e.printStackTrace();
            return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), listEntity);

        }
        return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(), res);
    }

    @PostMapping("/page")
    public ResultDTO page(T listEntity, Integer current, Integer size){
        listEntity.setDelFlag(DelFlag.NORMAL.getValue());
        QueryWrapper<T> wrapper = new QueryWrapper<>();
        wrapper.setEntity(listEntity);
        IPage<T> page = new Page<>();
        page.setCurrent(current);
        page.setSize(size);
        try {
            page = service.page(page,wrapper);
        } catch (Exception e){
            e.printStackTrace();
            return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), listEntity);

        }
        return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(), page);
    }

}
