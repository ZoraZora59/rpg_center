//package cn.zora.framework.config;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * <h3>framework</h3>
// * <p>Swagger配置信息</p>
// *
// * @author : zora
// * @since : 2019/11/28
// */
//@Configuration
//@EnableSwagger2
//@ConditionalOnProperty(name = "swagger.enable",havingValue = "true")
//public class SwaggerConfig {
//    @Bean
//    public Docket allInOneRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("Shop All In One")
//                .apiInfo(new ApiInfoBuilder().title("API接口文档").description("Restful接口").build())
//                .useDefaultResponseMessages(true)
//                .forCodeGeneration(false)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("cn.gk"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//}
