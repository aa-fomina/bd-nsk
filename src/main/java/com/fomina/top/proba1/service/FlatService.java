package com.fomina.top.proba1.service;

import com.fomina.top.proba1.entity.Flat;
import com.fomina.top.proba1.entity.Metro;
import com.fomina.top.proba1.repository.FlatRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@Component
public class FlatService {
    @Autowired
    private FlatRepository flatRepository;

    public Integer count()
    {
        return flatRepository.countFlats();
    }

    public List<Flat> findAll() {
        return flatRepository.findAll();
    }


    public void findByMetro(int distance){
        List<Flat>flats=flatRepository.findFlatNearMetro(distance);
        for(Flat f:flats){
            System.out.println(f);
        }
    }

    public List<Flat> findAllMetro(int distance){return flatRepository.findFlatNearMetro(distance);}
    public List<Flat> findFlatByRoomNum(int room){return flatRepository.findByRoom(room); }

    public List<Flat> findFlatByYear(int year){return flatRepository.findByYear(year); }

    public List<Flat> findFlatByFloor(int floor){return flatRepository.findByFloor(floor); }

    public List<Flat> findTallestByFlat(){return flatRepository.findTallestFlat(); }

    public List<Flat> findFlatByAddress(String address){return flatRepository.findFlatNearAddress(address); }

}
