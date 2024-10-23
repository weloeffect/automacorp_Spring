package com.emse.spring.automacorp.services;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<RoomEntity> findAll() {
        return roomRepository.findAll();
    }

    public Optional<RoomEntity> findById(Long id) {
        return roomRepository.findById(id);
    }

    public RoomEntity create(RoomEntity roomEntity) {
        return roomRepository.save(roomEntity);
    }

    public RoomEntity update(Long id, RoomEntity updatedRoomEntity) {
        Optional<RoomEntity> existingRoom = roomRepository.findById(id);
        if (existingRoom.isPresent()) {
            RoomEntity roomEntity = existingRoom.get();
            roomEntity.setName(updatedRoomEntity.getName());
            return roomRepository.save(roomEntity);
        } else {
            return null;
        }
    }

    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}
