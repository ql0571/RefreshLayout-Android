package com.ql0571.refreshlayout;

import android.view.View;

/**
 * desc:加载更多刷新接口
 * <p>
 * author: qiulie
 * date: 2017/7/24
 */
public interface IFooterWrapper {

    /**
     * 获取加载更多布局
     *
     * @return
     */
    View getFooterView();

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
