package com.ql0571.refreshlayout;

/**
 * desc:加载更多刷新接口
 * <p>
 * author: qiulie
 * date: 2017/7/24
 */
public interface IFooterWrapper {
    /**
     * 上拉中
     */
    void pullUp();

    /**
     * 上拉可释放
     */
    void pullUpReleasable();

    /**
     * 上拉已释放
     */
    void pullUpRelease();
}
