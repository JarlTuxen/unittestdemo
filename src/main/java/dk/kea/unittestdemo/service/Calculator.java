package dk.kea.unittestdemo.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int addPositiveNumbers(int a, int b){
        if (a<0 || b<0) throw new IllegalArgumentException("Negative numbers not allowed.");
        return a + b;
    }

    //subtract
    public int subtractPositiveNumbers(int a, int b){
        return a - b;
    }

    //multiply

    //divide

}
