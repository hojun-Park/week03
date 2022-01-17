package com.example.inhastudy.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@NoArgsConstructor
public class RoomRequestDto {
    private String room_title;
    private java.sql.Date re_start_date;
    private java.sql.Date re_end_date;
    private String category;
    private Integer max_join;
    private java.sql.Date ac_start_date;
    private java.sql.Date ac_end_date;
    private String location;
    private String study_count;
    private Integer study_time;
    private String active_type;
    private String info;


    public RoomRequestDto(String room_title, java.sql.Date re_start_date, java.sql.Date re_end_date, String category, Integer max_join, java.sql.Date ac_start_date, java.sql.Date ac_end_date, String location, String study_count, Integer study_time, String active_type, String info) {
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
}
