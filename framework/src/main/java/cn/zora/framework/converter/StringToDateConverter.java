package cn.zora.framework.converter;

import cn.zora.framework.utils.StringToDateUtil;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 * <h3>framework</h3>
 * <p>字符串转日期</p>
 *
 * @author : zora
 * @since : 2019/11/28
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String dateString) {
        return StringToDateUtil.convert(dateString);
    }
}
