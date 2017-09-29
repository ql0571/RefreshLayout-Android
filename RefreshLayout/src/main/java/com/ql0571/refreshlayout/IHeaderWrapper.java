package com.ql0571.refreshlayout;

import android.view.View;

/**
 * desc:头部刷新接口
 * <p>
 * author: qiulie
 * date: 2017/7/24
 */
public interface IHeaderWrapper {

    /**
     * 获取刷新布局
     * @return
     */
    View getHeaderView();

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
