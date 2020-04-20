package cn.com.xinxin.sass.common.enums;

/**
 * @author: zhouyang
 * @created: 17/04/2020.
 * @updater:
 * @description: 性别类型枚举
 */
public enum  GenderTypeEnums {


    MALE("MALE","男性"),

    FEMALE("FEMALE","女性"),

    UNKNOWN("UNKNOWN","未知")

    ;


    private String code;

    private String desc;

    GenderTypeEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据value获取对应的枚举。
     *
     * @param value 枚举值
     * @return <value>FilmServiceErrors</value>
     */
    static GenderTypeEnums getEnumByCode(final String value) {


        // value为空，返回null
        if (value == null || value.isEmpty()) {
            return null;
        }

        // 遍历
        for (final GenderTypeEnums errEnum : values()) {
            if (value.equals(String.valueOf(errEnum.getCode()))) {
                return errEnum;
            }
        }
        // 找不到匹配的，返回null
        return null;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}