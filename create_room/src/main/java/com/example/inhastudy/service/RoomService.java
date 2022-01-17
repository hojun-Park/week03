package com.example.inhastudy.service;

import com.example.inhastudy.domain.Room;
import com.example.inhastudy.domain.RoomRepository;
import com.example.inhastudy.models.RoomRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class RoomService {
    private RoomRepository roomRepository;

    @Transactional
    public Long update(Long id, RoomRequestDto roomRequestDto) {
        Room room = roomRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("방이 존재하지 않습니다.")
        );
        room.update(roomRequestDto);
        return room.getId();
    }
}
