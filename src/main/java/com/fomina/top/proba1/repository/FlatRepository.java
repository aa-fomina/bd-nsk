package com.fomina.top.proba1.repository;

import com.fomina.top.proba1.entity.Flat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlatRepository extends JpaRepository<Flat, Integer> {
    @Query("select count(*) from Flat u")
    Integer countFlats();



    @NativeQuery("select f.id, f.level, f.room,f.area, f.price, f.agentid, f.clientid, f.domid from flat f" +
            "    join doma d on d.id = f.domid  " +
            "    join oks o on o.id=d.oksid" +
            "    join metro m on ST_Dwithin(o.geom, m.geom, :distance)")
    List<Flat> findFlatNearMetro(@Param("distance")int distance);


    @Query("select f from Flat f where f.room = ?1")
    List<Flat> findByRoom(Integer room);

    @Query("select f from Flat f where f.doma.year >= ?1")
    List<Flat> findByYear(Integer year);

    @Query("select f from Flat f where f.doma.floor >= ?1")
    List<Flat> findByFloor(Integer floor);

    @Query("select f from Flat f order by f.doma.floor desc limit 1")
    List<Flat> findTallestFlat();

    @NativeQuery("select f.id, f.level, f.room,f.area, f.price, f.agentid, f.clientid, f.domid from flat f" +
            "    join doma on doma.id = f.domid  " +
            "    join oks on oks.id=doma.oksid" +
            " where st_dwithin(oks.geom,(select geom from oks where full_street = :address), 200)")

    List<Flat> findFlatNearAddress(@Param("address")String address);






}
