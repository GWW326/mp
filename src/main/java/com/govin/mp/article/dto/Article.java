package com.govin.mp.article.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
public class Article implements Serializable {
    private Long id;
    private LocalDateTime postDate;
    private String userId;
    private String content;

}
