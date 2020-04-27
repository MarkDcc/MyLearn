package com.example.springjdbc;

import com.example.springjdbc.entity.Spitter;

public interface SpitterRepository {
     void save(Spitter spitter);

     Spitter findSpitter(Long id);
}
