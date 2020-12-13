package com.example.conf;

import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class FlowRuleConf implements InitFunc {

    public void init() throws Exception {
        List<FlowRule> rules=new ArrayList<>();

        FlowRule rule=new FlowRule();
        rule.setCount(20);
        rule.setResource("returnOk");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setLimitApp("default");

        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }
}
