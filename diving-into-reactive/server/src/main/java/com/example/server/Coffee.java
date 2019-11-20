package com.example.server;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
class Coffee {

    @Id
    private String id;
    @NonNull
    private String name;
}