package com.example.inhastudy1.inhastudy1.controller;

import com.example.inhastudy1.inhastudy1.domain.Room;
import com.example.inhastudy1.inhastudy1.dto.RoomDto;
import com.example.inhastudy1.inhastudy1.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApiController {

    private final RoomRepository roomRepository;

    @PostMapping("/api")
    public Room createRoom(@RequestBody RoomDto dto) {
        Room room = new Room(dto);
        return roomRepository.save(room);
    }
}
