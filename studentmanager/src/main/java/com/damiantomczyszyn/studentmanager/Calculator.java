package com.damiantomczyszyn.studentmanager;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int calculateSum( int a, int b)
    {
        return a+b;
    }


}
