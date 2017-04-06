package com.hotusm.mp;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hotusm.mp.bean.model.WhiteList;
import com.hotusm.mp.mapper.WhiteListMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author luqibao
 * @date 2017/4/5
 */
@ContextConfiguration(value = {"classpath:spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CfgTest {

    @Autowired
    private WhiteListMapper whiteListMapper;
    @Test
    public void testCfg(){
        System.out.println("ok!!!");
    }

    @Test
    public void testList(){
        List<WhiteList> whiteLists= whiteListMapper.selectList(new EntityWrapper<WhiteList>().eq("white_type","tax_payer"));
        System.out.println(whiteLists);
    }

    @Test
    public void testPage(){
        List<WhiteList> whiteLists=whiteListMapper.selectPage(new Page<WhiteList>(1,10),new EntityWrapper<WhiteList>());
        System.out.println(whiteLists);
    }

    @Test
    public void testMultiCondition(){
        List<WhiteList> whiteLists =whiteListMapper.selectList(new EntityWrapper<WhiteList>().eq("white_type","tax_payer").like("cell","6"));
        System.out.println(whiteLists);

    }
}
