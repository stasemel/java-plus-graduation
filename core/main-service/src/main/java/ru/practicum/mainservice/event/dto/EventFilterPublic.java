package ru.practicum.mainservice.event.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import ru.practicum.mainservice.event.enums.EventSort;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventFilterPublic extends EventFilterBase {

    /**
     * Public
     * Текст для поиска в содержимом аннотации и подробном описании события
     */
    String text;

    // Public
    Boolean paid;

    // Public
    Boolean onlyAvailable;

    /**
     * Public
     * Вариант сортировки: по дате события или по количеству просмотров
     * Available values : EVENT_DATE, VIEWS
     */
    EventSort sort;


}
