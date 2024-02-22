package cn.zora.demo.configuration;

import cn.zora.demo.repository.mapper.InitMapper;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * <h3>rpg_center</h3>
 * <h4>cn.zora.demo.configuration</h4>
 * <p></p>
 *
 * @author Yuhan.Ji
 * @since 2022.11.03
 */
@Slf4j
@Component
public class DatabaseChecker {
    @Autowired
    private InitMapper initMapper;

    @PostConstruct
    public void checkPoolAvailable() {
        List<Integer> connectionCheckResponse = initMapper.select1();
        if (CollectionUtils.isEmpty(connectionCheckResponse)||connectionCheckResponse.size()!=1||connectionCheckResponse.get(0)!=1){
            log.error("DB初始化失败");
            System.exit(1);
        }
    }
}
