package org.wby4j.framework;

import org.wby4j.framework.core.ConfigHelper;

/**
 * @Author wubinyu
 * @Date 2018/8/15 14:13.
 */
public interface FrameworkConstant {

    String UTF_8 = "UTF-8";

    String CONFIG_PROPS = "wby.properties";
    String SQL_PROPS = "wby-sql.properties";
    String PLUGIN_PACKAGE = "org.wby4j.plugin";

    String JSP_PATH = ConfigHelper.getString("wby.framework.app.jsp_path", "/WEB-INF/jsp/");
    String WWW_PATH = ConfigHelper.getString("wby.framework.app.www_path", "/www/");
    String HOME_PAGE = ConfigHelper.getString("wby.framework.app.home_page", "/index.html");
    int UPLOAD_LIMIT = ConfigHelper.getInt("wby.framework.app.upload_limit", 10);

    String PK_NAME = "id";

}
