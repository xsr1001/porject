package com.cdcoder.entity;

import java.io.Serializable;

/**
 * Created by sirunxu on 2016/11/4.
 * <p>基类 </p>
 */
public abstract class BaseEntity<T,PK> implements Serializable {

    /**
     * 实体编号（唯一标识）
     */
    protected PK id;

    /**
     * 插入之前执行方法，子类实现
     */
    public abstract void preInsert();

    /**
     * 更新之前执行方法，子类实现
     */
    public abstract void preUpdate();

}
