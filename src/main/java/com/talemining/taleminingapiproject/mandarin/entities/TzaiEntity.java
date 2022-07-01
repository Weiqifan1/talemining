package com.talemining.taleminingapiproject.mandarin.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TzaiEntity {
    @Id
    private Long id;
    private String character;
    private Integer frequencyOrdinal;
    private Integer frequencyCount;
}
