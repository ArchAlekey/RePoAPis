package com.example.gmk.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DataBaseService {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean isDBConnection(){
        try{
            jdbcTemplate.execute("Select 1");
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
