package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Flores;
import com.example.demo.Repository.florRepository;

@Service 
public class florService {
    @Autowired 
    private florRepository florRepository;

    public List<Flores> getAllFlores() {
        return florRepository.findAll();

    }

    public void saveFlores(Flores flores) {
        florRepository.save(flores);
    }
}
