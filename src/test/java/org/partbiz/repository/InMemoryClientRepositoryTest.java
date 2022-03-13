package org.partbiz.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class InMemoryClientRepositoryTest {
    private InMemoryClientRepository repository;

    @BeforeEach
    public void setup(){
        repository = new InMemoryClientRepository(new ArrayList<>());
    }


    @Test
    public void test(){

    }


}
