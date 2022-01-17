package com.example.inhastudy.domain;

import com.example.inhastudy.models.RoomRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String room_title;

    @Column(nullable = false)
    private java.sql.Date re_start_date;

    @Column(nullable = false)
    private java.sql.Date re_end_date;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Integer max_join;

    @Column(nullable = false)
    private java.sql.Date ac_start_date;

    @Column(nullable = false)
    private java.sql.Date ac_end_date;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String study_count;

    @Column(nullable = false)
    private Integer study_time;

    @Column(nullable = false)
    private String active_type;

    @Column(nullable = true)
    private String info;

    public Room(String room_title, java.sql.Date re_start_date, java.sql.Date re_end_date, String category, Integer max_join, java.sql.Date ac_start_date, java.sql.Date ac_end_date, String location, String study_count, Integer study_time, String active_type, String info) {
        this.room_title=room_title;
        this.re_start_date = re_start_date;
        this.re_end_date=re_end_date;
        this.category = category;
        this.max_join=max_join;
        this.ac_start_date=ac_start_date;
        this.ac_end_date=ac_end_date;
        this.location=location;
        this.study_count=study_count;
        this.study_time=study_time;
        this.active_type=active_type;
        this.info=info;
    }

    public Room(RoomRequestDto requestDto) {
        this.room_title = requestDto.getRoom_title();
        this.re_start_date=requestDto.getRe_start_date();
        this.re_end_date = requestDto.getRe_end_date();
        this.category = requestDto.getCategory();
        this.max_join = requestDto.getMax_join();
        this.ac_start_date = requestDto.getAc_start_date();
        this.ac_end_date = requestDto.getAc_end_date();
        this.location = requestDto.getLocation();
        this.study_count= requestDto.getStudy_count();
        this.study_time = requestDto.getStudy_time();
        this.active_type = requestDto.getActive_type();
        this.info = requestDto.getInfo();
    }

    public void update(RoomRequestDto roomRequestDto) {
        this.room_title=roomRequestDto.getRoom_title();
        this.re_start_date = roomRequestDto.getRe_start_date();
        this.re_end_date=roomRequestDto.getRe_end_date();
        this.category = roomRequestDto.getCategory();
        this.max_join=roomRequestDto.getMax_join();
        this.ac_start_date=roomRequestDto.getAc_start_date();
        this.ac_end_date=roomRequestDto.getAc_end_date();
        this.location=roomRequestDto.getLocation();
        this.study_count=roomRequestDto.getStudy_count();
        this.study_time=roomRequestDto.getStudy_time();
        this.active_type=roomRequestDto.getActive_type();
        this.info=roomRequestDto.getInfo();
    }
}
