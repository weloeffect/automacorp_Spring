package com.emse.spring.automacorp.services;

@Service
public class WindowService {

    private final WindowRepository windowRepository;
    private final RoomService roomService;

    public WindowService(WindowRepository windowRepository, RoomService roomService) {
        this.windowRepository = windowRepository;
        this.roomService = roomService;
    }

    // Fetch all windows and convert them to DTOs
    public List<Window> findAll() {
        return windowRepository.findAll().stream()
                .map(WindowMapper::of)
                .collect(Collectors.toList());
    }

    // Fetch a window by ID and convert to DTO
    public Optional<Window> findById(Long id) {
        return windowRepository.findById(id)
                .map(WindowMapper::of);
    }

    // Create a new window from DTO
    public Window create(Window dto) {
        RoomEntity roomEntity = roomService.findById(dto.roomId()).orElseThrow(() -> new IllegalArgumentException("Room not found"));
        WindowEntity windowEntity = WindowMapper.toEntity(dto, roomEntity);
        WindowEntity savedEntity = windowRepository.save(windowEntity);
        return WindowMapper.of(savedEntity);
    }

    // Update an existing window
    public Window update(Long id, Window dto) {
        RoomEntity roomEntity = roomService.findById(dto.roomId()).orElseThrow(() -> new IllegalArgumentException("Room not found"));
        Optional<WindowEntity> existingWindowOpt = windowRepository.findById(id);

        if (existingWindowOpt.isPresent()) {
            WindowEntity windowEntity = existingWindowOpt.get();
            windowEntity.setName(dto.name());
            windowEntity.setWindowStatus(dto.windowStatus());
            windowEntity.setRoom(roomEntity);

            WindowEntity updatedEntity = windowRepository.save(windowEntity);
            return WindowMapper.of(updatedEntity);
        } else {
            throw new IllegalArgumentException("Window not found");
        }
    }

    public void deleteWindow(Long id) {
        windowRepository.deleteById(id);
    }
}
