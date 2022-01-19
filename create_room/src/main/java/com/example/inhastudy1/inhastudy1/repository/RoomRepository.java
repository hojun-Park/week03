package com.example.inhastudy1.inhastudy1.repository;

import com.example.inhastudy1.inhastudy1.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findRoomByRoomTitle(String roomTitle);
    List<Room> findByRoomTitleContainingIgnoreCase(String roomTitle);
}
