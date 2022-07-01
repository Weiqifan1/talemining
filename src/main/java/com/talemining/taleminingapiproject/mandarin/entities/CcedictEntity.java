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
public class CcedictEntity {
    @Id
    private Long id;
    private String traditional;
    private String simplified;
    private String pinyin;
    private String english;
}
