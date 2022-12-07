package com.binbin;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import springyuanma.AlexCondition;

@Component
@Conditional(AlexCondition.class)
public class UserService {







    public void test(){
        System.out.println("bean");
    }

}
