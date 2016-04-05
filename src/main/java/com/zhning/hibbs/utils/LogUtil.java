package com.zhning.hibbs.utils;

/**
 * Created by baidu on 16/3/29.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 度学堂log工具类
 *
 * @author dingqinjian
 *
 */
public class LogUtil {

    private static final Logger logger = LoggerFactory.getLogger(LogUtil.class);

    private static final String GENERAL_LOG_FORMAT = "Module:{%s},Class:{%s},Method:{%s},Msg:{%s}";


    /**
     * debug
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void debug(String module, Class target, String method,
                             String msg) {
        if (logger.isDebugEnabled()) {
            logger.debug(String.format(GENERAL_LOG_FORMAT, module,
                    target.getName(),
                    method, msg));
        }
    }

    /**
     * trace
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void trace(String module, Class target, String method,
                             String msg) {
        logger.trace(String.format(GENERAL_LOG_FORMAT, module,
                target.getName(), method, msg));
    }

    /**
     * info
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void info(String module, Class target, String method,
                            String msg) {
        logger.info(String.format(GENERAL_LOG_FORMAT, module, target.getName(),
                method, msg));
    }

    /**
     * warn
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void warn(String module, Class target, String method,
                            String msg) {
        logger.warn(String.format(GENERAL_LOG_FORMAT, module, target.getName(),
                method, msg));
    }

    /**
     * warn
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void warn(String module, Class target, String method,
                            String msg,
                            Throwable ex) {
        logger.warn(String.format(GENERAL_LOG_FORMAT, module, target.getName(),
                method, msg), ex);
    }

    /**
     * error
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void error(String module, Class target, String method,
                             String msg) {
        logger.error(String.format(GENERAL_LOG_FORMAT, module,
                target.getName(), method, msg));
    }

    /**
     * error
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void error(String module, Class target, String method,
                             String msg,
                             Throwable ex) {
        logger.error(String.format(GENERAL_LOG_FORMAT, module,
                target.getName(), method, msg), ex);
    }

    /**
     *
     * @param module
     *            模块
     * @param target
     *            类
     * @param method
     *            方法
     * @param level
     *            日记级别
     * @param msg
     *            消息
     */
    @SuppressWarnings("rawtypes")
    public static void log(String module, Class target, String method,
                           LogLevel level, String msg) {
        switch (level.getLevel()) {
            case 7:
                debug(module, target, method, msg);
                break;
            case 6:
                info(module, target, method, msg);
                break;
            case 4:
                warn(module, target, method, msg);
                break;
            case 3:
                error(module, target, method, msg);
                break;
            case 0:
                trace(module, target, method, msg);
                break;
            default:
                trace(module, target, method, msg);
                break;
        }
    }

    @SuppressWarnings("rawtypes")
    public static void log(String module, Class target, String method,
                           LogLevel level,
                           String format,
                           Object... arguments) {
        String msg = String.format(format, arguments);
        switch (level.getLevel()) {
            case 7:
                debug(module, target, method, msg);
                break;
            case 6:
                info(module, target, method, msg);
                break;
            case 4:
                warn(module, target, method, msg);
                break;
            case 3:
                error(module, target, method, msg);
                break;
            case 0:
                trace(module, target, method, msg);
                break;
            default:
                trace(module, target, method, msg);
                break;
        }
    }

    public static enum LogLevel {
        DEBUG(7),
        INFO(6),
        WARN(4),
        ERROR(3),
        TRACE(0);

        private int level;

        private LogLevel(int level) {
            this.level = level;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

    }
}
