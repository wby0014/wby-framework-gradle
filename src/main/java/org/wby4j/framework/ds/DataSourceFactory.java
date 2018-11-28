package org.wby4j.framework.ds;

import javax.sql.DataSource;

/**
 * 数据源工厂
 *
 * @Author wubinyu
 * @Date 2018/8/21 17:36.
 */
public interface DataSourceFactory {

    DataSource getDataSource();
}
