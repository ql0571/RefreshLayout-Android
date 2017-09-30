package com.ql0571.refreshlayout;

/**
 * desc:头部刷新接口
 * <p>
 * author: qiulie
 * date: 2017/7/24
 */
public interface IHeaderWrapper {
    /**
     * 下拉中
     */
    void pullDown();

    /**
     * 下拉可刷新
     */
    void pullDownReleasable();

    /**
     * 下拉刷新中
     */
    void pullDownRelease();

    /**
     * 下拉完成
     */
    void pullDownFinish();
}
