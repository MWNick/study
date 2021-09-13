package mans.cleancode.controller;

import mans.cleancode.constants.ActionType;
import mans.cleancode.policy.BrokeragePolicy;
import mans.cleancode.policy.BrokeragePolicyFactory;
import mans.cleancode.policy.PurchaseBrokeragePolicy;
import mans.cleancode.policy.RentBrokeragePolicy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price){
        // TODO: 중개수수료 계산하는 로직
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
