package com.study.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor // 인자 없는 생성자 jpa는 인자 없는 생성자가 항상 필요
@AllArgsConstructor // 모든 필드들을 인자로 받아 생성하는 생성자
@RequiredArgsConstructor // 만약 @NotNull과 final필드가 있으면 그걸 인자로 받아 생성
@EqualsAndHashCode
@Data // Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 옆에 모든 어노테이션을 쓴것과 같은 효과
@Builder // AllArgsConstructor처럼 생성자 만들고 필드값 주입 builder의 형식으로
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

