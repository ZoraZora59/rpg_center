//package cn.zora.framework.configuration;
//
//import cn.zora.framework.converter.StringToDateConverter;
//import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.convert.converter.Converter;
//
//import java.util.Date;
//
///**
// * <h3>framework</h3>
// * <p>插件配置</p>
// *
// * @author : zora
// * @since : 2019/11/28
// */
//@Configuration
//public class PluginConfig {
//    @Bean
//    public Converter<String, Date> stringToDateConverter() {
//        return new StringToDateConverter();
//    }
//
//    /**
//     * 获取乐观锁
//     *
//     * @return mybatisPlus的乐观锁插件
//     */
//    @Bean
//    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
//        return new OptimisticLockerInterceptor();
//    }
//
//    /**
//     * 获取分页插件
//     *
//     * @return mybatisPlus的分页插件
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
//
//}
