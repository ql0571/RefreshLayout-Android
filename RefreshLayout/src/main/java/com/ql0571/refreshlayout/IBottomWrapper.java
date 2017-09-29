package com.ql0571.refreshlayout;

import android.view.View;

/**
 * desc:加载更多底部空接口
 * <p>
 * author: qiulie
 * date: 2017/7/24
 */

public interface IBottomWrapper {

    /**
     * 获取无更多布局
     *
     * @return
     */
    View getBottomView();

    /**
     * 显示无更多布局
     */
    void showBottom();
}
