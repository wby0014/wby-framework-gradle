package org.wby4j.framework.mvc.bean;

import org.wby4j.framework.core.bean.BaseBean;
import org.wby4j.framework.util.CastUtil;

import java.util.Map;

/**
 * 封装请求参数
 *
 * @Author wubinyu
 * @Date 2018/8/22 9:27.
 */
public class Params extends BaseBean {

    private final Map<String, Object> fieldMap;

    public Params(Map<String, Object> fieldMap) {
        this.fieldMap = fieldMap;
    }

    public Map<String, Object> getFieldMap() {
        return fieldMap;
    }

    public String getString(String name) {
        return CastUtil.castString(get(name));
    }

    public double getDouble(String name) {
        return CastUtil.castDouble(get(name));
    }

    public long getLong(String name) {
        return CastUtil.castLong(get(name));
    }

    public int getInt(String name) {
        return CastUtil.castInt(get(name));
    }

    private Object get(String name) {
        return fieldMap.get(name);
    }
}
