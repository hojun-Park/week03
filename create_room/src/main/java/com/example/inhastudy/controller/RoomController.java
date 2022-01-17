package com.example.inhastudy.controller;

import com.example.inhastudy.domain.Room;
import com.example.inhastudy.domain.RoomRepository;
import com.example.inhastudy.models.RoomRequestDto;
import com.example.inhastudy.service.RoomService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RoomController {
    private final RoomRepository roomRepository;
    private final RoomService roomService;

    @PostMapping("/api/rooms")
    public Room createRoom(@RequestBody RoomRequestDto roomRequestDto) {
        Room room = new Room(roomRequestDto);

        return roomRepository.save(room);
    }

    @GetMapping("/api/rooms")
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    @DeleteMapping("/api/rooms/{id}")
    public Long deleteRoom(@PathVariable Long id) {
        roomRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/rooms/{id}")
    public Long updateRoom(@PathVariable Long id, @RequestBody RoomRequestDto roomRequestDto) {
        roomService.update(id, roomRequestDto);
        return id;
    }
}
