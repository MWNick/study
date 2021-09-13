package mans.cleancode.policy;

public interface BrokeragePolicy {
    BrokerageRule createBrokerageRule(Long price);

    default Long calculate(Long price){
        // TODO: 가격을 받아서 매매 중개수수료를 계산한다.
        return createBrokerageRule(price).calcMaxBrokerage(price);
    }
}
