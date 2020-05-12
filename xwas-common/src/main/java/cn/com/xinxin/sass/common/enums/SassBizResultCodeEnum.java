package cn.com.xinxin.sass.common.enums;


import com.xinxinfinance.commons.result.BizResultCode;
import org.jetbrains.annotations.Nullable;


/**
 * Created by helloyy on 12/02/2018.
 */
public enum SassBizResultCodeEnum implements BizResultCode {

    // 公用
    SUCCESS("SUCCESS", "成功", "成功"),

    FAIL("FAIL","处理失败","处理失败"),

    SYSTEM_ERROR("SYSTEM_ERROR", "系统异常", "系统繁忙，请稍后再试!"),

    UNKNOWN_ERROR("NTC00002", "未知异常", "系统繁忙，请稍后再试!"),

    ILLEGAL_PARAMETER("NTC00003", "非法参数", "参数不正确，请重新操作!"),

    DATA_NOT_EXIST("NTC00004", "数据不存在", "暂无数据，请稍后再试!"),

    DATA_ALREADY_EXIST("NTC00007", "数据存在", "数据存在,无重复创建!"),

    PARAMETER_NULL("NTC00005", "空参数", "参数为空，请重新操作!"),

    INVALID_SESSION_ID("NTC00005", "session为空", "session为空，请登录操作!"),

    INVALID_TOKEN("NTC00006", "无效的登录口令", "无效的登录口令,请登录操作!"),

    UNAUTHORIZED("UNAUTHORIZED", "无效授权", "无效授权!"),

    NOT_PERMIT_DELETE("NOT_PERMIT_DELETE", "存在关联数据,禁止删除", "存在关联数据,禁止删除"),

    GENERATE_ID_ERROR("GENERATE_ID_ERROR","生成id失败,请稍候再试","生成id失败,请稍候再试"),


        /* Enum end */;


    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误描述
     */
    private final String debugMessage;

    /**
     * 前端提示文案
     */
    private final String alertMessage;


    /**
     *
     * @param debugMessage
     * @param alertMessage
     */
    SassBizResultCodeEnum(String debugMessage, String alertMessage) {
        this.code = this.name();
        this.debugMessage = debugMessage;
        this.alertMessage = alertMessage;
    }

    /**
     * 构造
     *
     * @param alertMessage   前端提示文案
     */
    SassBizResultCodeEnum(final String alertMessage) {
        this.code = this.name();
        this.debugMessage = alertMessage;
        this.alertMessage = alertMessage;
    }

    /**
     *
     * @param code
     * @param debugMessage
     * @param alertMessage
     */
    SassBizResultCodeEnum(String code, String debugMessage, String alertMessage) {
        this.code = code;
        this.debugMessage = debugMessage;
        this.alertMessage = alertMessage;
    }

    /**
     * 根据value获取对应的枚举。
     *
     * @param value 枚举值
     * @return <value>FilmServiceErrors</value>
     */
    static SassBizResultCodeEnum getEnumByCode(final String value) {

        // value为空，返回null
        if (value == null || value.isEmpty()) {
            return null;
        }

        // 遍历
        for (final SassBizResultCodeEnum errEnum : values()) {
            if (value.equals(String.valueOf(errEnum.getCode()))) {
                return errEnum;
            }
        }
        // 找不到匹配的，返回null
        return null;
    }

    // region: adaptor


    // endregion: adaptor



    public String getMessage(){
        return this.alertMessage;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public @Nullable String getAlertMessage() {
        return this.alertMessage;
    }

    @Override
    public @Nullable String getDebugMessage() {
        return this.debugMessage;
    }
}
