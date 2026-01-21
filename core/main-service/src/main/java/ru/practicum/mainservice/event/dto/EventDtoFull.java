package ru.practicum.mainservice.event.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.practicum.mainservice.category.CategoryDto;
import ru.practicum.mainservice.event.enums.EventState;
import ru.practicum.mainservice.location.LocationDto;
import ru.practicum.mainservice.user.dto.UserDto;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventDtoFull {
    Long id;

    @NotBlank
    @Size(min = 20, max = 2000)
    String annotation;

    CategoryDto category;
    Long confirmedRequests;
    LocalDateTime createdOn;
    String description;

    LocalDateTime eventDate;

    UserDto initiator;
    LocationDto location;
    Boolean paid;
    Integer participantLimit;

    LocalDateTime publishedOn;

    Boolean requestModeration;
    EventState state;
    String title;
    Long views;

}
