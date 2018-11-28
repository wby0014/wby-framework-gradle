package org.wby4j.framework.mvc.bean;

import org.wby4j.framework.core.bean.BaseBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装批量文件上传对象
 *
 * @author wubinyu
 * @since 1.0
 */
public class Multiparts extends BaseBean {

    private List<Multipart> multipartList = new ArrayList<Multipart>();

    public Multiparts(List<Multipart> multipartList) {
        this.multipartList = multipartList;
    }

    public int size() {
        return multipartList.size();
    }

    public List<Multipart> getAll() {
        return multipartList;
    }

    public Multipart getOne() {
        return size() == 1 ? multipartList.get(0) : null;
    }
}
