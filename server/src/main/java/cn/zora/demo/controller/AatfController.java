package cn.zora.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>rpg_center</h3>
 * <h4>cn.zora.demo.controller</h4>
 * <p>向火独行</p>
 *
 * @author Yuhan.Ji
 * @since 2022.11.03
 */
@RequestMapping("/alone-against-the-flames")
@RestController
public class AatfController {
    @GetMapping("/text")
    public ResponseEntity<String> getText(@RequestParam Integer id) {
        id = id == null ? 0 : id;
        return ResponseEntity.ok("hello world" + id);
    }
}
