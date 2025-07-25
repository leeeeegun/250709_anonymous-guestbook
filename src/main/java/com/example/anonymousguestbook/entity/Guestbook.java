package com.example.anonymousguestbook.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Guestbook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createdAt;

    // 저장 전 현재 시간 자동으로 설정
    private void setCreatedAt() {
        this.createdAt = LocalDateTime.now();
    }
}
