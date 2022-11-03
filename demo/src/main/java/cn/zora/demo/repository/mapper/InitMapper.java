package cn.zora.demo.repository.mapper;

import cn.zora.demo.model.AloneAgainstTheFlamesUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <h3>rpg_center</h3>
 * <h4>cn.zora.demo.repository.mapper.aatf</h4>
 * <p>初始化基础sql相关</p>
 *
 * @author Yuhan.Ji
 * @since 2022.11.03
 */
@Mapper
public interface InitMapper {
    @Select("select 1;")
    List<Integer> select1();
}