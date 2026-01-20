package ru.practicum.mainservice.event.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.practicum.mainservice.category.CategoryDto;
import ru.practicum.mainservice.user.dto.UserDto;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventDtoShort {
    Long id;
    String annotation;
    CategoryDto category;
    Long confirmedRequests;
    LocalDateTime eventDate;
    UserDto initiator;
    Boolean paid;
    String title;
    Long views;
}