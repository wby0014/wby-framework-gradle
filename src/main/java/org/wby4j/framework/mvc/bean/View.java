package org.wby4j.framework.mvc.bean;

import org.wby4j.framework.core.bean.BaseBean;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装视图对象
 *
 * @Author wubinyu
 * @Date 2018/8/22 9:23.
 */
public class View extends BaseBean {

    private String path;                 // 视图路径
    private Map<String,Object> data;     // 相关数据

    public View(String path) {
        this.path = path;
        data = new HashMap<>();
    }

    public View data(String key, Object value) {
        data.put(key, value);
        return this;
    }

    public boolean isRedirect() {
        return path.startsWith("/");
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
