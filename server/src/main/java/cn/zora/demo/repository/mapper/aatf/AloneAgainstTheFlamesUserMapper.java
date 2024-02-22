package cn.zora.demo.repository.mapper.aatf;

import cn.zora.demo.model.AloneAgainstTheFlamesUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <h3>rpg_center</h3>
 * <h4>cn.zora.demo.repository.mapper</h4>
 * <p>向火独行用户</p>
 *
 * @author Yuhan.Ji
 * @since 2022.10.27
 */
@Mapper
public interface AloneAgainstTheFlamesUserMapper {
    List<AloneAgainstTheFlamesUserEntity> queryAllUser();
}
