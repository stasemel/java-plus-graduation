package ru.practicum.mainservice.event.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.practicum.mainservice.event.enums.EventStateAction;
import ru.practicum.mainservice.location.LocationDto;
import ru.practicum.mainservice.validation.ValidationGroups;

import java.time.LocalDateTime;

/**
 * EvenDto входная для контролллера
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventDto {

    @Null(groups = ValidationGroups.Create.class)
    Long id;

    @NotBlank(groups = ValidationGroups.Create.class)
    @Size(min = 20, max = 2000)
    String annotation;

    @NotNull(groups = ValidationGroups.Create.class)
    @Positive
    Long category;

    @NotBlank(groups = ValidationGroups.Create.class)
    @Size(min = 20, max = 7000)
    String description;

    @NotNull(groups = ValidationGroups.Create.class)
    LocalDateTime eventDate;

    Long initiator;

    @NotNull(groups = ValidationGroups.Create.class)
    LocationDto location;

    Boolean paid;

    @PositiveOrZero
    Integer participantLimit;

    Boolean requestModeration;

    EventStateAction stateAction;

    @NotNull(groups = ValidationGroups.Create.class)
    @Size(min = 3, max = 120)
    String title;

    Long views;

}
